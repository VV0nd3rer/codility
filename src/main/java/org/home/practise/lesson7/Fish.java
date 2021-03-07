package org.home.practise.lesson7;

import java.util.Deque;
import java.util.LinkedList;

/***
 * Level - Easy
 *
 * N voracious fish are moving along a river. Calculate how many fish are alive.
 *
 * Solution - https://app.codility.com/demo/results/trainingZ8D22N-M5P/
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        Deque<FishEntity> fishEntityDeque = new LinkedList<>();

        for(int i = 0; i < B.length; i++) {
            if(
                //(current fish is first or previous fish goes up) and current fish goes up
                    ((fishEntityDeque.isEmpty() || fishEntityDeque.peekFirst().direction == 0) && B[i] == 0)
                            // or current fish goes down
                            || B[i] == 1) {
                //simply add current fish into stack
                fishEntityDeque.addFirst(new FishEntity(A[i], B[i]));
            } else
                //if it's not first fish, previous goes down and current fish goes up
                if (B[i] == 0) {
                    //go through stack till previous fish goes down (to meet current fish) and this previous fish is less then current
                    while (!fishEntityDeque.isEmpty() && fishEntityDeque.peekFirst().direction == 1 && fishEntityDeque.peekFirst().size < A[i]) {
                        //current fish eats this previous fish
                        fishEntityDeque.removeFirst();
                    }
                    //after checking and removing smaller fish which are going to meet us
                    //if we are only 1 survived fish or next go with us up, we add current fish to the stack
                    if(fishEntityDeque.isEmpty() || fishEntityDeque.peekFirst().direction == 0) {
                        fishEntityDeque.addFirst(new FishEntity(A[i], B[i]));
                    }
                }
        }

        return fishEntityDeque.size();
    }
    class FishEntity {
        int size;
        int direction;

        public FishEntity(int size, int direction) {
            this.size = size;
            this.direction = direction;
        }
    }
}
