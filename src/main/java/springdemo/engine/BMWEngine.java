package springdemo.engine;

import springdemo.engine.Engine;

public class BMWEngine implements Engine {
    @Override
    public void brandOfEngine() {
        System.out.println("This vehicle has BMW engine inside");
    }
}
