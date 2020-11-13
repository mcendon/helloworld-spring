package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServicePortuguese;
    private HelloWorldService helloWorldServiceGerman;

    //@Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    //@Autowired
    //@Qualifier("portuguese")
    public void setHelloWorldServicePortuguese(HelloWorldService helloWorldServicePortuguese) {
        this.helloWorldServicePortuguese = helloWorldServicePortuguese;
    }

    //@Autowired
    //@Qualifier("helloWorldServiceGermanImpl")
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    public String sayHello() {
        return new StringBuilder()
                .append(helloWorldService.getGreeting())
                .append(" | ")
                .append(helloWorldServicePortuguese.getGreeting())
                .append(" | ")
                .append(helloWorldServiceGerman.getGreeting())
                .toString();
    }
}
