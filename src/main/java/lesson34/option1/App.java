package lesson34.option1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("First way");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
    }
}