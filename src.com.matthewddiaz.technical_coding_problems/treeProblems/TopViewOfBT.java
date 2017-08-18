package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 8/4/17.
 */
public class TopViewOfBT {

    public static void topView(BinaryTree.Node root){
        topView(root, 0);
    }

    private static void topView(BinaryTree.Node root, int position){
        if(root == null){
            return;
        }
        //traverse left subtree
        topView(root.getLeftChild(), position - 1);
        System.out.print("key: " + root.getKey() + " pos: " + position + ", ");
        //traverse right subtree
        topView(root.getRightChild(), position + 1);
    }
}
