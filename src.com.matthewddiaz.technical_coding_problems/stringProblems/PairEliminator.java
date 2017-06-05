package stringProblems;

/**
 * Created by matthewdiaz on 5/12/17.
 */

/**
 * This class removes all char pairs in a string and returns the
 * reduced string.
 *
 * Example 1:
 * input: abbe
 * output: ae
 *
 * Example 2:
 * input: aabbccde
 * output: de
 *
 * Example 3:
 * input: habcddcbai
 * output: hi
 */
public class PairEliminator {
    public static String reduceString(String inputStr){
        //check if initial String is empty
        if(inputStr.length() == 0){
            return "Empty String";
        }

        //creating converting the inputStr into a StringBuffer for efficiency in appending Strings
        StringBuffer strBuffer = new StringBuffer(inputStr);
        int index = 0;

        //iterating over the buffer
        while(index < strBuffer.length() - 1){
            //if two adjacent characters are equal to each other delete them and then decrement current index by 1
            if(strBuffer.charAt(index) == strBuffer.charAt(index + 1)){
                strBuffer.delete(index, index + 2);
                //making sure that not to have negative index
                if(index > 0){
                    index--;
                }
            }else{
                index++;
            }
        }

        //check if final reduced String is empty
        if(strBuffer.length() == 0){
            return "Empty String";
        }

        return strBuffer.toString();
    }
}
