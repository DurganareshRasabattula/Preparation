package generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author durga on 8/12/2021
 */
public class Building {
    private static final Logger LOGGER = LoggerFactory.getLogger(Building.class);

    public void paint() {
        LOGGER.info("Painting Building");
    }
}
