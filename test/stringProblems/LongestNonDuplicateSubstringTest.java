package stringProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/26/17.
 */
class LongestNonDuplicateSubstringTest {
    private String inputStr1 = "abcabcbb";
    private String inputStr2 = "abbacdhefghcas";
    private String inputStr3 = "bbbbb";


    @Test
    void lengthOfLongestSubstring() {
        int expectedResult1 = 3;
        int expectedResult2 = 8;
        int expectedResult3 = 1;

        int actualResult1 = LongestNonDuplicateSubstring.lengthOfLongestSubstring(inputStr1);
        int actualResult2 = LongestNonDuplicateSubstring.lengthOfLongestSubstring(inputStr2);
        int actualResult3 = LongestNonDuplicateSubstring.lengthOfLongestSubstring(inputStr3);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
        assertEquals(expectedResult3, actualResult3);
    }
}