package arrayProblems;

/**
 * Created by matthewdiaz on 10/11/16.
 */
public class ModifyArrayOrder {

    /**
     * This method converts the array of the form
     * input: [a1,a2,a3,b1,b2,b3]
     *
     * into the following order
     * output: [a1,b1,a2,b2,a3,b3]
     *
     * NOTE: No extra auxiliary data structure may be used!
     * @param arr
     * @return
     */
    public static String[] modifyOrder(String[] arr){
        //the middle index points to the index that starts the 'b' section at the start.
        int mid = arr.length/2;
        //
        for(int index = 0; index < mid; index++){
            //index that current b element is located in the array
            int bIndex = mid + index;
            //storing value of b element
            String bValue = arr[bIndex];

            //generating index of the unformatted section. Elements in [0, startOfUnformattedSection - 1]
            //are formatted correctly. NOTE: That all B values are placed on odd indexes. odd numbers = 2*index + 1
            int startIndexOfUnformattedSection = 2*index + 1;

            //shifting all elements in the range from the [startOfUnformattedSection, current b index - 1]
            shiftElementsToTheRightByOne(arr, startIndexOfUnformattedSection, bIndex - 1);

            //set b element into its correct position.
            arr[startIndexOfUnformattedSection] = bValue;
        }
        return arr;
    }

    /**
     * Shifts all elements in the range [start, end] of the input array to the right by one.
     * @param arr
     * @param start
     * @param end
     */
    private static void shiftElementsToTheRightByOne(String[] arr, int start, int end){
        if(start < 0 || (end >= (arr.length - 1))){
            throw new IndexOutOfBoundsException();
        }

        for(int index = end; index >= start; index--){
            arr[index + 1] = arr[index];
        }
    }
}
