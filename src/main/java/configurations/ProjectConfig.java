package configurations;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
    }

    @Bean
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("miki");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("riki");
        return p;
    }
    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
