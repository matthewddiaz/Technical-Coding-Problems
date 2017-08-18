package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 8/4/17.
 */
public class LevelOrderTraversalRecursive {

    /**
     *
     * @param root root of binary tree
     * @return returns a string of the data values of the binary tree in level order
     */
    public static String levelOrderTraversal(BinaryTree.Node root){
        if(root == null){
            return "Empty Tree";
        }

        StringBuffer binaryTreeBuffer = new StringBuffer();

        //find the height of the tree
        int binaryTreeHeight = BinaryTree.heightOfTree(root);

        //for each level of the binary tree print the data of the contained by the nodes at that level
        for(int level = 0; level <= binaryTreeHeight; level++){
            visitLevel(root, level, binaryTreeBuffer);
        }

        return binaryTreeBuffer.toString();
    }

    /**
     *
     * @param node node of a binary tree
     * @param level desired level to visit
     * @param binaryTreeBuffer buffer to add binary tree node data
     */
    private static void visitLevel(BinaryTree.Node node, int level, StringBuffer binaryTreeBuffer){
        //case node is null
        if(node == null){
            return;
        }
        //desired level. Append node key to buffer
        if(level <= 0){
            binaryTreeBuffer.append(node.getKey() + " ");
        }else {
            //visit left subtree
            visitLevel(node.getLeftChild(), level - 1, binaryTreeBuffer);
            //visit right subtree
            visitLevel(node.getRightChild(), level - 1, binaryTreeBuffer);
        }
    }
}
