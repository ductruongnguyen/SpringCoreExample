package springdemo.vehicle;

import springdemo.engine.BMWEngine;
import springdemo.engine.Engine;
import springdemo.vehicle.Vehicle;

public class Motor implements Vehicle {
    private Engine engine;

    @Override
    public void move() {
        System.out.println("Motor run with 2 wheels");
        engine.brandOfEngine();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
