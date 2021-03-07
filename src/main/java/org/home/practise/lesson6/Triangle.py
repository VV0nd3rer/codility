# Level - Easy
#
# Determine whether a triangle can be built from a given set of edges.
#
# Solution - https://app.codility.com/demo/results/trainingSQ332M-VNM/
def solution(A):
    n = len(A)
    A.sort()
    for k in range(1, n-1):
        if (A[k-1] + A[k]) > A[k+1]:
            return 1
    return 0