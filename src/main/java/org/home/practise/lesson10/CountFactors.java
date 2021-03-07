package org.home.practise.lesson10;

/**
 * Level - Easy
 *
 * Count factors of given number n.
 *
 * Solution https://app.codility.com/demo/results/trainingNWCDN9-8VC/
 */
public class CountFactors {

    public int solution(int N) {
        long i = 1;
        int res = 0;
        while (i*i < N) {
            if(N % i == 0) {
                res += 2;
            }
            i++;
        }
        if(i*i == N) {
            res +=1;
        }
        return res;
    }
}
