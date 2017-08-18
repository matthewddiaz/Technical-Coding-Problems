package arrayProblems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 7/4/17.
 */
class ArrayDigitSortTest {

    @Test
    void digitSortSimpleTest() {
        int[] simpleArr = {13, 20, 7, 4};
        String expectedArrStr = "[20, 13, 4, 7]";
        testDigitSort(simpleArr, expectedArrStr);
    }

    @Test
    void digitSortComplexTest() {
        int[] complexArr = {100, 22, 4, 11, 31, 103};
        String expectedArrStr = "[100, 11, 22, 4, 31, 103]";

        testDigitSort(complexArr, expectedArrStr);
    }

    private void testDigitSort(int[] inputArr, String expectedSortedArrStr){
        ArrayDigitSort.digitSort(inputArr);
        String resultStr = Arrays.toString(inputArr);
        assertEquals(expectedSortedArrStr, resultStr);
    }
}