package stringProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/4/17.
 */
class ReverseStringTest {
    @Test
    void reverseString() {

        String expectedResult1 = "edcba";
        String expectedResult2 = "zaidwehttam";

        String actualResult1 = ReverseString.reverseString("abcde");
        String actualResult2 = ReverseString.reverseString("matthewdiaz");

        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }
}