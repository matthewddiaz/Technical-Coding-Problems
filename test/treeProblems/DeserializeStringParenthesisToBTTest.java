package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.Deque;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 7/14/17.
 */
class DeserializeStringParenthesisToBTTest {
    private String simpleBTStr = "(10()())";
    private String complexBTStr = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";

    @Test
    void deserializeStringParenthesisSimpleBT() {
        String expectedLevelOrderResult = "[ 10 ]";
        checkDeserializeStringParenthesis(simpleBTStr, expectedLevelOrderResult);
    }

    @Test
    void deserializeStringParenthesisComplexBT() {
        checkDeserializeStringParenthesis(complexBTStr, "[ 0, 5, 7, 6, 4, 1, 3, 9 ]");
    }

    private void checkDeserializeStringParenthesis(String btParenthesisStr, String expectedLevelOrderResult){
        BinaryTree.Node root = DeserializeStringParenthesisToBT.DeserializeStringParenthesis(btParenthesisStr);
        String levelOrderTraversalStr = BinaryTree.levelOrderTraversal(root);
        assertEquals(expectedLevelOrderResult, levelOrderTraversalStr);
    }

    @Test
    void tokenizeStringParenthesisSimpleTest() {
        checkTokenizerStringParenthesisCorrectness(simpleBTStr, "10 () () ");
    }


    @Test
    void tokenizeStringParenthesisComplexTest() {
        checkTokenizerStringParenthesisCorrectness(complexBTStr, "0 5 6 () () 4 () 9 () () 7 1 () () 3 () () ");
    }

    private void checkTokenizerStringParenthesisCorrectness(String btParenthesisStr, String expectedResult){
        Deque<String> tokenQueue = DeserializeStringParenthesisToBT.tokenizeStringParenthesis(btParenthesisStr);

        String actualTokensStr = generateStrOfTokensInQueue(tokenQueue);

        assertEquals(expectedResult, actualTokensStr);
    }

    private String generateStrOfTokensInQueue(Deque<String> tokenQueue){
        StringBuffer buffer = new StringBuffer();
        while(!tokenQueue.isEmpty()){
            buffer.append(tokenQueue.remove() + " ");
        }
        return buffer.toString();
    }
}