package treeProblems;

/**
 * Created by matthewdiaz on 6/29/17.
 */
public class CheckBTStringParenthesisValidity {
    /**
     * Checks whether a parenthesized string representation of a Binary Tree is of valid format
     * @param btStr
     * @return returns true if the input string is of valid format
     */
    public static boolean checkBinaryTreeParenthesisCorrectness(String btStr){
        int bracketLevel = 0;
        for(int index = 0; index < btStr.length(); index++){
            char currentChar = btStr.charAt(index);
            //if current Character is an opening bracket '(' increment bracketLevel by 1
            if(currentChar == '('){
                bracketLevel++;
            }//if current character is a closing bracket ')' decrement bracketLevel by 1.
            else if(currentChar == ')') {
                bracketLevel--;
                //the input string parenthesis is invalid if bracketLevel becomes negative at any moment
                if(bracketLevel < 0){
                    return false;
                }
            }
        }

        //bracketLevel must be equal to zero at the end of the input string sequence to be valid
        return  (bracketLevel == 0);
    }
}
