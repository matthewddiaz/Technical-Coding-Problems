package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 8/6/17.
 */
public class CheckIsBinarySearchTree {

    /**
     *
     * @param root input root of binary tree
     * @return true if input binary tree is a binary search tree
     */
    public static boolean isBinarySearchTree(BinaryTree.Node<Integer> root){
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     *
     * @param root input root of binary tree
     * @param minValue smallest valid number
     * @param maxValue largest valid number
     * @return true if input binary tree is a binary search tree
     */
    private static boolean isBinarySearchTree(BinaryTree.Node<Integer> root, int minValue, int maxValue){
        //base case root is null
        if(root == null){
            return true;
        }

        //check if root is not between interval
        if(root.getKey() < minValue || root.getKey() > maxValue){
            return false;
        }

        //check left subtree
        boolean leftSubTreeResult = isBinarySearchTree(root.getLeftChild(), minValue, root.getKey());
        //check right subtree
        boolean rightSubTreeResult = isBinarySearchTree(root.getRightChild(), root.getKey(), maxValue);

        return (leftSubTreeResult && rightSubTreeResult);
    }
}


