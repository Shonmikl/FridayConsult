package _18_11_2022.students;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    static Random random = new Random();
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 1_000; i++) {
            list.add(random.nextInt(22));
        }

        long time = System.currentTimeMillis();
        double sum = list.parallelStream().reduce(Integer::sum).get();
        System.out.println(System.currentTimeMillis() - time);
    }
}