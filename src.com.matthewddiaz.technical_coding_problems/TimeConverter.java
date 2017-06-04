/**
 * Created by matthewdiaz on 8/25/16.
 */
public class TimeConverter {
    private static final String DELIMITER = ":";

    public String convertTime(String inputTime) {
        String[] hourFields = inputTime.split(DELIMITER);
        int hourField = Integer.parseInt(hourFields[0]);

        if(hourFields[2].contains("AM") && Integer.parseInt(hourFields[0]) == 12){
            hourField -= 12;
        }else if((hourFields[2].contains("PM")) && (Integer.parseInt(hourFields[0]) != 12)) {
            hourField += 12;
        }

        int minuteField = Integer.parseInt(hourFields[1]);
        int secondField = Integer.parseInt(hourFields[2].substring(0,2));

        String strHour = convertLessThan10(hourField);
        String strMinute = convertLessThan10(minuteField);
        String strSecond = convertLessThan10(secondField);

        return strHour + DELIMITER + strMinute + DELIMITER + strSecond;
    }

    private static String convertLessThan10(int timeOperand){
        String strOfTimeOperand = "" + timeOperand;
        if(timeOperand < 10){
            strOfTimeOperand = "0" + strOfTimeOperand;
        }
        return strOfTimeOperand;
    }

}