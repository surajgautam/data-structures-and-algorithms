package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

/*
Input: "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"
Desc: Replace space with %20.
Note: True length of the space is also given.
 */
public class URLify {

    public String encode(String value, int trueLength) {
        String substring = value.substring(0, trueLength);
        return substring.replace(" ", "%20");
    }

}
