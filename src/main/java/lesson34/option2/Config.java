package lesson34.option2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson34.option2")
public class Config {
    @Bean("myDog")
    public Dog dog() {
        return new Dog();
    }

    @Bean("myPerson")
    public Person person() {
        return new Person(dog());
    }
}