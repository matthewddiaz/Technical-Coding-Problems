package stringProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/4/17.
 */
class StringUniquenessTest {
    private boolean expectedResult1 = true;
    private boolean expectedResult2 = false;

    @Test
    void isStringUnique() {
        boolean actualResult1 = StringUniqueness.isStringUnique("drake");
        boolean actualResult2 = StringUniqueness.isStringUnique("matthew");
        testingStringUniqueness(actualResult1, actualResult2);
    }

    private void testingStringUniqueness(boolean actualResult1, boolean actualResult2){
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void isStringUniqueNoDataStructure() {
        boolean actualResult1 = StringUniqueness.isStringUniqueNoDataStructure("mark");
        boolean actualResult2 = StringUniqueness.isStringUniqueNoDataStructure("robert");
        testingStringUniqueness(actualResult1, actualResult2);
    }

}