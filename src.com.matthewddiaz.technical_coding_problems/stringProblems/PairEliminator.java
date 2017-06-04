package stringProblems;

/**
 * Created by matthewdiaz on 5/12/17.
 */

/**
 * This class moves all char pairs in a string and returns the
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

        StringBuffer strBuffer = new StringBuffer(inputStr);
        int index = 0;

        while(index < strBuffer.length() - 1){
            if(strBuffer.charAt(index) == strBuffer.charAt(index + 1)){
                strBuffer.delete(index, index + 2);
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
