package stringProblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matthewdiaz on 10/23/16.
 */
public class LongestNonDuplicateSubstring {

    /**
     * Given an input String return the length of the longest non-duplicate substring
     *
     * Ex:
     * input: "abcabcbb"
     * output: 3 => "abc" is one of the longest non-duplicate substrings
     *
     * input: "abbacdhefghcas"
     * output: 8 => "bacdhefg" is the longest non-duplicate substring
     *
     * @param inputStr
     * @return
     */
    public static int lengthOfLongestSubstring(String inputStr) {
        //return 0 if inputString is empty or null
        if(inputStr == null || inputStr.equals("")){
            return 0;
        }

        //map contains the relation between character and its last appearance index
        Map<Character, Integer> indexOfCharMap = new HashMap<>();
        int maxLength = 0;
        int startOfSubStringIndex = 0;

        for(int index = 0; index < inputStr.length(); index++){
            char currentChar = inputStr.charAt(index);
            //if currentChar is a duplicate; compare its last occurrence index vs the start of substring index
            //if the last occurrence index happened after the start of substring; change the start of the substring
            if(indexOfCharMap.containsKey(currentChar)){
                startOfSubStringIndex = max(startOfSubStringIndex, indexOfCharMap.get(currentChar) + 1);
            }

            indexOfCharMap.put(currentChar, index);
            //current substring length is the interval between the current index and the start of the substring
            int currentSubStringLength = (index - startOfSubStringIndex) + 1;
            maxLength = max(maxLength, currentSubStringLength);
        }

        return maxLength;
    }

    /**
     * Returns max value of the to input values
     * @param value1
     * @param value2
     * @return
     */
    private static int max(int value1, int value2){
        return (value1 > value2) ? value1 : value2;
    }
}
