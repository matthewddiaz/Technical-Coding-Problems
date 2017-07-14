package treeProblems;

import com.matthewddiaz.datastructures.stack.Stack;
import com.matthewddiaz.datastructures.trees.BinaryTree;

/**
 * Created by matthewdiaz on 7/11/17.
 */
public class ConvertStringToBinaryTree {
    public static BinaryTree.Node generateBinaryTree(String str) throws Exception {
        //case where input string is null or empty
        if(str == null || str.length() == 0){
            return null;
        }

        //check if input string is valid binary tree parenthesis
        if(!CheckBTStringParenthesisValidity.checkBinaryTreeParenthesisCorrectness(str)){
            throw new Exception();
        }

        //convert string to String buffer for easier modification
        StringBuffer strBuffer = new StringBuffer(str);

        int endIndex = 0;
        int startIndex = 0;


        while(endIndex > strBuffer.length()){
            BinaryTree.Node leftChild = parseStringBuffer(strBuffer, startIndex, endIndex);


            //right child steps!
            endIndex = generateEndIndex(strBuffer, endIndex);
            startIndex = endIndex;
            startIndex = generateStartIndex(strBuffer, startIndex);


            BinaryTree.Node rightChild = generateNode(strBuffer, startIndex, endIndex);

            strBuffer.delete(startIndex, endIndex + 1);
            //move end to startIndex shifting over from delete
        }

        return null;

    }

    private static BinaryTree.Node parseStringBuffer(StringBuffer strBuffer, int startIndex, int endIndex){
        //Find index of the first closing brace encountered. This will be our end index
        endIndex = generateEndIndex(strBuffer, endIndex);
        startIndex = endIndex;

        //Find index of the nearest opening brace from the closing brace encountered. This will be our start index
        startIndex = generateStartIndex(strBuffer, startIndex);

        BinaryTree.Node leftChild = generateNode(strBuffer, startIndex, endIndex);
        //delete that interval
        strBuffer.delete(startIndex, endIndex + 1);
        endIndex = startIndex;
        return null;
    }

    private static int generateEndIndex(StringBuffer strBuffer, int currentIndex){
        while((currentIndex < strBuffer.length()) && (strBuffer.charAt(currentIndex) != ')')){
            currentIndex++;
        }

        return currentIndex;
    }

    private static int generateStartIndex(StringBuffer strBuffer, int currentIndex){
        while((currentIndex >= 0) && (strBuffer.charAt(currentIndex) != '(')){
            currentIndex--;
        }
        return currentIndex;
    }

    private static BinaryTree.Node generateNode(StringBuffer str, int startIndex, int endIndex){
        StringBuffer subString = new StringBuffer();

        for(int index = startIndex; index <= endIndex; index++){
            subString.append(str.charAt(index));
        }

        if(subString.toString().equals("()")){
            return null;
        }else{
            int value = Integer.parseInt(subString.substring(startIndex + 1, endIndex));
            return new BinaryTree.Node(value);
        }

    }
}
