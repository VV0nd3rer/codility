package org.home.practise.lesson9;

import static java.lang.Math.max;

/***
 * Level - Easy
 *
 * Find a maximum sum of a compact subsequence of array elements.
 *
 * Can be solved with Kadane's algorithm.
 * Helpful article: Largest Sum Contiguous Subarray - https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 *
 * Solution https://app.codility.com/demo/results/trainingZ3E4X9-3ZT/
 */
public class MaxSliceSum {

    public int solution(int[] A) {
        int maxResultingSlice = A[0];
        int maxCurrentSlice = A[0];
        for (int i = 1; i < A.length; i++) {
            maxCurrentSlice = max (A[i], maxCurrentSlice + A[i]);
            maxResultingSlice = max (maxResultingSlice, maxCurrentSlice);
        }
        return maxResultingSlice;
    }

    public int solutionPositivesOnly(int[] A) {
        int maxResultingSlice = 0;
        int maxCurrentSlice = 0;
        for (int i = 0; i < A.length; i++) {
            maxCurrentSlice = max(0, maxCurrentSlice + A[i]);
            maxResultingSlice = max(maxResultingSlice, maxCurrentSlice);
        }
        return maxResultingSlice;
    }
}
