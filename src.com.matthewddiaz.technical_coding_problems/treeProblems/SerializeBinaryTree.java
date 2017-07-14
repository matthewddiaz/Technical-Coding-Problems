package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 7/12/17.
 */
public class SerializeBinaryTree {

    public static String serializeBinaryTree(BinaryTree.Node root){
        StringBuffer strBuffer = new StringBuffer("{");
        serializeBinaryTree(root, strBuffer);
        strBuffer.append('}');
        return strBuffer.toString();
    }

    private static void serializeBinaryTree(BinaryTree.Node node, StringBuffer strBuffer){
        if(node == null){
            strBuffer.append('#');
            return;
        }
        //add self value
        strBuffer.append(node.getKey());

        strBuffer.append(",");
        //add left subtree
        serializeBinaryTree(node.getLeftChild(), strBuffer);
        strBuffer.append(",");
        //add right subtree
        serializeBinaryTree(node.getRightChild(), strBuffer);
    }
}
