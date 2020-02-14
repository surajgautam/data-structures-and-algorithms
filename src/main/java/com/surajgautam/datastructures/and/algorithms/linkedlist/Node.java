package com.surajgautam.datastructures.and.algorithms.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Node<T> {

    private T value;
    private Node next;

}
