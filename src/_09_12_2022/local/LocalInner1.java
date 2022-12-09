package _09_12_2022.local;

import lombok.Getter;
import lombok.Setter;

public class LocalInner1 {

    public static void main(String[] args) {
        Math1 math1 = new Math1();
        math1.getResult();
    }
}

class Math1 {
    public void getResult() {
//        int num1 = 11;
//        num1 = 44;
        @Getter
        @Setter
        class Delenie {
            private double num1;
            private double num2;

            public double getDivide() {
                return num1 / num2;
            }

            public double getOstatok() {
                return num1 % num2;
            }
        }

        Delenie delenie = new Delenie();
        // delenie.setNum1(15);
        delenie.setNum2(4);
        // System.out.println("Num1: " + delenie.getNum1());
        System.out.println("Num2: " + delenie.getNum2());
        System.out.println("Divide: " + delenie.getDivide());
        System.out.println("%: " + delenie.getOstatok());
    }
}