package lesson34.option1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myDog")
@Scope("singleton")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("woof");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Dog is created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Dog is destroyed");
    }
}