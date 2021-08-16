package binding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author durga on 8/12/2021
 */
public class AnimalActivity {
    final static Logger logger = LoggerFactory.getLogger(AnimalActivity.class);


    public static void sleep(Animal animal) {
        logger.info("Animal is sleeping");
    }

    public static void sleep(Dog dog) {
        logger.info("Cat is sleeping");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        //calling methods of animal object
        animal.makeNoise();

        animal.makeNoise(3);


        //assigning a dog object to reference of type Animal
        Animal catAnimal = new Dog();

        catAnimal.makeNoise();

        // calling static function
        AnimalActivity.sleep(catAnimal);

        return;

    }
}
