package com.surajgautam.datastructures.and.algorithms.arraysandstrings;


public class RotateMatrix {

    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotatedMatrix[i][j] = matrix[n - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }

    public int[][] rotateInPlaceSolution(int[][] matrix) {
        int length = matrix.length; //nxn matrix
        /*
        transpose a matrix and then swap the elements from the rows using 2 pointer solution
        for eg:
         [1 2 3        [1   4   7     [7    4   1
          4 5 6   =>    2   5   8  => 8     5   2
          7 8 9[        3   6   9]    9     6   3]
         */
        //first transpose
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse columns
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = temp;
            }
        }

        return matrix;

    }
}
