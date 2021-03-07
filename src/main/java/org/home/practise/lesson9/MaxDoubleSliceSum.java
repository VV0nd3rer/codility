package org.home.practise.lesson9;

import static java.lang.Math.max;

/***
 * Level - Medium
 *
 * Find the maximal sum of any double slice.
 *
 * Can be solved with bidirectional Kadane's algorithm.
 *
 * Solution - https://app.codility.com/demo/results/training7MYQMZ-MBT/
 */
public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        int n = A.length;
        int[] maxLeftToRight = new int[n];
        int[] maxRightToLeft = new int[n];

        int leftLocalMax = 0;
        for (int i = 1; i < n-1; i++) {
            leftLocalMax = max(0, leftLocalMax + A[i]);
            maxLeftToRight[i] = max(0, leftLocalMax);
        }

        int rightLocalMax = 0;
        for(int i = n-2; i > 0; i--){
            rightLocalMax = max(0, rightLocalMax + A[i]);
            maxRightToLeft[i] = max(0, rightLocalMax);
        }

        int resultingMax = 0;
        for(int i = 1; i < n-1; i++) {
            resultingMax = max(resultingMax, maxLeftToRight[i-1] + maxRightToLeft[i+1]);
        }

        return resultingMax;
    }
}
