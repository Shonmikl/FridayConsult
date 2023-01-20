package _20_01_2023.curr;

import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        Function<String, Function<String, String>>
                c = u -> v -> u + v;
        System.out.println("Result: " + c.apply("Hi").apply("!!"));
    }
}