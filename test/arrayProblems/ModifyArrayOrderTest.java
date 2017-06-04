package arrayProblems;

import arrayProblems.ModifyArrayOrder;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 10/11/16.
 */
public class ModifyArrayOrderTest {
    private ModifyArrayOrder modifyArrayOrder;

    @Before
    public void setUp() throws Exception {
        modifyArrayOrder = new ModifyArrayOrder();
    }

    @Test
    public void testModifyOrder() throws Exception {
        String[] arr = {"a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8"};
        modifyArrayOrder.modifyOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}