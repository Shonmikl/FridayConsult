package _20_01_2023.curr;

import java.util.function.Function;

/**
 * fun1 fun2 fun3
 * 2x+3y+5z
 */
public class Main {
    public static int fun1() {
        return 10;
    }

    public static int fun2() {
        return 20;
    }

    public static int fun3() {
        return 30;
    }

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> c =
           x -> y -> z -> 2 * x + 3 * y + 5 * z;
        System.out.println("Result: " + c.apply(fun1()).apply(fun2()).apply(fun3()));
    }
}