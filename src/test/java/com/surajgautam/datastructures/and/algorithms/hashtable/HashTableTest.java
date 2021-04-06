package com.surajgautam.datastructures.and.algorithms.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashTableTest {

    private HashTable<String, String> hashTable;

    @BeforeEach
    void setUp() {
        this.hashTable = new HashTable<String, String>();
    }

    @Test
    void canAddToHashTable() {
        this.hashTable.add("Antifragile", "Nassim Nicholas Taleb");
        this.hashTable.add("Alchemy", "Rory Sutherland");
        this.hashTable.add("The Intelligent Investor", "Benjamin Graham");
        this.hashTable.add("Black Swan", "Nassim Nicholas Taleb");
        String value = this.hashTable.get("Black Swan");
        Assertions.assertEquals("Nassim Nicholas Taleb", value);
    }

}
