package _09_12_2022.inner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    @ToString
    @AllArgsConstructor
    public class Engine {
        private int horsePower;
        //public final static int f = 5;
    }
}

class Test {
    public static void main(String[] args) {
//        Car car = new Car("White", 4);
//        Car.Engine engine = car.new Engine(500);
//        Car.Engine engine1 = new Car("ORANGE", 2).new Engine(222);
        Car car = new Car("B", 2, 99);
        System.out.println(car.getEngine());

        Car.Engine newEng = car.getEngine();
    }
}