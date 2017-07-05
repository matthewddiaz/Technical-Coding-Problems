package stringProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/4/17.
 */
class ParseWordsTest {
    private String[] requests = {"I need a new window.",
            "I really, really want to replace my window!",
            "Replace my window.",
            "I want a new window.",
            "I want a new carpet, I want a new carpet, I want a new carpet.",
            "Replace my carpet"};

    private int[] ids = {374, 2845, 83, 1848, 1837, 1500};

    private double threshold = 0.5;

    @Test
    void spamClusterization() {
        ParseWords.spamClusterization(requests, ids, threshold);
    }

}