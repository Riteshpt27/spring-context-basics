package main;

import beans.Parrot;
import beans.Person;
import configurations.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getParrot());
    }
}
