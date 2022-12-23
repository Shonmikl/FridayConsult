package _16_12_2022.stat;

public class StatEx {

    static {
        System.out.println("Static init block");
    }

    {
        System.out.println("Non static");
    }

    public StatEx() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new StatEx();

    }
}