package lesson34;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.say();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context);

        Person myPerson = context.getBean("myPerson", Person.class);
        myPerson.getPet().say();
        System.out.println(myPerson);
    }
}