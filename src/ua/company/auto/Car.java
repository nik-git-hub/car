package ua.company.auto;

import ua.company.auto.engine.Engine;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void drive(){
        getEngine().start();
     }
}
