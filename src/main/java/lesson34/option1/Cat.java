package lesson34.option1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCat")
public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("meow");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Cat is created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Cat is destroyed");
    }
}
