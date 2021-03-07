package org.home.practise.lesson6;

import java.util.Arrays;

/***
 * Level - Easy
 *
 * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 *
 * Solution - https://app.codility.com/demo/results/trainingK77H2V-2SQ/
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        return Math.max(A[0] * A[1] * A[n-1], A[n-3] * A[n-2] * A[n-1]);
    }
}
