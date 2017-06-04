package stringProblems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by matthewdiaz on 5/12/17.
 */
public class PairEliminatorTest {
    @Test
    public void reduceStringTest1() throws Exception {
        String expectedResult = "Empty String";
        String result = PairEliminator.reduceString("baab");
        assertEquals(expectedResult, result);
    }

    @Test
    public void reduceStringTest2() throws Exception {
        String expectedResult = "abd";
        String result = PairEliminator.reduceString("aaabccddd");
        assertEquals(expectedResult, result);
    }

    @Test
    public void reduceStringTest3() throws Exception {
        String expectedResult = "read";
        String result = PairEliminator.reduceString("rabcddcbaead");
        assertEquals(expectedResult, result);
    }

    @Test
    public void reduceStringTest4() throws Exception {
        String expectedResult = "hi";
        String result = PairEliminator.reduceString("habcddcbai");
        assertEquals(expectedResult, result);
    }
}