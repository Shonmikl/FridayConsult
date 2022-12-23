package _23_12_2022.forEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? super SportCar> cars = new ArrayList<>();
        Car car = new Car();
       // cars.add(car);
    }
}


class Car {

}

class SportCar extends Car {

}