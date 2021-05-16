package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import java.util.HashSet;
import java.util.Set;

/*
Write an algorithm to determine if a string has all unique characters. What if you cannot use an
additional data structures?
 */
public class AllUniqueCharacters {
    /*
    O(N) time complexity
    This bruteforce approach is not really bruteforce because the brute force would be to use two loops for comparing each
    characters which has quadratic time complexity.
     */
    public boolean isUniqueUsingSet(String value) {
        char[] items = value.toCharArray();
        boolean isUnique = true;
        Set<Character> characters = new HashSet<>();
        for (char item : items) {
            if (characters.contains(item)) {
                isUnique = false;
                break;
            } else {
                characters.add(item);
            }
        }
        return isUnique;
    }

    public boolean isUniqueUsingBooleanArrays(String value) {
        if (value.length() > 128) { //128 because if value is ASCII character, there will be repeating characters
            // if length is greater than 128
            return false;
        }
        boolean[] values = new boolean[128];
        for (int i = 0; i < value.length(); i++) {
            int asciiValue = value.charAt(i);
            if (values[asciiValue]) { //already exists
                return false;
            }
            values[asciiValue] = true;
        }
        return true;
    }

    public boolean isUniqueUsingBits(String text) {
        int checker = 0;
        for (int i = 0; i < text.length(); i++) {
            int value = text.charAt(i) - 'a';
            if ((checker & (1 << value)) > 0) {
                return false;
            }
            checker = checker | (1 << value);
        }
        return true;
    }

}
