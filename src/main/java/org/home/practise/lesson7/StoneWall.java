package org.home.practise.lesson7;

import java.util.Deque;
import java.util.LinkedList;

/***
 * Level - Easy
 *
 * Cover "Manhattan skyline" using the minimum number of rectangles.
 *
 * Solution - https://app.codility.com/demo/results/training8BMHC9-873/
 * Wrong solution - https://app.codility.com/demo/results/trainingHNFE86-9A9/ (correctness - 100%, performance - 22%)
 */
public class StoneWall {
    public static int solution(int[] H) {
        Deque<Integer> blocks = new LinkedList<>();
        int blocksCounter = 0;

        for(int i = 0; i < H.length; i++) {
            while (!blocks.isEmpty() && H[i] < blocks.peekFirst()) {
                blocks.removeFirst();
            }
            if(blocks.isEmpty() ) {
                blocks.addFirst(H[i]);
                blocksCounter++;
            } else if(H[i] > blocks.peekFirst()) {
                blocks.addFirst(H[i]);
                blocksCounter++;
            }
        }
        return blocksCounter;
    }
}
