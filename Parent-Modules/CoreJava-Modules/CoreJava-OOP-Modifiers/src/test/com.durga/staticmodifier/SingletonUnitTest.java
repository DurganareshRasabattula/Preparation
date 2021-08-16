package staticmodifier;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author durga on 8/12/2021
 */
public class SingletonUnitTest {
    @Test
    public void givenStaticInnerClass_whenMultipleTimesInstanceCalled_thenOnlyOneTimeInitialized() {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        Assert.assertSame(object1, object2);
    }
}
