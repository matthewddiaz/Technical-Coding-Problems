package arrayProblems;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by matthewdiaz on 5/21/17.
 */
public class CreateSampleArrays {
    /**
     * Returns a 2D array that contains random elements
     * @return
     */
    public static int[][] create2DArrayWithRandomElements(){
        int[][] arr = new int[5][];

        for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
            int rowLength = generateRandomNumber(0, 10);
            arr[rowIndex] = new int[rowLength];
            for (int index = 0; index < rowLength; index++){
                arr[rowIndex][index] = generateRandomNumber(0, 50);
            }
        }
        return arr;
    }

    /**
     * Returns a random int from the range [min, max]
     * @param min
     * @param max
     * @return
     */
    public static int generateRandomNumber(int min, int max){
        return ThreadLocalRandom.current().nextInt(0, max + 1);
    }
}
