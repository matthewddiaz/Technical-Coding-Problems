import org.junit.Test;

/**
 * Created by matthewdiaz on 10/30/16.
 */
public class SpiralTest {

//    @Test
//    public void testMain() throws Exception {
//
//    }
//
//    @Test
//    public void testPrintValue() throws Exception {
//
//    }
//
//    @Test
//    public void testCanAdvanceForward() throws Exception {
//
//    }
//
//    @Test
//    public void testWalk() throws Exception {
//
//    }
//
//    @Test
//    public void testVisitedPosition() throws Exception {
//
//    }

    @Test
    public void testPrintMatrixInSpiralOrder() throws Exception {
        String[][] input3By3 = {{"1", "2", "3"}, {"4","5", "6"}, {"7", "8", "9"}};
        String[][] input3By4 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        String[][] input3By6 = {{"1", "2", "3"}, {"4","5", "6"}, {"7", "8", "9"},
                                {"10", "11", "12"}, {"13","14", "15"}, {"16", "17", "18"}};


        //Spiral.printMatrixInSpiralOrder(input3By3);
        System.out.println();

        //Spiral.printMatrixInSpiralOrder(input3By4);

        System.out.println();
        Spiral.printMatrixInSpiralOrder(input3By6);
    }
}