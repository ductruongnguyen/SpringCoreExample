package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.vehicle.Motor;
import springdemo.vehicle.Vehicle;

public class SpringApp {
    public static void main(String[] args) {
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve the bean from spring container
        Vehicle vehicle = context.getBean("myCar", Vehicle.class);
        // call methods on the bean
        vehicle.move();
        // close the context
        context.close();

        // load the Spring configuration file
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve the bean from spring container
        Motor vehicle2 = context2.getBean("myMotor", Motor.class);
        // call methods on the bean
        vehicle2.move();
        System.out.println(vehicle2.getBrand());
        // close the context
        context.close();
    }
}
