package arrayProblems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/4/17.
 */
class ArrayDigitSortTest {
    private ArrayDigitSort sort = new ArrayDigitSort();
    @Test
    void digitRootSort() {
        int[] a = {100, 22, 4, 11, 31, 103};
        int[] b = {13, 20, 7, 4};
        sort.digitRootSort(b);
        System.out.println(Arrays.toString(b));
        sort.digitRootSort(a);
        System.out.println(Arrays.toString(a));
    }

}