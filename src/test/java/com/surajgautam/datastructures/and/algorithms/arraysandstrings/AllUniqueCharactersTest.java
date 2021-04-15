package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllUniqueCharactersTest {

    private AllUniqueCharacters characters;

    @BeforeEach
    void setUp() {
        this.characters = new AllUniqueCharacters();
    }

    @Test
    void isUniqueUsingSet(){
        assertTrue(this.characters.isUniqueUsingSet("table"));
        assertFalse(this.characters.isUniqueUsingSet("taable"));
        assertTrue(this.characters.isUniqueUsingSet("t"));
        assertTrue(this.characters.isUniqueUsingSet(""));
    }

    @Test
    void isUniqueUsingBooleanArrays(){
        assertTrue(this.characters.isUniqueUsingBooleanArrays("table"));
        assertFalse(this.characters.isUniqueUsingBooleanArrays("taable"));
        assertTrue(this.characters.isUniqueUsingBooleanArrays("t"));
        assertTrue(this.characters.isUniqueUsingBooleanArrays(""));
    }
}
