package ua.company.auto.engine;

public class BrokenEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Бах");
    }
}
