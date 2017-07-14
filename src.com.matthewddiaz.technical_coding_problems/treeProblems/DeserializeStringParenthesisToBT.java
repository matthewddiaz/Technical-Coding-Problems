package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by matthewdiaz on 7/14/17.
 */
public class DeserializeStringParenthesisToBT {

    /**
     *
     * @param btStr
     * @return
     */
    public static BinaryTree.Node DeserializeStringParenthesis(String btStr){
        //check if btStr is null or empty
        if(btStr == null || btStr.length() == 0){
            return null;
        }

        //check if btStr is valid parenthesis
        if(!CheckBTStringParenthesisValidity.checkBinaryTreeParenthesisCorrectness(btStr)){
            return null;
        }

        //generate queue that contains parsed tokens representing every node in BT
        Deque<String> tokenQueue = tokenizeStringParenthesis(btStr);

        //generates BT and returns it's root node. The null token is equal to the string "()"
        return DeserializeBinaryTree.deserialize(tokenQueue, "()");
    }

    /**
     *
     * @param btStr
     * @return
     */
    public static Deque<String> tokenizeStringParenthesis(String btStr){
        Deque<String> tokenQueue = new ArrayDeque<>();
        int lengthOfToken = 0;
        for(int index = 0; index < btStr.length(); index++){
            char currentChar = btStr.charAt(index);
            if(Character.isDigit(currentChar)){
                lengthOfToken++;
            }else{
                if(lengthOfToken > 0){
                    insertTokenToQueue(tokenQueue, btStr, index - lengthOfToken, index);
                }else if((index >= 1) && ((btStr.charAt(index - 1) == '(') && (currentChar == ')'))){
                    insertTokenToQueue(tokenQueue, btStr, index - 1, index + 1);
                }
                lengthOfToken = 0;
            }
        }

        if(lengthOfToken > 0){
            insertTokenToQueue(tokenQueue, btStr, btStr.length() - lengthOfToken, btStr.length());
        }

        return tokenQueue;
    }

    /**
     *
     * @param tokenQueue
     * @param btStr
     * @param startIndex
     * @param endIndex
     */
    private static void insertTokenToQueue(Deque<String> tokenQueue, String btStr, int startIndex, int endIndex){
        String token = btStr.substring(startIndex, endIndex);
        tokenQueue.add(token);
    }

}
