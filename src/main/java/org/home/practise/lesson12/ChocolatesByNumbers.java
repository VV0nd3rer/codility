package org.home.practise.lesson12;

/**
 * Level - Easy
 *
 * There are N chocolates in a circle. Count the number of chocolates you will eat.
 *
 * Solution naive (O(N+M)) https://app.codility.com/demo/results/trainingZ6CJM3-E5A/
 * Solution O(log(N+M)) https://app.codility.com/demo/results/trainingTXRYXP-Z59/
 */
public class ChocolatesByNumbers {

    public int betterSolution(int N, int M) {
        int gcd = gcd(N, M);
        long lcm = (long) N*M/gcd;

        return (int)(lcm/M);
    }
    public int solution(int N, int M) {
        int gcd = gcd(N, M);
        return N/gcd;
    }

    private int gcd(int N, int M) {
        if(N % M == 0) {
            return M;
        }
        return gcd(M, N % M);
    }

    //O(N+M)
    public int naiveSolution(int N, int M) {
        int counter = 1;
        long x = 0;
        while (true) {
            x = (x + M) % N;
            if (x == 0) {
                return counter;
            }
            counter++;

        }
    }
}
