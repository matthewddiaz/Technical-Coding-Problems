import org.junit.Before;
import org.junit.Test;

/**
 * Created by matthewdiaz on 9/1/16.
 */
public class SequencesTest {
    private Sequences seq;

    @Before
    public void setUp() throws Exception {
        seq = new Sequences();
    }

    @Test
    public void testArrayMode() throws Exception {
        int[] arr = {7,1,2,4,1,2,1,7,6,3,1,7,2,3,4,6,7,5,7};
        System.out.println(seq.arrayMode(arr));
    }
}