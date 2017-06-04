import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * Created by matthewdiaz on 10/17/16.
 */
public class GCDTest {
    private GCD gcd;

    @Before
    public void setUp() throws Exception {
        gcd = new GCD();
    }

    @Test
    public void testFactorsOfNum() throws Exception {
        Set<Integer> factors = gcd.factorsOfNum(1000);
        factors.forEach((factor)->{
            System.out.println(factor);
        });
    }

    @Test
    public void testGcd() throws Exception {
        System.out.println(gcd.gcd(1000000, 2400));
        System.out.println(gcd.gcd(81, 54));

    }

    @Test
    public void testEfficentGCD() throws Exception {
        System.out.println(gcd.gcd(1000000, 2400));
        System.out.println(gcd.gcd(81, 54));
    }
}