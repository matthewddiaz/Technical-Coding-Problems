package stringProblems;

/**
 * Created by matthewdiaz on 6/4/17.
 */
public class ReverseString {

    /**
     * returns a String that is in reverse order of the input string
     * Ex: Input:   "abcde"
     *     Output:  "edcba"
     */
    public static String reverseString(String str){
        //converting input str to char array for easier char manipulation
        char[] charArr = str.toCharArray();

        //creating to indexes; one at the start of the array and another at the end
        int startIndex = 0;
        int endIndex = charArr.length - 1;

        while(startIndex < endIndex){
            //swapping chars at these two respective indexes
            char tempChar = charArr[startIndex];
            charArr[startIndex] = charArr[endIndex];
            charArr[endIndex] = tempChar;

            //increment startIndex by 1 & decrement endIndex by 1
            startIndex++;
            endIndex--;
        }

        return new String(charArr);
    }
}
