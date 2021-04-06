package com.surajgautam.datastructures.and.algorithms.hashtable;

import com.surajgautam.datastructures.and.algorithms.linkedlist.LinkedList;
import com.surajgautam.datastructures.and.algorithms.linkedlist.SinglyLinkedList;

import java.util.List;

public class HashTable<K, V> {

    private static final int DEFAULT_SIZE = 5;
    private final LinkedList<V>[] chains = new SinglyLinkedList[DEFAULT_SIZE];

    public void add(K key, V value) {
        //todo - dynamic size
        int hashCode = Hash.compute(key);
        int position = hashCode % chains.length;
        boolean hasValue = chains[position] != null && chains[position].size() > 0;
        if (hasValue) {
            chains[position].add(value);
        } else {
            LinkedList<V> linkedList = new SinglyLinkedList<>();
            linkedList.add(value);
            chains[position] = linkedList;
        }
    }

    public V get(K key) {
        int hashCode = Hash.compute(key);
        int position = hashCode % chains.length;
        if (chains[position].size() > 1) {
            List<V> values = chains[position].getAllValues();
            V lastValue = values.get(values.size() - 1);
            return lastValue;
        } else {
            return chains[position].getAllValues().get(0);
        }
    }

}
