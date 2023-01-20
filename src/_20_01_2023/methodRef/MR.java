package _20_01_2023.methodRef;

public class MR {
    public static void main(String[] args) {
        me1(()-> {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        });
        System.out.println(4);
    }



    public static void me1(Inter inter) {
        System.out.println(0);
        inter.set();
    }
}

@FunctionalInterface
interface Inter {
    void set();
}