package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;

import java.security.InvalidParameterException;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by matthewdiaz on 7/14/17.
 */
public class DeserializeStringParenthesisToBT {

    /**
     *
     * @param btStr input String with the format (self(leftSubtree)(rightSubtree))
     * @return The root node of the binary tree serialized in btStr
     * NOTE: null is returned if btStr format is not valid
     */
    public static BinaryTree.Node DeserializeStringParenthesis(String btStr) throws Exception{
        //check if btStr is null or empty
        if(btStr == null || btStr.length() == 0){
            throw new Exception();
        }

        //check if btStr is valid parenthesis
        if(!CheckBTStringParenthesisValidity.checkBinaryTreeParenthesisCorrectness(btStr)){
            throw new InvalidParameterException();
        }

        //generate queue that contains parsed tokens representing every node in BT
        Deque<String> tokenQueue = tokenizeStringParenthesis(btStr);

        //generates BT and returns it's root node. The null token is equal to the string "()"
        return DeserializeBinaryTree.deserialize(tokenQueue, "()");
    }

    /**
     *
     * @param btStr formatted parenthesis string
     * @return a queue containing all of the tokens of the binary tree
     */
    public static Deque<String> tokenizeStringParenthesis(String btStr){
        Deque<String> tokenQueue = new ArrayDeque<>();

        int lengthOfToken = 0;
        for(int index = 0; index < btStr.length(); index++){
            char currentChar = btStr.charAt(index);
            //if currentChar is a digit increment length of token. Needed for tokens that are more than 1 digit long
            if(Character.isDigit(currentChar)){
                lengthOfToken++;
            }else{
                //if the current character is not a digit and the length of token is greater than 0 add it to queue
                if(lengthOfToken > 0){
                    insertTokenToQueue(tokenQueue, btStr, index - lengthOfToken, index);
                }//if previous and current character equal to "()" add this token to queue. Its represents a null node
                else if((index >= 1) && ((btStr.charAt(index - 1) == '(') && (currentChar == ')'))){
                    insertTokenToQueue(tokenQueue, btStr, index - 1, index + 1);
                }
                //reset length of token back to 0
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
     * @param tokenQueue queue that contains tokens
     * @param btStr parenthesis formatted binary tree string
     * @param startIndex index at which substring starts
     * @param endIndex index at which substring ends
     */
    private static void insertTokenToQueue(Deque<String> tokenQueue, String btStr, int startIndex, int endIndex){
        String token = btStr.substring(startIndex, endIndex);
        tokenQueue.add(token);
    }

}
