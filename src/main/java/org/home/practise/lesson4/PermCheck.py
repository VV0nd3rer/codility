# Level - Easy
#
# Check whether array A is a permutation.
#
# Solution - https://app.codility.com/demo/results/training468QVJ-4JS/

def solution(A):
    n = len(A)
    counter = [0]*n
    for i in range(n):
        if A[i] > 0 and A[i] <= n:
            counter[A[i] - 1] += 1
    for i in range(n):
        if counter[i] == 0:
            return 0
    return 1
