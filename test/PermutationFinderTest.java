import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewdiaz on 9/22/16.
 */
public class PermutationFinderTest {
    private PermutationFinder finder;

    @Before
    public void setUp() throws Exception {
        finder = new PermutationFinder();
    }

//    @Test
//    public void testFindAllPermutations() throws Exception {
//
//    }

    @Test
    public void testMergePermutations(){
        List<String> leftList = new ArrayList<>();
        leftList.add("ab");
        leftList.add("ba");
        List<String> rightList = new ArrayList<>();
        rightList.add("cd");
        rightList.add("dc");

        List<String> result = finder.mergePermutations(leftList, rightList);
        result.forEach((permutation)->{
            System.out.println(permutation);
        });
        System.out.println(result.size());
    }
}