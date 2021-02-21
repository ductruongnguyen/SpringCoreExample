package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
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
        Vehicle vehicle2 = context2.getBean("myMotor", Vehicle.class);
        // call methods on the bean
        vehicle2.move();
        // close the context
        context.close();
    }
}
