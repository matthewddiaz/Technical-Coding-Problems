package arrayProblems;

/**
 * Created by matthewdiaz on 5/21/17.
 */
public class MatrixTraversals {

    /**
     * Traverses a 2D array. Each row is printed in a new line.
     * Each row is printed in thw following format
     * Ex: row 0: [ , , , ]
     * @param arr
     */
    public static String traverseRows(int[][] arr){
        StringBuffer buffer = new StringBuffer();
        for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
            buffer.append("row " + rowIndex + ": [ ");
            if(arr[rowIndex].length == 0){
                buffer.append("Empty Row");
            }else{
                buffer.append(arr[rowIndex][0]);
                for(int colIndex = 1; colIndex < arr[rowIndex].length; colIndex++){
                    buffer.append(", " + arr[rowIndex][colIndex]);
                }
            }
            buffer.append(" ]\n");
        }
        return buffer.toString();
    }

    /**
     * Traverses a 2D array. Each row is printed in a new line.
     * @param arr
     */
    public static String simplifiedRows(int[][] arr){
        StringBuffer buffer = new StringBuffer();
        for(int[] row : arr){
            for(int element : row){
                buffer.append(element + " ");
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }

    /**
     * Returns a string of the elements in the downward diagonal of a (N x N) 2D array
     * Starts from top-right corner and ends at bottom-left corner
     * NOTE: The array should have the same number of rows as cols
     * @param arr
     * @return
     */
    public static String downwardDiagonalString(int[][] arr){
        StringBuffer buffer = new StringBuffer("[ "+ arr[0][0]);
        for(int index = 1; index < arr.length; index++){
            buffer.append(", " + arr[index][index]);
        }
        buffer.append(" ]");
        return buffer.toString();
    }

    /**
     * Returns a string of the elements in the upward diagonal of a (N x N) 2D array
     * Starts from bottom-left corner and end at top-right corner
     * NOTE: The array should have the same number of rows as cols
     * @param arr
     */
    public static String upwardDiagonalString(int[][] arr){
        int lastIndex = arr.length - 1;
        StringBuffer buffer = new StringBuffer("[ " + arr[lastIndex][0]);
        for(int index = 1; index <= lastIndex; index++){
            buffer.append(", " + arr[lastIndex - index][index]);
        }
        buffer.append(" ]");
        return buffer.toString();
    }
}
