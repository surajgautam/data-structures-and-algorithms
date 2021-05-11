package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

/*
Given a string, write a function to check if it is a permutation of a palindrome.
for example: Tact Coa
Output: True(permutations: "taco cat", "atco cta"
 */
public class PalindromePermutation {

    //for palindrome of odd length -> count will be 1 for one character, // racecar for e the count is 1
    //for palindrome of even length -> all the character's count will be even //abba , both has count 2
    boolean isPermutationOfPalindrome(String value) {
        int[] table = putCharacterFrequency(value);
        return checkMaximumOneOdd(table);
    }

    private boolean checkMaximumOneOdd(int[] table) {
        int oddCount = 0;
        for (int count : table) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if(oddCount > 1) {
                return false;
            }
        }
        return true;
    }

    private int[] putCharacterFrequency(String value) {
        //Character.getNumericValue for unicode representation of a character in integer. For example a will have 10.
        // for characters it's value will be -1.
        int[] table = new int[
                Character.getNumericValue('z') -
                        Character.getNumericValue('a') + 1];
        char[] characters = value.toCharArray();
        for (char character : characters) {
            int number = getCharacterNumber(character);
            if (number != -1) {
                table[number]++;
            }
        }
        return table;
    }

    private int getCharacterNumber(char character) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int characterValue = Character.getNumericValue(character);
        if (a <= characterValue && characterValue <= z) {
            return characterValue - a;
        }
        return -1;
    }

}
