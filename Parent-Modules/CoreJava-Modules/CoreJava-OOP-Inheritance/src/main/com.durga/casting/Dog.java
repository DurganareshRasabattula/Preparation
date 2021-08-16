package casting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author durga on 8/11/2021
 */
public class Dog extends Animal{
    private static final Logger LOGGER = LoggerFactory.getLogger(Dog.class);

    public void eat() {
        LOGGER.info("dog is eating");
    }
}
