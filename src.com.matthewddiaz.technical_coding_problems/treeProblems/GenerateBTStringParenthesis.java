package treeProblems;

import com.matthewddiaz.datastructures.trees.BinarySearchTree;

/**
 * Created by matthewdiaz on 6/29/17.
 */
public class GenerateBTStringParenthesis {

    /**
     * Generates a String representation of the binary tree in pre-order traversal
     * @param root The root node of the input binary tree
     * @return returns a string in the following format "(node_val(left_subtree)(right_subtree))"
     */
    public static String generatePreOrderStringParenthesization(BinarySearchTree.Node root){
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
    private static StringBuffer generatePreOrderStringParenthesization(BinarySearchTree.Node node, StringBuffer strTree){
        if(node == null){
            return null;
        }

        strTree.append(node.getKey()+ "(");
        generatePreOrderStringParenthesization(node.getLeft(), strTree);
        strTree.append(")");
        strTree.append("(");
        generatePreOrderStringParenthesization(node.getRight(), strTree);
        strTree.append(")");
        return  strTree;
    }
}
