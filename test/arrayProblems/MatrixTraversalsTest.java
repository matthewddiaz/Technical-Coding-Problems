package arrayProblems;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static arrayProblems.CreateSampleArrays.create2DArrayWithRandomElements;

/**
 * Created by matthewdiaz on 5/21/17.
 */
public class MatrixTraversalsTest {

    @Test
    public void traverseRows() throws Exception {
        int[][] arr = create2DArrayWithRandomElements();
        MatrixTraversals.traverseRows(arr);
    }

    @Test
    public void simplifiedRows() throws Exception {
        int[][] arr = create2DArrayWithRandomElements();
        MatrixTraversals.simplifiedRows(arr);
    }

}