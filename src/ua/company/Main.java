package ua.company;

import ua.company.auto.BrokenCar;
import ua.company.auto.Car;
import ua.company.auto.SportCar;
import ua.company.auto.engine.BrokenEngine;
import ua.company.auto.engine.SportEngine;

public class Main {

    public static void main(String... args) {

        Car sportCar = new SportCar(new SportEngine());
        Car brokenCar = new BrokenCar(new BrokenEngine());

        sportCar.drive();
        brokenCar.drive();

    }
}
