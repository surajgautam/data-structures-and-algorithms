package com.surajgautam.datastructures.and.algorithms.hashtable;

public class Hash<K> {
    public static <K> int compute(K key) {
        return key.hashCode();
    }
}
