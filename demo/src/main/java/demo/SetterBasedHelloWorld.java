package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedHelloWorld {
    private HelloWorldInterface helloWorld;

    @Autowired
    public void setHelloWorld(HelloWorldInterface helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void printMessage() {
        this.helloWorld.sayHello();
    }
}
