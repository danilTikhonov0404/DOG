package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    @Bean(name = "timer")
    public Timer getimer() {
        Timer timer = new Timer();
        timer.getTime();
        return timer;
    }

    @Autowired
    @Qualifier("timer")
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }


}
