package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {

    private StringCompression stringCompression;

    @BeforeEach
    void setUp() {
        this.stringCompression = new StringCompression();
    }

    @Test
    void canCompressString() {
        assertEquals(this.stringCompression.compress("aabcccccddd"), "a2b1c5d3");
        assertEquals(this.stringCompression.compress("ab"), "ab");
    }
}
