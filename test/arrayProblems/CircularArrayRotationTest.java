package arrayProblems;

import arrayProblems.CircularArrayRotation;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 8/25/16.
 */
public class CircularArrayRotationTest {
    private CircularArrayRotation circularArrayRotation;

    @org.junit.Before
    public void setUp() throws Exception {
        circularArrayRotation = new CircularArrayRotation();
    }

    @org.junit.Test
    public void testShiftAllElementsClockWise() throws Exception {
        Integer[] arr = {1,2,3,4,5};

        circularArrayRotation.shiftAllElementsClockWise(arr);
        System.out.println(Arrays.toString(arr));
    }
}