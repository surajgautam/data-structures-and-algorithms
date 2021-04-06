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
    void isUnique(){
        assertTrue(this.characters.isUniqueBruteForce("table"));
        assertFalse(this.characters.isUniqueBruteForce("taable"));
        assertTrue(this.characters.isUniqueBruteForce("t"));
        assertTrue(this.characters.isUniqueBruteForce(""));
    }
}
