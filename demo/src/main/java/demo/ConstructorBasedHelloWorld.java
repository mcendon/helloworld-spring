package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedHelloWorld {
    private HelloWorldInterface helloWorld;

    @Autowired
    public ConstructorBasedHelloWorld(HelloWorldInterface helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void printMessage() {
        this.helloWorld.sayHello();
    }
}
