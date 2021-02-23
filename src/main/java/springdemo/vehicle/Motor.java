package springdemo.vehicle;

import springdemo.engine.BMWEngine;
import springdemo.engine.Engine;
import springdemo.vehicle.Vehicle;

public class Motor implements Vehicle {
    private Engine engine;
    private String brand;

    @Override
    public void move() {
        System.out.println("Motor run with 2 wheels");
        engine.brandOfEngine();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }
}
