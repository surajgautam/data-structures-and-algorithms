package com.surajgautam.datastructures.and.algorithms.linkedlist;

import java.util.List;

public interface LinkedList<T> {

    void add(T value);
    void addToHead(T value);
    void addToPosition(int position, T value);

    void delete();
    void deleteHead();
    void deleteOfPosition(int position);

    List<T> getAllValues();
    void printAll();
    int size();

}
