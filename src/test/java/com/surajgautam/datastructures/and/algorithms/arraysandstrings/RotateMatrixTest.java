package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateMatrixTest {

    private RotateMatrix rotateMatrix;

    @BeforeEach
    void setUp() {
        this.rotateMatrix = new RotateMatrix();
    }

    @Test
    void canRotate2by2Matrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = this.rotateMatrix.rotate(matrix);

        assertEquals(7, rotatedMatrix[0][0]);
        assertEquals(4, rotatedMatrix[0][1]);
        assertEquals(1, rotatedMatrix[0][2]);
        assertEquals(8, rotatedMatrix[1][0]);
        assertEquals(5, rotatedMatrix[1][1]);
        assertEquals(2, rotatedMatrix[1][2]);
        assertEquals(9, rotatedMatrix[2][0]);
        assertEquals(6, rotatedMatrix[2][1]);
        assertEquals(3, rotatedMatrix[2][2]);
    }

    @Test
    void canRotate2by2MatrixInPlace() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = this.rotateMatrix.rotateInPlaceSolution(matrix);

        assertEquals(7, rotatedMatrix[0][0]);
        assertEquals(4, rotatedMatrix[0][1]);
        assertEquals(1, rotatedMatrix[0][2]);
        assertEquals(8, rotatedMatrix[1][0]);
        assertEquals(5, rotatedMatrix[1][1]);
        assertEquals(2, rotatedMatrix[1][2]);
        assertEquals(9, rotatedMatrix[2][0]);
        assertEquals(6, rotatedMatrix[2][1]);
        assertEquals(3, rotatedMatrix[2][2]);
    }

    @Test
    void canRotate4by4Matrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] rotatedMatrix = this.rotateMatrix.rotate(matrix);

        assertEquals(13, rotatedMatrix[0][0]);
        assertEquals(9, rotatedMatrix[0][1]);
        assertEquals(5, rotatedMatrix[0][2]);
        assertEquals(1, rotatedMatrix[0][3]);
        assertEquals(14, rotatedMatrix[1][0]);
        assertEquals(10, rotatedMatrix[1][1]);
        assertEquals(6, rotatedMatrix[1][2]);
        assertEquals(2, rotatedMatrix[1][3]);
        assertEquals(15, rotatedMatrix[2][0]);
        assertEquals(11, rotatedMatrix[2][1]);
        assertEquals(7, rotatedMatrix[2][2]);
        assertEquals(3, rotatedMatrix[2][3]);
        assertEquals(16, rotatedMatrix[3][0]);
        assertEquals(12, rotatedMatrix[3][1]);
        assertEquals(8, rotatedMatrix[3][2]);
        assertEquals(4, rotatedMatrix[3][3]);
    }

    @Test
    void canRotate4by4MatrixInPlace() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] rotatedMatrix = this.rotateMatrix.rotateInPlaceSolution(matrix);

        assertEquals(13, rotatedMatrix[0][0]);
        assertEquals(9, rotatedMatrix[0][1]);
        assertEquals(5, rotatedMatrix[0][2]);
        assertEquals(1, rotatedMatrix[0][3]);
        assertEquals(14, rotatedMatrix[1][0]);
        assertEquals(10, rotatedMatrix[1][1]);
        assertEquals(6, rotatedMatrix[1][2]);
        assertEquals(2, rotatedMatrix[1][3]);
        assertEquals(15, rotatedMatrix[2][0]);
        assertEquals(11, rotatedMatrix[2][1]);
        assertEquals(7, rotatedMatrix[2][2]);
        assertEquals(3, rotatedMatrix[2][3]);
        assertEquals(16, rotatedMatrix[3][0]);
        assertEquals(12, rotatedMatrix[3][1]);
        assertEquals(8, rotatedMatrix[3][2]);
        assertEquals(4, rotatedMatrix[3][3]);
    }
}
