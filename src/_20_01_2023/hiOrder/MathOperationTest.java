package _20_01_2023.hiOrder;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MathOperationTest {
    SumUtils openUtils = new SumUtils();

    @Test
    public void shouldAddOns() {
        //Assertions.assertEquals(5, openUtils.sum(new IdentityOperation(), 3, 2));
        Assertions.assertEquals(5, openUtils.sum(a -> a, 3, 2));
    }

    @Test
    public void shouldGetSumOfSquareOfTwoNumbers() {
        //Assertions.assertEquals(13, openUtils.sum(new SquareOperation(), 3, 2));
        Assertions.assertEquals(13, openUtils.sum(a -> a * a, 3, 2));
    }

    @Test
    public void shouldGetSumOfQubeOfTwoNumbers() {
        //Assertions.assertEquals(35, openUtils.sum(new QubeOperation(), 3,2));
        Assertions.assertEquals(35, openUtils.sum(a -> a * a * a, 3, 2));
    }

    @Test
    public void verifyFunction() {
        BiFunction<Integer, Integer, String> sum = (a, b) -> Integer.toString(a +b);
        Consumer<String> print = System.out::println;
        print.accept("!!!!");

        Supplier<String> supplier = () -> "****";
        System.out.println(sum.apply(1, 2));
        System.out.println(supplier.get());

        Predicate<Integer> testEvent = a -> a%2 == 0;
        System.out.println(testEvent.test(3));
        System.out.println(testEvent.test(4));
    }
}