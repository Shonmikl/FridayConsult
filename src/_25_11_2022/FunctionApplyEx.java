package _25_11_2022;

import java.util.function.Function;

public class FunctionApplyEx {
    public static void main(String[] args) {
        Function<Integer, String> function =
                i -> {
            String result = "Zero";
            if(i > 0) {
                result = "Positive";
            } else if (i < 0) {
                result = "Negative";
            }
            return result;
                };

        System.out.println(function.apply(-10));
        System.out.println(function.apply(0));
        System.out.println(function.apply(10));
    }
}