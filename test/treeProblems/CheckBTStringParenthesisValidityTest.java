package treeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/29/17.
 */
class CheckBTStringParenthesisValidityTest {

    @Test
    void checkBinaryTreeParenthesisCorrectness() {
        String simpleBT = "(8(5()())(7()()))";
        boolean expectedResultForSimple = true;

        boolean simpleBSTStringRepResult =
                CheckBTStringParenthesisValidity.checkBinaryTreeParenthesisCorrectness(simpleBT);
        assertEquals(expectedResultForSimple, simpleBSTStringRepResult);

        String complexBT = "(9(5(2(1()())())(7()()))()";
        boolean expectedResultForComplex = false;
        boolean complexBSTStringRepResult =
                CheckBTStringParenthesisValidity.checkBinaryTreeParenthesisCorrectness(complexBT);
        assertEquals(expectedResultForComplex, complexBSTStringRepResult);
    }
}