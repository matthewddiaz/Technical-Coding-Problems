package arrayProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewdiaz on 6/6/17.
 */
public class CreateAntiDiagonals {

    /**
     * Given a N*N square matrix, return an array of its anti-diagonals.
     * Anti-diagonals: Are diagonals that start from top-right to bottom-left of an array
     *
     * Input:   1 2 3
     *          4 5 6
     *          7 8 9
     *
     * Output:   [1],
     *           [2, 4],
     *           [3, 5, 7],
     *           [6, 8],
     *           [9]
     *
     * @param matrix
     * @return
     */
    public static List<List<Integer>> createAntiDiagonals(int[][] matrix) {
        //contains list of anti diagonals for input matrix
        List<List<Integer>> antiDiagonalsList = new ArrayList<>();

        //for each col create a new antiDiagonal starting at the first row in the matrix
        for (int col = 0; col < matrix[0].length; col++) {
            ArrayList<Integer> list = new ArrayList<>();

            int rowIndex = 0;
            int colIndex = col;

            //While colIndex is greater than or equal to 0 keep adding elements to the list
            //the element's coordinate is one row down and one col to the left
            while (colIndex >= 0) {
                list.add(matrix[rowIndex++][colIndex--]);
            }

            antiDiagonalsList.add(list);
        }

        //for rows 1 to (n - 1) start each new antiDiagonal with the last col in the matrix
        for (int row = 1; row < matrix.length; row++) {
            ArrayList<Integer> list = new ArrayList<>();

            int colIndex = matrix.length - 1;
            int rowIndex = row;

            //while rowIndex is les than or equal to matrix.Size keep adding elements
            //the next element's coordinates will be one row down and one col to the left.

            while (rowIndex <= matrix.length - 1) {
                list.add(matrix[rowIndex++][colIndex--]);
            }

            antiDiagonalsList.add(list);
        }
        return antiDiagonalsList;
    }

    /**
     * Returns a String representation of the list of anti diagonals
     * Format: [1]
     *         [2, 4]
     *         [3, 5, 7]
     *         [6, 8]
     *         [9]
     *
     * @param antiDiagonals
     * @return
     */
    public static String stringRepresentationOfAntiDiagonals(List<List<Integer>> antiDiagonals){
        StringBuffer buffer = new StringBuffer();

        for(List<Integer> antiDiagonal : antiDiagonals ){
            buffer.append("[ " + antiDiagonal.get(0));

            for (int index = 1; index < antiDiagonal.size(); index++){
                buffer.append(", " + antiDiagonal.get(index) );
            }
            buffer.append(" ]\n");
        }

        return buffer.toString();
    }
}
