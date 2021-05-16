package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    private OneAway oneAway;

    @BeforeEach
    void setUp() {
        this.oneAway = new OneAway();
    }

    @Test
    void isOneEditAway() {
        assertTrue(this.oneAway.isOneEditAway("pale", "ple"));
    }
}
