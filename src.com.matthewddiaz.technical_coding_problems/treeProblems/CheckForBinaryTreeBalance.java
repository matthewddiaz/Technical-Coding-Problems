package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 7/4/17.
 */
public class CheckForBinaryTreeBalance {

    /**
     * Given the root node of a Binary Tree return true if the Binary tree is balanced.
     *
     * NOTE: A binary tree is balanced if for every node in the tree its subtrees heights don't
     * differ by more than 1.
     * @param root
     * @return
     */
    public static boolean isBinaryTreeBalance(BinaryTree.Node root){
        //if checkNodeHeight returns -1 then there exists at least one node in the binary tree that is not balanced.
        if(checkNodeHeight(root) == -1){
            return false;
        }

        return true;
    }

    /**
     * Calculates the height of a node; at the same time determines if that node is balanced or not.
     * NOTE: Return value of -1 denotes that the input node is not balanced. This method will return the
     * height of an input node that is balanced.
     *
     * @param node
     * @return
     */
    public static int checkNodeHeight(BinaryTree.Node node){
        //a null node has a height of 0
        if(node == null){
            return 0;
        }

        int leftHeight = checkNodeHeight(node.getLeftChild());
        //case where left subtree is not balanced
        if(leftHeight == -1){
            return -1;
        }

        int rightHeight = checkNodeHeight(node.getRightChild());
        //case where right subtree is not balanced
        if(rightHeight == -1){
            return  -1;
        }

        //case where the difference between the left and right subtree are greater than 1.
        //The unbalanced height is first caught here!
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        //return height of node; this is the larger height of the two subtrees plus 1.
        return max(leftHeight, rightHeight) + 1;
    }

    private static int max(int val1, int val2){
        return (val1 > val2) ? val1 : val2;
    }
}
