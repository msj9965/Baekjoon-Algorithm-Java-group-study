import sys
n = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
A.sort()
m = int(sys.stdin.readline())
B = list(map(int, sys.stdin.readline().split()))

for i in B:
    high = n-1
    low = 0
    mid = (high+low)//2
    rec = 0
    while low<=high:
        if A[mid]== i:
            rec = 1
            break
        elif A[mid]<i:
            low = mid+1
        elif A[mid]>i:
            high= mid-1
        mid = (high+low)//2

    print(rec)