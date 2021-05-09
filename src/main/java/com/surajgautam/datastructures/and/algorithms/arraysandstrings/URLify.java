package com.surajgautam.datastructures.and.algorithms.arraysandstrings;

/*
Input: "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"
Desc: Replace space with %20.
Note: True length of the space is also given.
 */
public class URLify {

    public String encode(final String value, final int trueLength) {
        String substring = value.substring(0, trueLength);
        return substring.replace(" ", "%20");
    }

    public char[] encode(final char[] characters, final int trueLength) {
        //this is an operation in place. no additional data structure needed because using characters array is enough.
        int numberOfSpaces = countNumberOfSpaces(characters, trueLength);
        int numberOfExtraCharactersThanSpaceInEncodingValue = 2;
        int newIndex = trueLength - 1 + numberOfSpaces * numberOfExtraCharactersThanSpaceInEncodingValue;

        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
            boolean hasSpace = characters[oldIndex] == ' ';
            // if space replace with %20, else copy the original character
            if (hasSpace) {
                characters[newIndex] = '0';
                characters[newIndex - 1] = '2';
                characters[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                characters[newIndex] = characters[oldIndex];
                newIndex -= 1;
            }
        }
        return characters;
    }

    private int countNumberOfSpaces(char[] characters, int trueLength) {
        final char space_delimeter = ' ';
        int count = 0;
        for (int i = 0; i < trueLength; i++) {
            if (characters[i] == space_delimeter) {
                count++;
            }
        }
        return count;
    }

}
