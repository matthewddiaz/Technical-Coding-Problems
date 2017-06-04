import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 11/6/16.
 */
public class CircularWalkTest {
    private CircularWalk cw;

    @Before
    public void setUp() throws Exception {
        cw = new CircularWalk();
    }

    @Test
    public void testDoesCircleExist() throws Exception {
        String[] strArr = {"GRGL", "GGGG", "LRLRLRR", "GRGRGRG"};
        boolean[] results = new boolean[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            results[i] =  cw.doesCircleExist(strArr[i]);
        }

        System.out.println(Arrays.toString(results));
    }
}