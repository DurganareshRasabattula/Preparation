package collections;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author durga on 8/13/2021
 */
public class CoreJavaCollectionsUnitTest {
    private static final Logger LOG = LoggerFactory.getLogger(CoreJavaCollectionsUnitTest.class);

    @Test
    public final void givenUsingTheJdk_whenArrayListIsSynchronized_thenCorrect() {
        final List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        final List<String> synchronizedList = Collections.synchronizedList(list);
        LOG.debug("Synchronized List is: " + synchronizedList);
    }
}
