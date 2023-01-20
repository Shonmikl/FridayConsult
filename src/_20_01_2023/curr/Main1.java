package _20_01_2023.curr;

import java.util.function.Function;

/**
 * Функция с двумя параметрами
 * для умножения двух чисел.
 */
public class Main1 {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> c
                = u -> v -> u * v;
        System.out.println("Result: " + c.apply(15).apply(13));
    }
}