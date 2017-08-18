package treeProblems;

import java.util.*;
import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 8/4/17.
 */
public class SumAtEachLevelOfBinaryTree {

    /**
     *
     * @param root root of binary tree
     * @return sum of the node values at each level
     */
    public static List<Integer> sumOfAtEachLevel(BinaryTree.Node<Integer> root){
        //case were root is null
        if(root == null){
            return null;
        }

        List<Integer> levelSumList = new ArrayList<>();

        //get height of tree
        int height = BinaryTree.heightOfTree(root);

        //calculate sum of tree at each level
        for(int level = 0; level <= height; level++){
            int levelSum = sumOfLevel(root, level);
            levelSumList.add(levelSum);
        }
        return levelSumList;
    }

    /**
     *
     * @param root root of binary tree
     * @param level desired level
     * @return sum of the desired level
     */
    private static int sumOfLevel(BinaryTree.Node<Integer> root, int level){
        //case were root is null
        if(root == null){
            return 0;
        }

        //case where method is at desired level
        if(level <= 0){
            return root.getKey();
        }else{
            //visit left subtree
            int leftSubtreeLevelSum = sumOfLevel(root.getLeftChild(), level - 1);
            //visit right subtree
            int rightSubtreeLevelSum = sumOfLevel(root.getRightChild(), level - 1);
            return leftSubtreeLevelSum + rightSubtreeLevelSum;
        }
    }
}
