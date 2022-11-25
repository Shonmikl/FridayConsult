package _25_11_2022;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.IntStream;

public class SpliteratorEx {
    public static void main(String[] args) {
        final int MAX = 32;
        List<Integer> test = IntStream.range(1, MAX + 1).boxed().toList();
//        test.parallelStream()
//                .forEach(i -> {
//                    System.out.println("Start " + Thread.currentThread().getId() + " : " + i);
//                    try {
//                        Thread.sleep(1500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Finish " + Thread.currentThread().getId() + " : " + i);
//                });

//        for (Iterator<Integer> it = test.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }


        Spliterator<Integer> sp1 = test.spliterator();
        Spliterator<Integer> sp2 = sp1.trySplit();
        Spliterator<Integer> sp3 = sp1.trySplit();
        Spliterator<Integer> sp4 = sp2.trySplit();
        Spliterator<Integer> sp5 = sp3.trySplit();
        Spliterator<Integer> sp6 = sp4.trySplit();
        Spliterator<Integer> sp7 = sp5.trySplit();
        Spliterator<Integer> sp8 = sp6.trySplit();

//        Spliterator<Integer> sp9 = sp8.trySplit();

        //sp1.tryAdvance(System.out::println);
        System.out.println("//////////////////");
        sp1.forEachRemaining(System.out::println);
//        System.out.println("\n****************************");
//        sp2.forEachRemaining(System.out::println);
//        System.out.println("\n****************************");
//        sp3.forEachRemaining(System.out::println);
//        System.out.println("\n****************************");
//        sp4.forEachRemaining(System.out::println);
//        System.out.println("\n****************************");
//        sp5.forEachRemaining(System.out::println);
//        System.out.println("\n****************************");
//        sp6.forEachRemaining(System.out::println);
//        System.out.println("\n****************************");
//        sp7.forEachRemaining(System.out::println);
//        System.out.println("\n****************************");
//        sp8.forEachRemaining(System.out::println);

//        System.out.println("\n****************************");
//        sp9.forEachRemaining(System.out::println);
    }
}