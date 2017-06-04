import java.util.Scanner;

/**
 * Created by matthewdiaz on 10/30/16.
 */
public class Spiral{

    private static class Position{
        int row;
        int col;

        Position(){
            row = 0;
            col = 0;
        }
    }

    private enum Direction {
        EAST (0),
        NORTH (90),
        WEST (180),
        SOUTH (270);

        private int degree;

        Direction(int degree) {
            this.degree = degree;
        }
    }

    public static void main(String args[] ) throws Exception {
        String[][] inputMatrix = createMatrix();
        printMatrixInSpiralOrder(inputMatrix);
    }

    //creates matrix from std input
    private static String[][] createMatrix(){
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(",");
        int numOfRows = Integer.parseInt(matrixData[0]);
        int numOfCols = Integer.parseInt(matrixData[1]);

        String[][] matrix = new String[numOfRows][numOfCols];
        int count = 0;
        while(scanner.hasNextLine()){
            //inserting row by row
            matrix[count++] = scanner.nextLine().split(",");
        }
        return matrix;
    }

    public static void printMatrixInSpiralOrder(String[][] inputMatrix){
        int numOfRows = inputMatrix.length;
        int numOfCols = inputMatrix[0].length;
        boolean[][] visitedMatrix = new boolean[numOfRows][numOfCols];

        int numOfElements = numOfRows * numOfCols;
        int count = 1;
        Direction currentDirection = Direction.EAST;
        Position currentPosition = new Position ();

        visitPosition(visitedMatrix,  currentPosition);
        printValue(inputMatrix, currentPosition, count, numOfElements);

        while(count < numOfElements){
            while(canAdvanceForward(currentPosition, currentDirection, visitedMatrix)){
                count++;
                walk(currentPosition, currentDirection);
                visitPosition(visitedMatrix, currentPosition);
                printValue(inputMatrix, currentPosition, count, numOfElements);
            }
            currentDirection = turnRight(currentDirection);
        }
    }

    public static void printValue(String[][] matrix, Position p, int count, int numOfElements){
        System.out.print(matrix[p.row][p.col]);
        if(count < numOfElements){
            System.out.print(",");
        }
    }

    public static boolean canAdvanceForward(Position p , Direction d, boolean[][] visitedMatrix){
        boolean result = false;
        //east
        if((d.degree == 0) && ((p.col + 1 < visitedMatrix[0].length) && (visitedMatrix[p.row][p.col + 1] == false)) ){
                result = true;
        //up
        }else if((d.degree == 90) && (p.row - 1 >= 0 && visitedMatrix[p.row - 1][p.col] == false)){
            result = true;
        //west
        }else if((d.degree == 180) && (p.col - 1 >= 0 && visitedMatrix[p.row][p.col - 1] == false)){
            result = true;
        //down
        }else if((d.degree == 270) && (p.row + 1 < visitedMatrix.length && visitedMatrix[p.row + 1][p.col] == false)){
            result = true;
        }
        return result;
    }

    private static Direction turnRight(Direction d){
        if(d.degree == 0){
            d.degree = 360;
        }
        d.degree = d.degree - 90;
        return d;
    }

    /*
     *   Note: the matrix is A[x][y] and starting position is A[0][0]
     *
     *       col1  col2  col3
     *
     *   Row   O    1     2
     *   Row   3    4     5
     *   Row   6    7     8
     *
     */
    public static void walk(Position p , Direction d){
        switch(d.degree){
            //moving east --->
            case 0  :   p.col++;
                break;

            //moving north (up)
            case 90 :   p.row--;
                break;

            //moving west <---
            case 180:   p.col--;
                break;

            //moving south (down)
            case 270:   p.row++;
                break;
            default :   break;
        }
    }

    public static void visitPosition(boolean[][] visitedMatrix, Position p){
        visitedMatrix[p.row][p.col] = true;
    }
}

