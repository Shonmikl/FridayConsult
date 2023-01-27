package _27_01_2023.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAL {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>(); //Bank Account
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        arrayList.add("a");
        arrayList.add("w");
        arrayList.add("e");
        arrayList.add("@@@@@@@");
        arrayList.add("t");
        arrayList.add("y");

        Thread thread1 = new Thread(() -> {
            Iterator<String> iterator = arrayList.iterator();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arrayList.remove(3);
            arrayList.add("!!!");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(arrayList);
    }
}