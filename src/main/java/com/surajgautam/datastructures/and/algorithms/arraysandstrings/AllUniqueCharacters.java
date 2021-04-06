package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import java.util.HashSet;
import java.util.Set;

/*
Write an algorithm to determine if a string has all unique characters. What if you cannot use an
additional data structures?
 */
public class AllUniqueCharacters {

    public boolean isUnique(String value) {
        boolean isUnique = false;
        return isUnique;
    }

    public boolean isUniqueBruteForce(String value) {
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

}
