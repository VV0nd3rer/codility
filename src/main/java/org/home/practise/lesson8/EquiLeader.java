package org.home.practise.lesson8;

/***
 * Level - Easy
 *
 * Find the index S such that the leaders of the sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same.
 *
 * Solution - https://app.codility.com/demo/results/training5JG7E6-G7G/
 * Wrong solution - https://app.codility.com/demo/results/trainingMY5XJW-PFS/ (bad performance O(n**2))
 */
public class EquiLeader {
    public int solution(int[] A) {
        return getEquiLeader(A);
    }
    private int getEquiLeader(int[] A) {
        Leader leader = getLeaderWithCounter(A);
        int leaderCounter = leader.getCounter();
        int equiLeaderCounter = 0;
        int intervalLeaderCounter = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == leader.getValue()) {
                intervalLeaderCounter ++;
            }
            if(intervalLeaderCounter > (i+1)/2 && (leaderCounter - intervalLeaderCounter) > (A.length - i - 1)/2) {
                equiLeaderCounter ++;
            }
        }
        return equiLeaderCounter;
    }
    private Leader getLeaderWithCounter(int[] A) {
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
        int count = 0;
        Leader leader = new Leader(-1);

        if(size > 0) {
            candidate = value;
        }
        if(candidate == -1) {
            return leader;
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] == candidate) {
                count ++;
            }
        }
        if(count > A.length / 2) {
            leader.setValue(candidate);
            leader.setCounter(count);
        }
        return leader;
    }

    private class Leader {
        private int value;
        private int counter = 0;

        public Leader(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }
    }
}
