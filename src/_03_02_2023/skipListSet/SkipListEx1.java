package _03_02_2023.skipListSet;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListEx1 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set =
                new ConcurrentSkipListSet<>();

        set.add(78);
        set.add(64);
        set.add(12);
        set.add(8);
        set.add(45);


        System.out.println("ConcurrentSkipListSet: " + set);

        ConcurrentSkipListSet<Integer> set1 =
                new ConcurrentSkipListSet<>(set);

        System.out.println("ConcurrentSkipListSet1: " + set1);

        ConcurrentSkipListSet<String> set2 =
                new ConcurrentSkipListSet<>();

        set2.add("Apple");
        set2.add("Lemon");
        set2.add("Banana");
        set2.add("Apple");

        Iterator<String> itr = set2.iterator();
        System.out.println("Fruits Set: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}