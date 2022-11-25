package _25_11_2022.bifunc;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThenBiFuncEx {
    public static void main(String[] args) {
        BiFunction<String, String, String[]> function1 = (f1, f2) -> f1.split(f2);
        Function<String[], String> function2 = f -> String.join("", f);
        BiFunction<String, String, String> function3 = function1.andThen(function2);

        String text = "The Best Team  i have  ever seen";
        String regEx = "{1,}\s";

        String result = function3.apply(text, regEx);
        System.out.println(result);
    }
}
