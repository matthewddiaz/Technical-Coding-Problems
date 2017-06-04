package arrayProblems;

/**
 * Created by matthewdiaz on 8/25/16.
 */
public class CircularArrayRotation {

    public <T> void shiftAllElementsClockWise(T[] arr){
        for(int index = arr.length - 1; index > 0; index--){
            int tempIndex = (index + 1) % arr.length;
            T tempVal = arr[tempIndex];
            arr[tempIndex] = arr[index];
            arr[index] = tempVal;
        }
    }
}
