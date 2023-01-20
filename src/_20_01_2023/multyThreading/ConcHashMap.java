package _20_01_2023.multyThreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "q");
        map.put(2, "a");
        map.put(3, "s");
        map.put(4, "d");
        map.put(5, "f");
        map.put(6, "g");

        System.out.println(map);

        Thread thread1 = new Thread(()-> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        });

        Thread thread2 = new Thread(()-> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.remove(6);
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(map);
    }
}
