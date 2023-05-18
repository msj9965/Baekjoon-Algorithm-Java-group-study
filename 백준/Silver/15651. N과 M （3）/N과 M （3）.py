n,m = map(int, input().split())
arr = [0]*m
def dfs(d):
    global n,m
    if d == m:
        for i in range(m):
            print(arr[i],end=" ")
        print("")
        return
    for i in range(n):
        arr[d] = i+1
        d = d+1
        dfs(d)
        d = d-1
dfs(0)