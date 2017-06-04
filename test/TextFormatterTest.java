import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by matthewdiaz on 3/13/17.
 */
public class TextFormatterTest {
    private TextFormatter textFormatter;

    @Before
    public void setUp() throws Exception {
        textFormatter = new TextFormatter();
    }

    @Test
    public void textJustification() throws Exception {
        String[] arr = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxLineLength = 16;
        String[] result = textFormatter.textJustification(arr, maxLineLength);
        System.out.println(Arrays.toString(result));
    }
}