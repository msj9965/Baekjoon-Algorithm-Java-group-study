import sys
arr = list(map(int, sys.stdin.readline().rstrip()))
arr.sort(reverse=True)
arr = list(map(str, arr))
s=''.join(arr)
print(s)