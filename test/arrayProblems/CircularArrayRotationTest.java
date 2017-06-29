package arrayProblems;

import arrayProblems.CircularArrayRotation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 8/25/16.
 */
public class CircularArrayRotationTest {
    private Integer[] sampleArr = {8, 1, 15, 20, 7, 1, 2};

    @Test
    void shiftAllElementsClockWise() {
        CircularArrayRotation.shiftAllElementsClockWise(sampleArr, 3);
        System.out.println(Arrays.toString(sampleArr));
    }
}