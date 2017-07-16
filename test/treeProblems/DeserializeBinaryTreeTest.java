package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/13/17.
 */
class DeserializeBinaryTreeTest {
    private String serializedBT = "10,5,1,#,#,#,12,11,#,#,15,#,#";

    @Test
    void deserialize() {
        String expectedResultLevelOrderTraversal = "[ 10, 5, 12, 1, 11, 15 ]";
        BinaryTree.Node root = DeserializeBinaryTree.deserialize(serializedBT);
        String actualLevelOrderTraversal = BinaryTree.levelOrderTraversal(root);

       assertEquals(expectedResultLevelOrderTraversal, actualLevelOrderTraversal);
    }

}