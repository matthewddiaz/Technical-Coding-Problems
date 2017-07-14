package stringProblems;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/5/17.
 */
class TestTest {
    String[] arr = {
        "a	    100100",
        "b	    100101",
        "c	    110001",
        "d	    100000",
        "[newline]	    111111",
        "p	    111110",
        "q	    000001"
    };

    String str = "111110000001100100111111100101110001111110";

    @org.junit.jupiter.api.Test
    void decode() {
        String result = Test.decode(arr, str);
        System.out.println(result);
    }

}