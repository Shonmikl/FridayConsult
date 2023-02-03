package _03_02_2023.skipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListEx2 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set =
                new ConcurrentSkipListSet<>();

        set.add(78);
        set.add(1);
        set.add(8);
        set.add(7);
        set.add(778);
        set.add(728);

        System.out.println("ConcurrentSkipListSet: " + set);

        System.out.println("The highest element: " + set.last());

        System.out.println("The first element: " + set.pollFirst());
    }
}
