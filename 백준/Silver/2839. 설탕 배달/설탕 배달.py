n = int(input())
n3=n//3
n5=n//5
want=-1
for i in range(n5,-1,-1):
    for j in range(0,n3+1):
        if 5*i+3*j==n:
            want = i+j
            break
    if(want!=-1):
        break
print(want)