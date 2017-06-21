package stringProblems;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 6/4/17.
 */
public class StringUniqueness {

    /**
     *  returns true if the input String has all unique characters.
     *
     *  Ex:
     *  Input: "matthew"
     *  Output: false
     *
     *  Input: "mark"
     *  Output: true
     */
    public static boolean isStringUnique(String str){
        //ascii has 128 characters therefore if input string length is greater than 128 return false.
        if(str.length() > 128){
            return false;
        }

        //creating a boolean array of size 128 one for each character in the ascii table
        boolean[] asciiArr = new boolean[128];

        //creating an index that will traverse str 1 char at a time
        int index = 0;

        while(index < str.length()){
            //if asciiArr[char] is already true the return false
            char currentChar = str.charAt(index);
            if(asciiArr[currentChar]){
                return false;
            }

            asciiArr[currentChar] = true;
            index++;
        }
        return true;
    }

    /**
     * returns true if the input String has all unique characters. Using no additional data structures
     * Relies on sorting the array and then comparing adjacent indexes
     * @param str
     * @return
     */
    public static boolean isStringUniqueNoDataStructure(String str){
        //ascii has 128 characters therefore if input string length is greater than 128 return false.
        if(str.length() > 128){
            return false;
        }

        //converting input str to charArr to be able to sort it.
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);

        int index = 0;
        while(index < charArr.length - 1){
            //if adjacent chars at equal to each other in the array then return false
            if(charArr[index] == charArr[index + 1]){
                return false;
            }
            index++;
        }
        return true;
    }
}
