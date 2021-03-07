package org.home.practise.lesson6;

import java.util.Arrays;

/***
 * Level - Easy
 *
 * Determine whether a triangle can be built from a given set of edges.
 *
 * Solution - https://app.codility.com/demo/results/trainingZWHY4T-8YS/
 */
public class Triangle {
    public int solution(int[] A) {
        int n = A.length;
        if(n < 3) {
            return 0;
        }
        Arrays.sort(A);

        for (int i = 1; i < n-1; i++) {
            long sum = (long)A[i-1] + A[i];
            if(sum > A[i+1]) {
                return 1;
            }
        }
        return 0;
    }
}
