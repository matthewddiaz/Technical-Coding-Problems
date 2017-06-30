package arrayProblems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 10/11/16.
 */
public class ModifyArrayOrderTest {

    @Test
    public void testModifyOrder() throws Exception {
        String expectedResult = "[a1, b1, a2, b2, a3, b3, a4, b4, a5, b5, a6, b6, a7, b7, a8, b8]";
        String[] arr = {"a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8"};
        ModifyArrayOrder.modifyOrder(arr);
        String actualResult = Arrays.toString(arr);

        assertEquals(expectedResult, actualResult);
    }
}