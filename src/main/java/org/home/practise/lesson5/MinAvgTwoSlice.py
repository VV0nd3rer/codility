# Level - Medium
#
# Find the minimal average of any slice containing at least two elements.
#
# Good explanation with example: https://www.martinkysel.com/codility-minavgtwoslice-solution/
#
# Solution: https://app.codility.com/demo/results/trainingE4YMXW-QCF/
def solution(A):
    min_idx = 0
    min_avg = 10001
    for idx in range(0, len(A) - 1):
        if (A[idx] + A[idx + 1])/2.0 < min_avg:
            min_idx = idx
            min_avg = (A[idx] + A[idx + 1])/2.0
        if idx < len(A) - 2 and (A[idx] + A[idx + 1] + A[idx + 2])/3.0 < min_avg:
            min_idx = idx
            min_avg = (A[idx] + A[idx + 1] + A[idx + 2])/3.0
    return min_idx

