package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 6/29/17.
 */
public class SerializeBinaryTreeToStringParenthesis {

    /**
     * Generates a String representation of the binary tree in pre-order traversal
     * @param root The root node of the input binary tree
     * @return returns a string in the following format "(nodeValue(leftSubtree)(rightSubtree))"
     */
    public static String generatePreOrderStringParenthesization(BinaryTree.Node root){
        StringBuffer strTree = generatePreOrderStringParenthesization(root, new StringBuffer("("));
        strTree.append(")");
        return strTree.toString();
    }

    /**
     *
     * @param node
     * @param strTree
     * @return
     */
    private static StringBuffer generatePreOrderStringParenthesization(BinaryTree.Node node, StringBuffer strTree){
        if(node == null){
            return null;
        }

        strTree.append(node.getKey()+ "(");
        generatePreOrderStringParenthesization(node.getLeftChild(), strTree);
        strTree.append(")");
        strTree.append("(");
        generatePreOrderStringParenthesization(node.getRightChild(), strTree);
        strTree.append(")");
        return  strTree;
    }
}
