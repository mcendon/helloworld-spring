package guru.springframework.services;

public class HelloWorldServicePortugueseImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Olá Mundo!!";
    }
}
