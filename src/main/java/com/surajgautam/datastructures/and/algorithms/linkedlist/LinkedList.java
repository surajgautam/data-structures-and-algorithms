package com.surajgautam.datastructures.and.algorithms.linkedlist;

public interface LinkedList<T> {

    void add(T value);
    void addToHead(T value);
    void addToPosition(int position, T value);

    void delete();
    void deleteHead();
    void deleteOfPosition(int position);

    void printAll();

}
