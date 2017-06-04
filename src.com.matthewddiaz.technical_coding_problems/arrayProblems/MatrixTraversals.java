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
    public static void traverseRows(int[][] arr){
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
        System.out.println(buffer.toString());
    }

    /**
     * Traverses a 2D array. Each row is printed in a new line.
     * @param arr
     */
    public static void simplifiedRows(int[][] arr){
        for(int[] row : arr){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints the elements in the downward diagonal of a (N x N) 2D array
     * NOTE: The array should have the same number of rows as cols
     * @param arr
     */
    public static void PrintDownwardDiagonal(int[][] arr){
        for(int index = 0; index < arr.length; index++){
            System.out.println(arr[index][index]);
        }
    }

    /**
     * Prints the elements in the upward diagonal of a (N x N) 2D array
     * NOTE: The array should have the same number of rows as cols
     * @param arr
     */
    public static void PrintUpwardDiagonal(int[][] arr){
        for(int index = 0; index < arr.length; index++){
            System.out.println(arr[arr.length - index][index]);
        }
    }
}
