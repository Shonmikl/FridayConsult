package _09_12_2022.nested;

import _09_12_2022.inner.WheelBrand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@ToString
@Getter
@Setter
public class Car {
    private String color;
    private int doorCount;
    private Engine engine;
    private Wheel wheel;
    private static int a;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = new Engine(222);
        this.wheel = new Wheel(4, 22, WheelBrand.NOKIAN);
    }

    @ToString
    @AllArgsConstructor
    public static class Engine {
        int horsePower;
        void get() {
            System.out.println(a);//a has to be only static context
        }
    }

    @AllArgsConstructor
    public static class Wheel {
        int wheelNumber;
        int inch;
        WheelBrand wheelBrand;
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(188);
      //  System.out.println(engine);

        //Car.Engine engine1 = car.new Engine(500);

//        Car car = new Car("BLACK", 2, engine);
//        System.out.println(car);


//        System.out.println(car.getEngine());
//
//        Car.Engine engine1 = car.getEngine();
    }
}

class A extends Car.Engine {

    public A(int horsePower) {
        super(horsePower);
    }
}
