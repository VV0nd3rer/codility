package org.home.practise.lesson14;
/***
 * Level - Respectable
 *
 * Divide array A into K blocks and minimize the largest sum of any block.
 *
 * Explanation with solution:
 * https://www.geeksforgeeks.org/split-the-given-array-into-k-sub-arrays-such-that-maximum-sum-of-all-sub-arrays-is-minimum/
 *
 * Solution - https://app.codility.com/demo/results/trainingXY3MFG-S9S/
 */
public class MinMaxDivision {

    // Function to find maximum subarray sum
    // which is minimum
    public int solve( int K, int M, int A[]) {
        int n = A.length;
        int start = 1;
        //find max value in array
        //or start = M?
        for (int i = 0; i < n; ++i) {
            if (A[i] > start)
                start = A[i];
        }
        int end = 0;

        //find sum of all array's elements
        for (int i = 0; i < n; i++) {
            end += A[i];
        }

        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("Start: " + start);
            System.out.println("End: " + end);
            System.out.println("Mid: " + mid);

            // Check if mid is possible solution
            if (check(mid, K, A)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    private boolean check(int mid, int K, int A[]) {
        int n = A.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("-------- Iteration " + i + " of check ---------");
            // If individual element is greater, maximum possible sum (this sum is greater then sum proposed by mid)
            if (A[i] > mid) {
                System.out.println(A[i] + " > " + mid + ", return false");
                return false;
            }

            // Increase sum of current subarray
            System.out.println("Current sum: " + sum);
            sum += A[i];
            System.out.println("Increase sum of current subarray: " + sum);

            // If the sum is greater than mid, then increase count and change sum
            if (sum > mid) {
                System.out.println(sum + " > " + mid);
                count++;
                sum = A[i];
                System.out.println("Change sum of current subarray: " + sum);
            }
        }
        count++;
        System.out.println("Count: " + count);
        // is there amount ot sub arrays less or equal to K
        if (count <= K)
            return true;
        return false;
    }
}
