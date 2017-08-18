package arrayProblems;

import java.util.Arrays;

/**
 * Created by matthewdiaz on 7/4/17.
 *
 * Sorts the input array in non-descending order based on each digit's digit sum.
 * If two digits have the same sum; the digit with the lower original index position
 * is placed first.
 */
public class ArrayDigitSort {

    /**
     * Wrapper class that contains the numerical value's digitSum and original position in the input array.
     */
    public static class DigitInfo implements Comparable<DigitInfo>{
        int numericValue;
        int digitSum;
        int originalPosition;

        public DigitInfo(int value, int position){
            this.numericValue = value;
            this.originalPosition = position;
            this.digitSum = digitSum(this.numericValue);
        }

        //returns sum of digit
        private int digitSum(int num){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }

        @Override
        public int compareTo(DigitInfo other) {
            //if this element's digitSum is greater than the other's digitSum
            //or the two elements are equal but this element's originalPosition is greater then return 1.
            if(this.digitSum > other.digitSum ||
                    ((this.digitSum == other.digitSum) && (this.originalPosition > other.originalPosition))){
                return 1;
            }else if(this.digitSum < other.digitSum){
                return -1;
            }else{
                return 0;
            }
        }
    }

    /**
     * @param inputArray input array that is sorted based on digit sum values
     */
    public static void digitSort(int[] inputArray){
        DigitInfo[] digitInfoArray = convertToDigitInfoArray(inputArray);
        Arrays.sort(digitInfoArray);
        deserializeDigitInfoArray(digitInfoArray, inputArray);
    }

    /**
     * Converts the input integer array into a digitInfo wrapper array.
     * @param inputArray integer array
     * @return DigitInfo array
     */
    private static DigitInfo[] convertToDigitInfoArray(int[] inputArray){
        DigitInfo[] digitInfoArray = new DigitInfo[inputArray.length];

        for(int index = 0; index < inputArray.length; index++){
            int value = inputArray[index];
            digitInfoArray[index] = new DigitInfo(value, index);
        }
        return digitInfoArray;
    }

    /**
     * populates the inputArray with the numerical values of digitInfoArray in digitSum sorted order.
     * @param digitInfoArray DigitInfo array
     * @param inputArray integer array
     */
    private static void deserializeDigitInfoArray(DigitInfo[] digitInfoArray, int[] inputArray){
        for(int index = 0; index < digitInfoArray.length; index++){
            inputArray[index] = digitInfoArray[index].numericValue;
        }
    }
}
