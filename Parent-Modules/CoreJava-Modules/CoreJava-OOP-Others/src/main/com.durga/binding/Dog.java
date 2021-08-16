package binding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author durga on 8/12/2021
 */
public class Dog extends Animal{
    final static Logger logger = LoggerFactory.getLogger(Dog.class);

    public void makeNoise() {

        logger.info("meow");
    }
}
