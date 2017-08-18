package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;
import com.matthewddiaz.datastructures.trees.BinaryTreeCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matthewdiaz on 8/6/17.
 */
class CheckIsBinarySearchTreeTest {
    private BinaryTree.Node<Integer> rootOfSimpleBT = BinaryTreeCreator.createSimpleBinaryTree().getRoot();
    private BinaryTree.Node<Integer> rootOfComplexBT = BinaryTreeCreator.createComplexBinarySearchTree().getRoot();

    @Test
    void isBinarySearchTree() {
        boolean expectedResultForSimpleBT = false;
        boolean expectedResultForComplexBT = true;

        boolean actualResultForSimpleBT = CheckIsBinarySearchTree.isBinarySearchTree(rootOfSimpleBT);
        boolean actualResultForComplexBT = CheckIsBinarySearchTree.isBinarySearchTree(rootOfComplexBT);

        assertEquals(expectedResultForSimpleBT, actualResultForSimpleBT);
        assertEquals(expectedResultForComplexBT, actualResultForComplexBT);
    }
}