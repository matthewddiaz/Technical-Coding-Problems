package arrayProblems;

/**
 * Created by matthewdiaz on 8/25/16.
 */
public class CircularArrayRotation {

    /**
     * Shifts all elements in the input array by shiftAmount of indexes to the right.
     * @param inputArr
     * @param shiftAmount
     * @param <T>
     */
    public static <T> void shiftAllElementsClockWise(T[] inputArr, int shiftAmount){
        int arrayLastIndex = inputArr.length - 1;
        if(shiftAmount > arrayLastIndex){
            shiftAmount = shiftAmount % arrayLastIndex;
        }

        //temp array to temporarily store all elements that will be moved to front of array
        T[] temp = (T[]) new Object[shiftAmount];

        //moving all elements from input array in the range [splitIndex, arrayLastIndex] to temp array
        int splitIndex = inputArr.length - shiftAmount;
        for(int index = 0; index < shiftAmount; index++){
            temp[index] = inputArr[splitIndex + index];
        }

        //shift all elements from input array by shiftAmount.
        //Note: The temp array created to not have the shift value overwrite the values past splitIndex
        for(int index = arrayLastIndex; index >= shiftAmount; index--){
            inputArr[index] = inputArr[index - shiftAmount];
        }

        //inserting all elements in temp array back to inputArray, but now at the front.
        for(int index = 0; index < shiftAmount; index++){
            inputArr[index] = temp[index];
        }
    }
}
