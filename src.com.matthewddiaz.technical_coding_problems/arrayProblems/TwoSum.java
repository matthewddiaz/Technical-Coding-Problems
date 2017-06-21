package arrayProblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matthewdiaz on 6/21/17.
 */
public class TwoSum {

    /**
     * Given an array of ints, return indices of 2 numbers such that they add up to a specific
     * target. Assume that each input has exactly 1 solution and you may not use the same element
     * twice.
     *
     * Ex: [2, 7, 11, 15], target = 9,
     * Solution: Index: 0 and Index: 1
     *
     * @param inputArr
     * @param target
     * @return
     */
    public static int[] twoSum(int[] inputArr, int target) {
        //key : element, value : index of element
        Map<Integer, Integer> map = new HashMap<>();

        int[] indexArray = new int[2];

        //iterating through each element to determine
        for (int index = 0; index < inputArr.length; index++) {
            //value of second num must be (target - currentNum)
            int valueOfSecondNum = target - inputArr[index];

            //if the map contains the second num and that numbers index is not equal to currentNum
            //return the index of current Num and the index of the second num
            if (map.containsKey(valueOfSecondNum)) {
                int secondNumIndex = map.get(valueOfSecondNum);
                if (secondNumIndex != index) {
                    return arrangeOrderOfIndexes(indexArray, index, secondNumIndex);
                }
            }else{
                //insert current number to map
                map.put(inputArr[index], index);
            }
        }
        return indexArray;
    }

    //The lower index will always appear as the first element in indexArray
    private static int[] arrangeOrderOfIndexes(int[] indexArr, int indexOf1, int indexOf2){
        if (indexOf1 < indexOf2) {
            indexArr[0] = indexOf1;
            indexArr[1] = indexOf2;
        } else {
            indexArr[0] = indexOf2;
            indexArr[1] = indexOf1;
        }
        return indexArr;
    }
}
