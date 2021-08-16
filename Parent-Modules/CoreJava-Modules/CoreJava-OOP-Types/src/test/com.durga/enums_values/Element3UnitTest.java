package enums_values;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author durga on 8/12/2021
 */
public class Element3UnitTest {
    public Element3UnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void whenLocatebyLabel_thenReturnCorrectValue() {
        for (Element3 e3 : Element3.values()) {
            assertSame(e3, Element3.valueOfLabel(e3.label));
        }
    }

    /**
     * Test of toString method, of class Element3.
     */
    @Test
    public void whenCallingToString_thenReturnLabel() {
        for (Element3 e3 : Element3.values()) {
            assertEquals(e3.label, e3.toString());
        }
    }
}
