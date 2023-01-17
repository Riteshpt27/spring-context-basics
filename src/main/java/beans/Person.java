package beans;

import beans.Parrot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final Parrot parrot;
    private String name = "Ritesh";

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }
    public Parrot getParrot() {
        return parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
