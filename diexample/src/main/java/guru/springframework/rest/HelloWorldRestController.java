package guru.springframework.rest;

import guru.springframework.controllers.GreetingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    private GreetingController greetingController;

    @Autowired
    public HelloWorldRestController(GreetingController greetingController) {
        this.greetingController = greetingController;
    }

    @RequestMapping("/hello")
    public String hello() {
        return this.greetingController.sayHello();
    }
}
