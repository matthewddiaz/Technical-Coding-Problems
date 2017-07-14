package treeProblems;

import com.matthewddiaz.datastructures.trees.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/14/17.
 */
class DeserializeStringParenthesisToBTTest {
    String simpleStr1 = "(10()())";
    String simpleStr2 = "(10(5()())(15()()))";
    String simpleStr3 = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";


    @Test
    void deserializeStringParenthesis() {
        BinaryTree.Node root = DeserializeStringParenthesisToBT.DeserializeStringParenthesis(simpleStr3);
        String preOrderTraversalStr = BinaryTree.preOrderTraversal(root);
        System.out.println(preOrderTraversalStr);
    }

    @Test
    void tokenizeStringParenthesis() {
        Deque<String> tokenQueue1 = DeserializeStringParenthesisToBT.tokenizeStringParenthesis(simpleStr1);
        System.out.println("Queue size: " + tokenQueue1.size());
        printTokensInQueue(tokenQueue1);

        Deque<String> tokenQueue2 = DeserializeStringParenthesisToBT.tokenizeStringParenthesis(simpleStr2);
        System.out.println("Queue size: " + tokenQueue2.size());
        printTokensInQueue(tokenQueue2);


        Deque<String> tokenQueue3 = DeserializeStringParenthesisToBT.tokenizeStringParenthesis(simpleStr3);
        System.out.println("Queue size: " + tokenQueue3.size());
        printTokensInQueue(tokenQueue3);

    }

    private void printTokensInQueue(Deque<String> tokenQueue){
        StringBuffer buffer = new StringBuffer();
        while(!tokenQueue.isEmpty()){
            buffer.append(tokenQueue.remove() + "\n");
        }
        System.out.println(buffer.toString());
    }

}