package breakloop;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author durga on 8/12/2021
 */
public class LoopBreakingUnitTest {
    private final LoopBreaking loopBreaking = new LoopBreaking();

    @Test
    void whenUsingBreak_shouldBreakInnerLoop() {
        assertEquals("outer0inner0outer1inner0", loopBreaking.simpleBreak());
    }

    @Test
    void whenUsingLabeledBreak_shouldBreakInnerLoopAndOuterLoop() {
        assertEquals("outer0inner0", loopBreaking.labelBreak());
    }

    @Test
    void whenUsingReturn_shouldBreakInnerLoopAndOuterLoop() {
        assertEquals("outer0inner0", loopBreaking.usingReturn());
    }
}
