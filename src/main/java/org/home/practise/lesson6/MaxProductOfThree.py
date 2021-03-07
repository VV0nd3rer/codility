# Level - Easy
#
# Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
#
# Solution - https://app.codility.com/demo/results/training7FZU8W-RR7/

def solutionBB(A):
    n = len(A)
    A.sort()
    return max(A[0] * A[1] * A[n - 1], A[n-3] * A[n-2] * A[n-1])

