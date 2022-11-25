package _25_11_2022;

import java.util.function.Function;

public class IdentityEx {
    public static void main(String[] args) {
        Function<Integer, Integer> fun = Function.identity();
        System.out.println(fun.apply(100));
        // как в стрим положить identity()?
    }
}
