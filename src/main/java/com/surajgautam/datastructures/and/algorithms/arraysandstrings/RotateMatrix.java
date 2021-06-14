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


//    private void printMatrix(int[][] rotatedMatrix) {
//        for (int i = 0; i < rotatedMatrix.length; i++) {
//            for (int j = 0; j < rotatedMatrix.length; j++) {
//                System.out.print(rotatedMatrix[i][j]);
//                System.out.print('\t');
//            }
//            System.out.println();
//        }
//    }

}
