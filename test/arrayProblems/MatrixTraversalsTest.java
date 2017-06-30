package arrayProblems;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 5/21/17.
 */
public class MatrixTraversalsTest {
    int[][] sampleMatrix = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

    @Test
    public void printDownwardDiagonal() throws Exception {
        String expectedDownwardDiagonalStr = "[ 1, 5, 9 ]";
        String downwardDiagonalStr = MatrixTraversals.downwardDiagonalString(sampleMatrix);
        assertEquals(expectedDownwardDiagonalStr, downwardDiagonalStr);
    }

    @Test
    public void printUpwardDiagonal() throws Exception {
        String expectedUpwardDiagonalStr = "[ 7, 5, 3 ]";
        String upwardDiagonalStr = MatrixTraversals.upwardDiagonalString(sampleMatrix);
        assertEquals(expectedUpwardDiagonalStr, upwardDiagonalStr);
    }

    @Test
    public void traverseRows() throws Exception {
        String expectedResult = "row 0: [ 1, 2, 3 ]\n" +
                                "row 1: [ 4, 5, 6 ]\n" +
                                "row 2: [ 7, 8, 9 ]\n";
        String actualStr = MatrixTraversals.traverseRows(sampleMatrix);
        assertEquals(expectedResult, actualStr);
    }

    @Test
    public void simplifiedRows() throws Exception {
        String expectedResult = "1 2 3 \n" +
                                "4 5 6 \n" +
                                "7 8 9 \n";
        String actualStr = MatrixTraversals.simplifiedRows(sampleMatrix);
        assertEquals(expectedResult, actualStr);
    }

}