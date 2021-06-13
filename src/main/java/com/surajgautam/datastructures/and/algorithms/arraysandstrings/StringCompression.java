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

    public String preDefinedStringBuilderCompress(String value) {
        int compressedValueLength = getCompressedValueLength(value);
        if (compressedValueLength >= value.length()) {
            return value;
        }
        //for long string this will be efficient as we don't need to double stringbuilder once it reaches its capacity
        StringBuilder compressedValue = new StringBuilder(compressedValueLength);
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            count++;
            if (i + 1 >= value.length() || value.charAt(i) != value.charAt(i + 1)) {
                compressedValue.append(value.charAt(i)).append(count);
                count = 0;
            }
        }
        return compressedValue.toString();
    }

    private int getCompressedValueLength(String value) {
        int count = 0;
        int compressedLength = 0;
        for (int i = 0; i < value.length(); i++) {
            count++;
            if (i + 1 >= value.length() || value.charAt(i) != value.charAt(i + 1)) {
                compressedLength = 1 + String.valueOf(count).length();
                count = 0;
            }
        }
        return compressedLength;
    }
}
