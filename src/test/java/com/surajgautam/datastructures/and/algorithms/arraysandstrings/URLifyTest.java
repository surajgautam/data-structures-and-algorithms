package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class URLifyTest {

    private URLify urLify;

    @BeforeEach
    void setUp() {
        urLify = new URLify();
    }

    @Test
    void canEncode() {
        final String encodedValue = "Mr%20John%20Smith";
        final String input = "Mr John Smith    ";
        assertEquals(encodedValue, urLify.encode(input, 13));
        assertEquals(encodedValue, new String(urLify.encode(input.toCharArray(), 13)));
    }
}
