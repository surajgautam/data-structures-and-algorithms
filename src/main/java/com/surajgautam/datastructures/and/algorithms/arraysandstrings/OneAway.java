package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

/*
There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a
character. Given two strings, write a function to check if they are one edit(or zero edits) away.
EXAMPLE:
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bae -> false
 */
public class OneAway {

    public boolean isOneEditAwayFirstSolution(String firstValue, String secondValue) {
        boolean isSameLength = firstValue.length() == secondValue.length();
        if (isSameLength) {
            return isOneEditReplace(firstValue, secondValue);
        } else if (firstValue.length() + 1 == secondValue.length()) { //aple, apple
            return isOneEditInsert(firstValue, secondValue); //always string with less length will be first argument
        } else if (firstValue.length() - 1 == secondValue.length()) { //apple, aple
            return isOneEditInsert(secondValue, firstValue);
        }
        return false;
    }

    private boolean isOneEditInsert(String firstValue, String secondValue) {
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < firstValue.length() && secondIndex < secondValue.length()) {
            if (firstValue.charAt(firstIndex) != secondValue.charAt(secondIndex)) {
                if (firstIndex != secondIndex) {
                    return false; //for the first time, the index will be same and for second time it will be different
                }
                secondIndex++; //only increase second index and compare
            } else {
                firstIndex++;
                secondIndex++;
            }
        }
        return true;
    }

    private boolean isOneEditReplace(String firstValue, String secondValue) {
        boolean foundDifference = false;
        for (int i = 0; i < firstValue.length(); i++) {
            if (firstValue.charAt(i) != secondValue.charAt(i)) {
                if (foundDifference) { //second difference
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}
