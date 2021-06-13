package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

/**
 * compress string -> aabcccccaaa should return a2b1c5a3
 * if the compressed string would not be smaller than original string, return original string.
 * assume (a-z) lowercase
 */
public class StringCompression {

    public String compress(String value) {
        StringBuilder compressedValue = new StringBuilder();
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            count++;
            if (i + 1 >= value.length() || value.charAt(i) != value.charAt(i + 1)) {
                compressedValue.append(value.charAt(i)).append(count);
                count = 0;
            }
        }
        return value.length() < compressedValue.length() ? value : compressedValue.toString();
    }
}
