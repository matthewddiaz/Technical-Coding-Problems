import org.junit.Before;
import org.junit.Test;

/**
 * Created by matthewdiaz on 11/1/16.
 */
public class WillBuyTest {
    private WillBuy w;

    @Before
    public void setUp() throws Exception {
        this.w = new WillBuy();
    }

    @Test
    public void testIsAdmissibleOverpayment() throws Exception {
        double[] prices = {110, 95, 70};

        String[] str = {"10.0% higher than in-store",
                "5.0% lower than in-store",
                "Same as in-store"};
        double x =  5;

        System.out.println(w.isAdmissibleOverpayment(prices, str,x));
    }


}