package org.home.practise.lesson10;
/**
 * Level - Easy
 *
 * Find the minimal perimeter of any rectangle whose area equals N.
 *
 * Solution https://app.codility.com/demo/results/trainingMACYJ2-QWV/
 */
public class MinPerimeterRectangle {
    public int solution(int N) {
        long i = 1;
        int a = 0;
        int b = 0;
        while (i*i < N) {
            if(N % i == 0) {
                a = (int)i;
                b = (int)(N/i);
            }
            i++;
        }
        if(i*i == N) {
            a = (int)i;
            b = a;
        }
        return 2*(a+b);
    }
}
