package configurations;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("kiki");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Roland");
        p.setParrot(parrot());
        return p;
    }
}
