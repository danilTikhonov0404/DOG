package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component()
public class Dog extends Animal {
    public String toString (){return "I a Dog";}

}
