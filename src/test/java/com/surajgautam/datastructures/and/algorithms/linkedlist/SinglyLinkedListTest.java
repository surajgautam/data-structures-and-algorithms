package com.surajgautam.datastructures.and.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> singlyLinkedList;

    @BeforeEach
     void setUp() {
        singlyLinkedList = new SinglyLinkedList<>();
    }

    @Test
    void canAdd() {

        assertEquals(0, singlyLinkedList.size());

        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        assertEquals(singlyLinkedList.size(), 3);
        assertThat(singlyLinkedList.getAllValues())
                .containsExactly(1,2,3);

    }

    @Test
    void canAddToHead() {
        assertEquals(0, singlyLinkedList.size());
        singlyLinkedList.addToHead(1);
        assertEquals(singlyLinkedList.size(), 1);
        assertThat(singlyLinkedList.getAllValues())
                .containsExactly(1);
    }

    @Test
    void canAddToPosition() {
        assertEquals(0, singlyLinkedList.size());
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(4);

        assertEquals(3, singlyLinkedList.size());
        assertThat(singlyLinkedList.getAllValues())
                .containsExactly(1,2,4);

        singlyLinkedList.addToPosition(3,3);
        assertEquals(4, singlyLinkedList.size());
        assertThat(singlyLinkedList.getAllValues())
                .containsExactly(1,2,3,4);
    }

    @Test
    void givenWrongPosition_whenAddToPosition_ThenReturnError() {
        singlyLinkedList.add(1);
        assertThrows(RuntimeException.class, ()->singlyLinkedList.addToPosition(3, 3));
    }

    @Test
    void canDelete() {
        assertEquals(0, singlyLinkedList.size());
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        singlyLinkedList.delete();

        assertEquals(2, singlyLinkedList.size());
        assertThat(singlyLinkedList.getAllValues())
                .containsExactly(1,2);
    }

    @Test
    void canDeleteOfPosition() {
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        singlyLinkedList.deleteOfPosition(2);
        assertEquals(2, singlyLinkedList.size());
        assertThat(singlyLinkedList.getAllValues())
                .containsExactly(1,3);
    }
}