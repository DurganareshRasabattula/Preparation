package listcapacityvsarraysize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 * @author durga on 8/13/2021
 */
public class ArrayCreatorUnitTest {
    @Test
    void whenSizeOfAnArrayIsNonZero_thenReturnNewArrayOfGivenSize() {
        Integer[] array = new Integer[10];
        assertEquals(10, array.length);
    }

    @Test
    void whenSizeOfAnArrayIsLessThanZero_thenThrowException() {
        assertThrows(NegativeArraySizeException.class, () -> { Integer[] array = new Integer[-1]; });
    }
}
