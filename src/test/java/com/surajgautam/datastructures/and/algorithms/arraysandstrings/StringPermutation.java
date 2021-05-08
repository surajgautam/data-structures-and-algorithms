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
        char[] firstValueChars = firstValue.toCharArray();
        char[] secondValueChars = secondValue.toCharArray();

        Arrays.sort(firstValueChars);
        Arrays.sort(secondValueChars);

        return new String(firstValueChars).equals(new String(secondValueChars));
    }

}
