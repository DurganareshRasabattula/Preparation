package breakcontinue;

import org.junit.Test;

import static breakcontinue.BreakContinue.*;
import static org.junit.Assert.assertEquals;

/**
 * @author durga on 8/12/2021
 */
public class BreakContinueUnitTest {
    @Test
    public void whenUnlabeledBreak_ThenEqual() {
        assertEquals(4, unlabeledBreak());
    }

    @Test
    public void whenUnlabeledBreakNestedLoops_ThenEqual() {
        assertEquals(2, unlabeledBreakNestedLoops());
    }

    @Test
    public void whenLabeledBreak_ThenEqual() {
        assertEquals(1, labeledBreak());
    }

    @Test
    public void whenUnlabeledContinue_ThenEqual() {
        assertEquals(5, unlabeledContinue());
    }

    @Test
    public void whenLabeledContinue_ThenEqual() {
        assertEquals(3, labeledContinue());
    }
}
