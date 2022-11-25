package _25_11_2022.fi;

import java.util.Arrays;
import java.util.function.Function;

public class AndThenEx {
    public static void main(String[] args) {
        Function<String, String[]> function1 = f1 -> f1.split(" ");
        Function<String[], int[]> function2 = AndThenEx::getLength;
        Function<String, int[]> function3 = function1.andThen(function2);

        int[] result = function3.apply("The Best Team  i have  ever seen");
        System.out.println(Arrays.toString(result));
    }

    public static int[] getLength(String [] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i].length();
        }
        return result;
    }
}