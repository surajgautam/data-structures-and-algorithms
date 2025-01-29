package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZeroMatrixTest {

    private ZeroMatrix zeroMatrix;

    @BeforeEach
    void setUp() {
        this.zeroMatrix = new ZeroMatrix();
    }

    @Test
    void testZeroMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 9},
                {10, 11, 12}
        };

        int[][] rotatedMatrix = this.zeroMatrix.fillZeroesBetterApproach (matrix);

        assertEquals(1, rotatedMatrix[0][0]);
        assertEquals(0, rotatedMatrix[0][1]);
        assertEquals(3, rotatedMatrix[0][2]);
        assertEquals(4, rotatedMatrix[1][0]);
        assertEquals(0, rotatedMatrix[1][1]);
        assertEquals(6, rotatedMatrix[1][2]);
        assertEquals(0, rotatedMatrix[2][0]);
        assertEquals(0, rotatedMatrix[2][1]);
        assertEquals(0, rotatedMatrix[2][2]);
        assertEquals(10, rotatedMatrix[3][0]);
        assertEquals(0, rotatedMatrix[3][1]);
        assertEquals(12, rotatedMatrix[3][2]);
    }

}
