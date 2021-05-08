package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringPermutationTest {

    StringPermutation stringPermutation = new StringPermutation();

    @BeforeEach
    void setUp() {
        assertTrue(stringPermutation.isPermutation("test", "estt"));
    }

    @Test
    void isPermutationTrue() {
        assertTrue(stringPermutation.isPermutation("test", "estt"));
        assertTrue(stringPermutation.isPermutation("God", "doG"));
    }

    @Test
    void isPermutationFalse() {
        assertFalse(stringPermutation.isPermutation(null, "estt"));
        assertFalse(stringPermutation.isPermutation("God", null));
        assertFalse(stringPermutation.isPermutation("test", "tests"));
    }


}
