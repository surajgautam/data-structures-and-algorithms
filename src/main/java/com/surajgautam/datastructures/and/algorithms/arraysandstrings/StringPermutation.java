package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import java.util.Arrays;
import java.util.Objects;

/*
Given two strings, write a method to decide if one is a permutation of the other.
AKA - Anagram
 */
public class StringPermutation {

    public boolean isPermutation(String firstValue, String secondValue) {
        if (Objects.isNull(firstValue) || firstValue.isEmpty() || Objects.isNull(secondValue) || secondValue.isEmpty()) {
            return false;
        }
        if (firstValue.length() != secondValue.length()) {
            return false;
        }
        return getSortedValue(firstValue).equals(getSortedValue(secondValue));
    }

    public boolean isPermutationUsingArrays(String firstValue, String secondValue) {
        if (Objects.isNull(firstValue) || firstValue.isEmpty() || Objects.isNull(secondValue) || secondValue.isEmpty()) {
            return false;
        }
        if (firstValue.length() != secondValue.length()) {
            return false;
        }
        int[] values = new int[128]; //assumed ASCII

        for (int i = 0; i < firstValue.length(); i++) {
            //In string test, t will be in index 116 with value 2. e in 101 with value 1
            values[firstValue.charAt(i)]++;
        }

        for (int i = 0; i < secondValue.length(); i++) {
            //decrement the value for the characters in the array. for example t in test will have 0 as value at the end.
            values[secondValue.charAt(i)]--;
            if (values[secondValue.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public String getSortedValue(String value) {
        char[] values = value.toCharArray();
        Arrays.sort(values); // O (n log n)
        return new String(values);
    }

}
