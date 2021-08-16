package casting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author durga on 8/11/2021
 */
public class Animal {
    private static final Logger LOGGER = LoggerFactory.getLogger(Animal.class);

    public void eat() {
        LOGGER.info("animal is eating");
    }
}
