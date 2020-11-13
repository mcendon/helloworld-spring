package guru.springframework.config;
import org.springframework.context.annotation.Configuration;

//Moved to XML config
@Configuration
public class HelloConfig {


    /*@Bean
    HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }*/

    /*@Bean
    @Profile({"default", "english"})
    @Primary
    public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldFactory factory) {
        return factory.create("english");
    }*/

    /*@Bean
    @Profile({"spanish"})
    public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory) {
        return factory.create("spanish");
    }*/

    /*@Bean()
    public HelloWorldService helloWorldServiceGermanImpl(HelloWorldFactory factory) {
        return factory.create("german");
    }*/

    /*@Bean(name = "portuguese")
    public HelloWorldService helloWorldServicePortugueseImpl(HelloWorldFactory factory) {
        return factory.create("portuguese");
    }*/
}
