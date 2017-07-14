package treeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/12/17.
 */
class ConvertStringToBinaryTreeTest {
    String simpleBST1 = "(10()())";

    String simpleBST2 = "(10(5()())(7()()))";
    @Test
    void generateBinaryTree() throws Exception {
        ConvertStringToBinaryTree.generateBinaryTree(simpleBST1);
    }

}