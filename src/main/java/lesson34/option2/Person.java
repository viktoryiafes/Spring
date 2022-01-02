package lesson34.option2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Scope("prototype")
@Component
@PropertySource("myApplication.properties")
public class Person {
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Person is created");
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", pet=" + pet +'}';
    }
}