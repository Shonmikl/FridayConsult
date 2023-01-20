package _20_01_2023.methodRef;

public class MR1 {
    public static void main(String[] args) {
        me2(MR1::testMethod);
    }

    public static void testMethod() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }

    public static void me2(Inter inter) {
        System.out.println(0);
        inter.set();
    }
}

@FunctionalInterface
interface Inter1 {
    void set();
}