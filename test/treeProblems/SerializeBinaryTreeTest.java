package treeProblems;

import com.matthewddiaz.datastructures.trees.BSTCreator;
import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/12/17.
 */
class SerializeBinaryTreeTest {
    private BinaryTree<Integer> simpleBST;

    @BeforeEach
    public void setUp() throws Exception {
        this.simpleBST = BSTCreator.createSimpleBinarySearchTree();
    }


    @Test
    void serializeBinaryTree() {
        String expectedSerializedBT = "{10,5,1,#,#,#,12,11,#,#,15,#,#}";
        String serializedBT = SerializeBinaryTree.serializeBinaryTree(this.simpleBST.getRoot());
        assertEquals(expectedSerializedBT, serializedBT);
    }
}