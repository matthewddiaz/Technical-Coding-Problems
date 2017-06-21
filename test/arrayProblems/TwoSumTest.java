package arrayProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/21/17.
 */
class TwoSumTest {
    int[] sampleArr = {1, 2, 5, 13, 7, 11, 15};
    int target = 9;

    @Test
    void twoSum() {
        int expectedIndex1 = 1;
        int expectedIndex2 = 4;

        int[] result = TwoSum.twoSum(sampleArr, target);
        assertEquals(expectedIndex1, result[0]);
        assertEquals(expectedIndex2, result[1]);
    }
}