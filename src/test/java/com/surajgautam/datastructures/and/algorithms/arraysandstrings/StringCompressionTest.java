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
        assertEquals("a2b1c5a3", this.stringCompression.compress("aabcccccaaa"));
        assertEquals("ab", this.stringCompression.compress("ab"));
    }

    @Test
    void canCompressUsingSecondApproach() {
        assertEquals("a2b1c5a3", this.stringCompression.preDefinedStringBuilderCompress("aabcccccaaa"));
        assertEquals("ab", this.stringCompression.preDefinedStringBuilderCompress("ab"));
    }
}
