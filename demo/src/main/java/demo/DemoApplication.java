package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        ConstructorBasedHelloWorld constructorBasedHelloWorld = (ConstructorBasedHelloWorld) ctx.getBean("constructorBasedHelloWorld");
        constructorBasedHelloWorld.printMessage();

        SetterBasedHelloWorld setterBasedHelloWorld = (SetterBasedHelloWorld) ctx.getBean("setterBasedHelloWorld");
        setterBasedHelloWorld.printMessage();
    }
}
