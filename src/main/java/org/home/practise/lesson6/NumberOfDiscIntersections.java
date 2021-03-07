package org.home.practise.lesson6;

import java.util.Arrays;

/***
 * Level - Medium
 *
 * Compute the number of intersections in a sequence of discs.
 *
 * Good solution explanation - https://youtu.be/HV8tzIiidSw
 *
 * Solution - https://app.codility.com/demo/results/training6BRSUB-SQR/
 */
public class NumberOfDiscIntersections {
        public int solution(int[] A) {
            long[] startPoints = new long[A.length];
            long[] endPoints = new long[A.length];

            for (int i = 0; i < A.length; i++) {
                startPoints[i] = (long)i - A[i];
                endPoints[i] = (long)i + A[i];
            }

            Arrays.sort(startPoints);
            Arrays.sort(endPoints);

            for(int i = 0; i < A.length; i++) {
                System.out.println("startPoints[" + i + "] = " + startPoints[i]);
                System.out.println("endPoints[" + i + "] = " + endPoints[i]);
            }

            int open = 0;
            int intersect = 0;

            int startPos = 0;
            int endPos = 0;

            while (startPos < A.length) {
                if(intersect > 10000000) {
                    return -1;
                }
                if(startPoints[startPos] <= endPoints[endPos]) {
                    intersect += open;
                    open ++;
                    startPos ++;
                } else {
                    open --;
                    endPos ++;
                }
                System.out.println("open after: " + open);
                System.out.println("intersect after: " + intersect);
                System.out.println("------------------");
            }
            return intersect;
        }

}
