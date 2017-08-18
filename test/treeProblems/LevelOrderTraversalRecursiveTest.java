package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTreeCreator;
import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

/**
 * Created by matthewdiaz on 8/4/17.
 */
class LevelOrderTraversalRecursiveTest {
    private BinaryTree simpleBinaryTree = BinaryTreeCreator.createSimpleBinarySearchTree();
    private BinaryTree complexBinaryTree  = BinaryTreeCreator.createComplexBinarySearchTree();

    @Test
    void levelOrderTraversal() {
        BinaryTree.Node root = simpleBinaryTree.getRoot();
        String inorderStr = LevelOrderTraversalRecursive.levelOrderTraversal(root);
        System.out.println(inorderStr);
        String actualInOrderStr = simpleBinaryTree.levelOrderTraversal();
        System.out.println(actualInOrderStr);
    }

}