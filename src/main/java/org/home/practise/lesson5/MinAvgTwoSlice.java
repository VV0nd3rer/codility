package org.home.practise.lesson5;

/**
 * Level - Medium
 *
 * Find the minimal average of any slice containing at least two elements.
 *
 * Good explanation with example: https://www.martinkysel.com/codility-minavgtwoslice-solution/
 *
 * Solution: https://app.codility.com/demo/results/trainingHGA2QB-R4G/
 */
public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int min_index = 0;
        //each element of array A is an integer within the range [−10,000..10,000]
        double min_avg = 10001;
        for(int i = 0; i < A.length - 1; i++) {
            if((A[i] + A[i+1])/2.0 < min_avg) {
                min_index = i;
                min_avg = (A[i] + A[i+1])/2.0;
            }
            if(i < A.length - 2 && (A[i] + A[i+1] + A[i+2])/3.0 < min_avg) {
                min_index = i;
                min_avg = (A[i] + A[i+1] + A[i+2])/3.0;
            }
        }
        return min_index;
    }
}
