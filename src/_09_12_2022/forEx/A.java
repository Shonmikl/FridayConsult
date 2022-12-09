package _09_12_2022.forEx;

public class A implements B {

    @Override
    public void getB() {

    }

    @Override
    public void getC() {

    }
}

interface B extends C {
    void getB();
}

interface C {
    void getC();
}
