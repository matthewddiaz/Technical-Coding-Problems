package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/13/17.
 */
class DeserializeBinaryTreeTest {
    private String serializedBT = "10,5,1,#,#,#,12,11,#,#,15,#,#";

    @Test
    void deserialize() {
        BinaryTree.Node root = DeserializeBinaryTree.deserialize(serializedBT);
        BinaryTree bt = new BinaryTree(root);
        System.out.println(bt.preOrderTraversal());
    }

}