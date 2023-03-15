x = int(input())
cal=[0]*(x+1)
for i in range(2,x+1):
    cal[i]=cal[i-1]+1
    if i%2 == 0:
        cal[i]= min(cal[i], cal[i//2]+1)
    if i%3 == 0:
        cal[i]= min(cal[i], cal[i//3]+1)
print(cal[x])