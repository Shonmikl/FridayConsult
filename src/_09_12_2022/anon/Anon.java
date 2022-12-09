package _09_12_2022.anon;

public class Anon {
    public static void main(String[] args) {
//        class Plus implements Math2 {
//            @Override
//            public int get(int a, int b) {
//                return a + b;
//            }
//        }
//        Plus plus = new Plus();
//        System.out.println(plus.get(11, 12));

        Math2 math2 = new Math2() {
            @Override
            public int get(int a, int b) {
                return a + b;
            }

//            @Override
//            public int get2(int a, int b) {
//                return 0;
//            }
        };

        System.out.println(math2.get(11, 12));
    }
}

interface Math2 {
    int get(int a, int b);
//    int get2(int a, int b);
}
