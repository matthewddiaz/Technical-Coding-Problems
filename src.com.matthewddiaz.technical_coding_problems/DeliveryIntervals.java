import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewdiaz on 11/1/16.
 */
public class DeliveryIntervals {
    private class Time implements Comparable<Time>{
        int hour;
        int minute;
        Time(int hour,int minute){
            if (hour < 0 || hour > 23)
                throw new IllegalArgumentException(hour + " is out of range");

            if (minute < 0 || minute > 59)
                throw new IllegalArgumentException(minute + " is out of range");

            this.hour = hour;
            this.minute = minute;
        }

        public Time add(Time t){
            int newMinute = this.minute + t.minute;
            int newHour = this.hour + t.hour;

            if(newMinute >= 60){
                    newMinute %= 60;
                    newHour += 1;
            }

            if(newHour >= 24) {
                newHour %= 24;
            }
            return new Time(newHour, newMinute);
        }

        @Override
        public int compareTo(Time o) {
            int hour_diff = this.hour - o.hour;
            int minute_diff = this.minute - o.minute;

            if((this.hour - o.hour > 0) || (hour_diff == 0 && minute_diff > 0)){
                return 1;
            }else if(hour_diff == 0 && minute_diff == 0){
                return 0;
            }else{
                return -1;
            }
        }
    }

    private class Interval implements Comparable<Interval>{
        Time start;
        Time end;

        Interval(Time start, Time end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Interval o) {
            return 0;
        }
    }

    private List<Interval> transformToIntervalList(String[][] arr){
        List<Interval> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            String[] arr_interval = arr[i];
            Interval interval = createInterval(arr_interval);
            list.add(interval);
        }
        return list;
    }

    private Interval createInterval(String[] arr){
        String[] parsedInput = arr[0].split(":");
        return new Interval(new Time(11,32), new Time(10,22));
    }
}
