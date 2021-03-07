# Level - Easy
#
# Count the number of passing cars on the road.
#
# Solution - https://app.codility.com/demo/results/training2C224P-C3Y/
def solution(A):
    n = len(A)
    prefix = prefix_sums(A)
    result = 0
    for x in range (n):
        if A[x] == 0:
            result += prefix[n-1] - prefix[x]
            if result > 1000000000:
                return -1
    return result

def prefix_sums(A):
    n = len(A)
    P = [0] * n
    P[0] = A[0]
    for k in range(1, n):
        P[k] = P[k-1] + A[k]
    return P