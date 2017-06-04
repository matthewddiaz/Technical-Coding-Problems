import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by matthewdiaz on 12/19/16.
 */
public class ArithemicExpressionTest {
    private ArithemicExpression arithemicExpression;
    private Map<Character, Integer> map;

    @Before
    public void setUp() throws Exception {
        arithemicExpression = new ArithemicExpression();
        map = populateMap();
    }

    private Map<Character, Integer> populateMap(){
        Map<Character, Integer> map = new HashMap<>();
        //A=2, B=3, C=1, D=4, E=6
        map.put('A', 2);
        map.put('B', 3);
        map.put('C', 1);
        map.put('D', 4);
        map.put('E', 6);
        return map;
    }

    @Test
    public void testIsMapCombiniationValid() throws Exception {
        boolean expectedResult = true;
        boolean actualResult = arithemicExpression.isMapCombiniationValid("ABC", "ABC", "DEA", map);
        assertEquals(expectedResult,actualResult);
    }
}