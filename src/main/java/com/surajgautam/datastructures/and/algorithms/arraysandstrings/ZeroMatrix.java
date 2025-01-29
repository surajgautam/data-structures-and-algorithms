package com.surajgautam.datastructures.and.algorithms.arraysandstrings;


import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

    // O(R+C) space, R = rows array, C=columns array
    //O(R * C) time complexity
    public int[][] fillZeroesBetterApproach(int[][] matrix) {
        Set<Integer> alreadyZeroForRow = new HashSet<>();
        Set<Integer> alreadyZeroForColumn = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    alreadyZeroForRow.add(i);
                    alreadyZeroForColumn.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (alreadyZeroForRow.contains(i) || alreadyZeroForColumn.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    //O(1) space
    public int[][] fillZeroesOptimalApproach(int[][] matrix) {
        return matrix;
    }

}
