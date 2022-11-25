package _25_11_2022.fi;

import java.util.function.Function;

public class ComposeEx {
    public static void main(String[] args) {
        Function<String, String> function1 = f1 -> f1.replaceAll("[^A-Za-z]", "");
        Function<String, Integer> function2 = f2 -> f2.length();
        Function<String, Integer> function3 = function2.compose(function1);

        String text = "The Best Team  i have     ever  seen";
        System.out.println(function3.apply(text));
    }
}