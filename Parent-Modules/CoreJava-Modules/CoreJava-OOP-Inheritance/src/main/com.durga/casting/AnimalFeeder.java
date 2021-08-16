package casting;

import java.util.List;

/**
 * @author durga on 8/11/2021
 */
public class AnimalFeeder {
    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat();
            if (animal instanceof Cat) {
                ((Cat) animal).meow();
            }
        });
    }

    public void uncheckedFeed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat();
            ((Cat) animal).meow();
        });
    }
}
