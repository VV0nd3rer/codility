package org.home.practise.lesson8;

/***
 * Level - Easy
 *
 * Find an index of an array such that its value occurs at more than half of indices in the array.
 *
 * Solution - https://app.codility.com/demo/results/trainingEY223Y-X7H/
 */
public class Dominator {
    public int solution(int[] A) {
        int size = 0;
        int value = -1;
        for (int i = 0; i < A.length; i++) {
            if(size == 0) {
                size++;
                value = A[i];
            } else {
                if(value != A[i]) {
                    size --;
                } else {
                    size ++;
                }
            }
        }
        int candidate = -1;
        int leaderPos = -1;
        int count = 0;
        if(size > 0) {
            candidate = value;
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] == candidate) {
                count ++;
                if(leaderPos == -1) {
                    leaderPos = i;
                }
            }
        }
        if(count <= A.length / 2 && leaderPos != -1) {
            leaderPos = -1;
        }
        return leaderPos;
    }
}
