package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by matthewdiaz on 7/13/17.
 */
public class DeserializeBinaryTree {

    /**
     * @param serializedBT String representation of a Binary Tree sorted in PreOrder. The format is "self,left,right"
     * NOTE: "#" represent null nodes
     * @return returns the root of the Binary Tree represented by the input string
     */
    public static BinaryTree.Node deserialize(String serializedBT){
        Deque<String> tokenQueue = parseSerializedString(serializedBT, ',');
        return deserialize(tokenQueue, "#");
    }

    /**
     *
     * @param serializedStr
     * @return Parses serializedStr on the input delimiter and returns a new Queue with every token
     */
    public static Deque<String> parseSerializedString(String serializedStr, char delimiter){
        //case were input string is equal to null or is empty
        if(serializedStr == null || serializedStr.length() == 0){
            return null;
        }

        Deque<String> tokenQueue = new ArrayDeque();
        int startIndex = 0;
        int endIndex;
        while(startIndex <= serializedStr.length() - 1){
            //determining index of delimiter
            endIndex = serializedStr.indexOf(delimiter, startIndex);
            //if no delimiter is found in the range [startIndex, str.length() - 1] set end index equal to length of str
            if(endIndex == - 1){
                endIndex = serializedStr.length();
            }

            //token is the substring that ranges from the startIndex till endIndex
            String token = serializedStr.substring(startIndex, endIndex);
            tokenQueue.add(token);
            //startIndex is advances to the next character after the delimiter in the string
            startIndex = endIndex + 1;
        }
        return tokenQueue;
    }

    /**
     * NOTE: This deserialize method only works if the tokenQueue contains a full binary tree
     * that means that there exist tokens for null nodes; which is why "#" are included in the queue
     * and not excluded. The following method dematerializes in preOrder.
     * @param tokenQueue
     * @return Root of generated binary tree
     */
    public static BinaryTree.Node deserialize(Deque<String> tokenQueue, String nullToken){
        //base case. Return null if queue is equal to null or if there aren't any more tokens in the queue
        if((tokenQueue == null) || tokenQueue.isEmpty()){
            return null;
        }

        //remove top token from queue
        String currentToken = tokenQueue.remove();
        //a token with value "#" represents a null node
        if (currentToken.equals(nullToken)){
            return null;
        }

        //creating a new Node with it's key value set to the currentToken
        BinaryTree.Node node = new BinaryTree.Node(Integer.parseInt(currentToken));
        //generate this node's left subtree
        node.setLeftChild(deserialize(tokenQueue, nullToken));
        //generate this node's right subtree
        node.setRightChild(deserialize(tokenQueue, nullToken));
        return node;
    }
}
