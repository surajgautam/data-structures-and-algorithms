package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

/**
 * compress string -> aabcccccaaa should return a2b1c5a3
 * if the compressed string would not be smaller than original string, return original string.
 * assume (a-z) lowercase
 */
public class StringCompression {
    public String compress(String value) {
        char[] characters = value.toCharArray();
        int[] counts = new int[127];
        //insert counts in ascii index for each characters
        for (int i = 0; i < characters.length; i++) {
            int asciiIndex = characters[i] - 'a';
            if (counts[asciiIndex] > 0) {
                counts[asciiIndex]++;
            } else {
                counts[asciiIndex] = 1;
            }
        }
        StringBuilder compressedValue = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                compressedValue.append((char) (i + 'a'))
                        .append(counts[i]);
            }
        }
        return value.length() < compressedValue.length() ? value : compressedValue.toString();
    }
}
