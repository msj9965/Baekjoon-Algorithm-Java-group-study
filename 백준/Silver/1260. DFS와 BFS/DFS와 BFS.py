from collections import deque

def dfs(v):
    value[v] = True
    print(v, end=' ')

    for i in range(1, n+1):
        if arr[v][i] == 1 and value[i]== False:
            dfs(i)

def bfs(v):
    q = deque([v])
    value[v] = True

    while q:
        now = q.popleft()
        print(now, end=' ')

        for i in range(1, n+1):
            if arr[now][i] == 1 and value[i]==False:
                q.append(i)
                value[i] = True

n, m, v = map(int, input().split())
arr= [[0] * (n+1) for _ in range(n+1)]
value = [False] * (n+1)

for _ in range(m):
    x, y = map(int, input().split())
    arr[x][y] = 1
    arr[y][x] = 1

dfs(v)
value = [False] * (n+1)
print()
bfs(v)