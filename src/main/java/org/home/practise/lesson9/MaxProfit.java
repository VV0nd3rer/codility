package org.home.practise.lesson9;
/**
 * Level - Easy
 *
 * Given a log of stock prices compute the maximum possible earning.
 *
 * Solution https://app.codility.com/demo/results/trainingRGNK9W-SCF/
 * Solution which works with negative numbers too https://app.codility.com/demo/results/trainingEX6SAG-GYV/
 */
public class MaxProfit {
    public int solution(int[] A) {
        int n = A.length;

        if(n < 2) {
            return 0;
        }

        int[] deltaA = new int[n];
        deltaA[0] = 0;
        for(int i = 1; i < n; i++) {
            deltaA[i] = A[i] - A[i-1];
        }

        int currentMax = 0;
        int resultingMax = 0;
        for(int i=0; i<n; i++) {
            currentMax = Math.max(deltaA[i], currentMax + deltaA[i]);
            resultingMax = Math.max(resultingMax, currentMax);
        }

        return resultingMax;
    }

    public int solutionForNegativeNumbers(int[] A) {
        if (A.length < 2) return 0;

        int[] deltaA = new int[A.length];
        deltaA[0] = 0;
        for (int i = 1; i < A.length; i++) {
            deltaA[i] = A[i] - A[i - 1];
        }

        int absoluteMax = deltaA[0];
        int localMax = deltaA[0];
        int nextSum = 0;
        int currentElement = 0;

        for (int i = 1; i < deltaA.length; i++) {
            currentElement = deltaA[i];
            nextSum = localMax + currentElement;
            localMax = Math.max(deltaA[i], nextSum);
            absoluteMax = Math.max(absoluteMax, localMax);
        }
        if (absoluteMax > 0) return absoluteMax;

        return 0;
    }
}
