package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTreeCreator;
import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

/**
 * Created by matthewdiaz on 8/4/17.
 */
class TopViewOfBTTest {
    BinaryTree bt = BinaryTreeCreator.createSimpleBinarySearchTree();

    @Test
    void topView() {
        TopViewOfBT.topView(bt.getRoot());
    }

}