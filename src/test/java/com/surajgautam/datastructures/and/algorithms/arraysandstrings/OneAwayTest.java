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
    void isOneEditAwayFirstSolution() {
        assertTrue(this.oneAway.isOneEditAwayFirstSolution("pale", "ple"));
        assertTrue(this.oneAway.isOneEditAwayFirstSolution("pales", "pale"));
        assertTrue(this.oneAway.isOneEditAwayFirstSolution("pale", "bale"));
        assertTrue(this.oneAway.isOneEditAwayFirstSolution("applz", "apple"));

        assertFalse(this.oneAway.isOneEditAwayFirstSolution("pale", "bae"));
    }
}
