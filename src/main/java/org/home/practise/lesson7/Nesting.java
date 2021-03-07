package org.home.practise.lesson7;

import java.util.Deque;
import java.util.LinkedList;

/***
 * Level - Easy
 *
 * Determine whether a given string of parentheses (single type) is properly nested.
 *
 * Solution - https://app.codility.com/demo/results/trainingNZ467T-86H/
 */
public class Nesting {
    public int solution(String S) {
        Deque<Character> openingBrackets = new LinkedList<>();
        for(char s : S.toCharArray()) {
            switch (s) {
                case '(':
                    openingBrackets.addFirst(s);
                    break;
                case ')':
                    if (openingBrackets.isEmpty() || '(' != openingBrackets.removeFirst()) {
                        return 0;
                    }
                    break;
            }
        }
        if(openingBrackets.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
