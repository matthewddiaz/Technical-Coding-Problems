import java.text.DecimalFormat;

/**
 * Created by matthewdiaz on 11/1/16.
 */
public class WillBuy {

    boolean isAdmissibleOverpayment(double[] prices, String[] notes, double x) {
        double totalExtraCost = 0;
        for(int i = 0; i < prices.length; i++){
            totalExtraCost += extraCostOfItem(prices[i], notes[i]);
        }
        return totalExtraCost <= x;
    }

    private double extraCostOfItem(double price, String note){
        double extraCost = 0;
        if(note.contains("Same")){
            System.out.println(extraCost);
            return extraCost;
        }else{
            double percentage =
                    Double.parseDouble(note.substring(0,note.indexOf("%")))/100.0;
            System.out.println(percentage);

            DecimalFormat numberFormat = new DecimalFormat("#.00");

            if(note.contains("higher")){
                //should give a positive value
                double storePrice =  Double.parseDouble(numberFormat.format(price/(1 + percentage)));
                System.out.println("Store price " +  storePrice);
                extraCost = price - storePrice;
                System.out.println(extraCost);
            }else{
                //(lower case) should give negative value
                double storePrice =  Double.parseDouble(numberFormat.format(price/(1 - percentage)));
                System.out.println("Store price " + storePrice);
                extraCost = price - storePrice;
                System.out.println(extraCost);
            }
        }
        return extraCost;
    }
}
