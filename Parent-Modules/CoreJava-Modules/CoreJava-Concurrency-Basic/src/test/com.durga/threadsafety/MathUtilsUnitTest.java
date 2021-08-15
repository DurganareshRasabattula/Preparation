package threadsafety;


import org.junit.Test;
import threadsafety_mathutils.MathUtils;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MathUtilsUnitTest {
    
    @Test
    public void whenCalledFactorialMethod_thenCorrect() {
        assertThat(MathUtils.factorial(2)).isEqualTo(new BigInteger("2"));
    }
}
