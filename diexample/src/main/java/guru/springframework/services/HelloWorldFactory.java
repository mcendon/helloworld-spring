package guru.springframework.services;

public class HelloWorldFactory {
    public HelloWorldService create(String lang) {
        switch (lang) {
            case "spanish":
                return new HelloWorldServiceSpanishImpl();
            case "german":
                return new HelloWorldServiceGermanImpl();
            case "portuguese":
                return new HelloWorldServicePortugueseImpl();
            case "english":
            default:
                return new HelloWorldServiceEnglishImpl();
        }
    }
}
