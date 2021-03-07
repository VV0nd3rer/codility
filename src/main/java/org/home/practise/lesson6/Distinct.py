# Level - Easy
#
# Compute number of distinct values in an array.
#
# Solution - https://app.codility.com/demo/results/trainingJZ66RR-E3F/

def solution(A):
    n = len(A)
    if n == 0:
        return 0
    A.sort()
    result = 1
    for k in range(1, n):
        if A[k] != A[k-1]:
            result += 1
    return result