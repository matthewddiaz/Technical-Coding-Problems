package treeProblems;

import com.matthewddiaz.datastructures.trees.BSTCreator;
import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/16/17.
 */
class CheckForBinaryTreeBalanceTest {
    BinaryTree<Integer> simpleBT = BSTCreator.createSimpleBinarySearchTree();
    BinaryTree<Integer> comlexBt = BSTCreator.createComplexBinarySearchTree();

    @Test
    void isSimpleBinaryTreeBalanced() {
        checkBinaryTreeBalanceTest(simpleBT, true);
    }

    @Test
    void isComplexBinaryTreeBalanced() {
        checkBinaryTreeBalanceTest(comlexBt, false);
    }

    private void checkBinaryTreeBalanceTest(BinaryTree<Integer> binaryTree, boolean expectedResult){
        boolean actualResult = CheckForBinaryTreeBalance.isBinaryTreeBalance(binaryTree.getRoot());
        assertEquals(expectedResult, actualResult);
    }
}