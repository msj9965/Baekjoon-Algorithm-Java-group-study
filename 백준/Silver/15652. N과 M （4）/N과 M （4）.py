n,m = map(int, input().split())
arr = [0]*m
def dfs(d, val= 1):
    global n,m
    if d == m:
        for i in range(m):
            print(arr[i],end=" ")
        print("")
        return
    for i in range(val, n+1):
        arr[d] = i
        val = i
        d = d+1
        dfs(d, val)
        d = d-1
dfs(0)