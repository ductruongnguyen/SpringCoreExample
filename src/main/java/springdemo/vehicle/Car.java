package springdemo.vehicle;

import springdemo.engine.BMWEngine;
import springdemo.engine.Engine;
import springdemo.vehicle.Vehicle;

public class Car implements Vehicle {

    private Engine bmwEngine;

    public Car(Engine bmwEngine) {
        this.bmwEngine = bmwEngine;
    }

    @Override
    public void move() {
        System.out.println("Car move with 4 wheels and ...");
        bmwEngine.brandOfEngine();
    }
}
