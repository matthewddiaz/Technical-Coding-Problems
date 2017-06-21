package arrayProblems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/21/17.
 */
class CreateAntiDiagonalsTest {
    int[][] sampleMatrix = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

    @Test
    void createAntiDiagonals() {
        String expectedResult = "[ 1 ]\n" +
                                "[ 2, 4 ]\n" +
                                "[ 3, 5, 7 ]\n" +
                                "[ 6, 8 ]\n" +
                                "[ 9 ]\n";
        List<List<Integer>> antiDiagonals = CreateAntiDiagonals.createAntiDiagonals(sampleMatrix);
        String actualResult = CreateAntiDiagonals.stringRepresentationOfAntiDiagonals(antiDiagonals);
        assertEquals(expectedResult, actualResult);
    }
}