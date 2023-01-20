package _20_01_2023.hiOrder;

public class QubeOperation implements Operation {
    @Override
    public int apply(int a) {
        return a * a * a;
    }
}