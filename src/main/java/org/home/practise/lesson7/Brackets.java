package org.home.practise.lesson7;

import java.util.Deque;
import java.util.LinkedList;

/***
 * Level - Easy
 *
 * Determine whether a given string of parentheses (multiple types) is properly nested.
 *
 * Solution - https://app.codility.com/demo/results/training3WFMEG-Z83/
 */
public class Brackets {

    public int solution(String str) {
        if (validateString(str) == 0) {
            return 0;
        }
        Deque<Character> openingBrackets = new LinkedList<>();
        for(char s : str.toCharArray()) {
            //"(", "{", "[", "]", "}", ")"
            switch (s) {
                case '(':
                case '{':
                case '[':
                    openingBrackets.addFirst(s);
                    break;
                case ')':
                    if (openingBrackets.isEmpty() || '(' != openingBrackets.removeFirst()) {
                        return 0;
                    }
                    break;
                case '}':
                    if (openingBrackets.isEmpty() || '{' != openingBrackets.removeFirst()) {
                        return 0;
                    }
                    break;
                case ']':
                    if (openingBrackets.isEmpty() || '[' != openingBrackets.removeFirst()) {
                        return 0;
                    }
                    break;
                default:
                    return 0;
            }
        }
        if(openingBrackets.isEmpty()) {
            return 1;
        }
        return 0;
    }

    private int validateString(String str) {
        if (str == null || str.length() % 2 != 0) {
            return 0;
        }
        return 1;
    }
}
