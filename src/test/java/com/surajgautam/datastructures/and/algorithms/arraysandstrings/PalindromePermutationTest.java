package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromePermutationTest {

    private PalindromePermutation palindromePermutation;

    @BeforeEach
    void setUp() {
        this.palindromePermutation = new PalindromePermutation();
    }

    @Test
    void testPalindromePermutation() {
        assertTrue(this.palindromePermutation.isPermutationOfPalindrome("Tact Coa"));
        assertTrue(this.palindromePermutation.isPermutationOfPalindrome("abba"));
        assertTrue(this.palindromePermutation.isPermutationOfPalindrome("racecar"));

        //todo add validations and test cases
        assertFalse(this.palindromePermutation.isPermutationOfPalindrome("test"));
    }
}
