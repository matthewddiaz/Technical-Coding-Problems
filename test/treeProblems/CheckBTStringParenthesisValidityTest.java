package treeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/29/17.
 */
class CheckBTStringParenthesisValidityTest {
    String simpleBT = "(8(5()())(7()()))";
    String complexBT = "(9(5(2(1()())())(7()()))())";


    @Test
    void checkBinaryTreeParenthesisCorrectness() {
        boolean expectedResultForSimple = true;

        boolean simpleBSTStringRepResult =
                CheckBTStringParenthesisValidity.checkBinaryTreeParenthesisCorrectness(simpleBT);
        assertEquals(expectedResultForSimple, simpleBSTStringRepResult);

        boolean expectedResultForComplex = true;
        boolean complexBSTStringRepResult =
                CheckBTStringParenthesisValidity.checkBinaryTreeParenthesisCorrectness(simpleBT);
        assertEquals(expectedResultForComplex, complexBSTStringRepResult);
    }
}