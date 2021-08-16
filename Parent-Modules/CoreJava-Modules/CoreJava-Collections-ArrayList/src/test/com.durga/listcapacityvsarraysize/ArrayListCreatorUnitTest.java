package listcapacityvsarraysize;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author durga on 8/13/2021
 */
public class ArrayListCreatorUnitTest {
    @Test
    void givenValidCapacityOfList_whenCreateListInvoked_thenCreateNewArrayListWithGivenCapacity() {
        ArrayList<Integer> list = new ArrayList<>(100);

        assertNotNull(list);
    }

    @Test
    void givenInvalidCapacityOfList_whenCreateListInvoked_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new ArrayList<>(-1));
    }

    @Test
    void givenValidCapacityOfList_whenCreateListInvoked_thenCreateNewArrayListWithSizeZero() {
        assertEquals(0, new ArrayList<Integer>(100).size());
    }
}
