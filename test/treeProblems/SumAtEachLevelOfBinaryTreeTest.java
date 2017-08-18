package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTreeCreator;
import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by matthewdiaz on 8/4/17.
 */
class SumAtEachLevelOfBinaryTreeTest {
    private BinaryTree<Integer> simpleBinaryTree = BinaryTreeCreator.createSimpleBinarySearchTree();
    private BinaryTree<Integer> complexBinaryTree = BinaryTreeCreator.createComplexBinarySearchTree();

    @Test
    void sumOfAtEachLevelSimpleTest() {
        BinaryTree.Node simpleBTRoot = simpleBinaryTree.getRoot();
        List<Integer> levelSumList = SumAtEachLevelOfBinaryTree.sumOfAtEachLevel(simpleBTRoot);
        printSumLevelList(levelSumList);
    }

    @Test
    void sumOfAtEachLevelComplexTest() {
        BinaryTree.Node complexBinaryTreeRoot = complexBinaryTree.getRoot();
        List<Integer> levelSumList = SumAtEachLevelOfBinaryTree.sumOfAtEachLevel(complexBinaryTreeRoot);
        printSumLevelList(levelSumList);
    }

    private void printSumLevelList(List<Integer> levelSumList){
        for(int level = 0; level < levelSumList.size(); level++){
            System.out.println("Level: " + level + ", sum: " + levelSumList.get(level));
        }
    }

}