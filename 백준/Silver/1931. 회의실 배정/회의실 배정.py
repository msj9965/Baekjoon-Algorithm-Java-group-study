meeting = []
n = int(input())
for i in range(n):
    meeting.append(list(map(int, input().split())))
meeting.sort(key=lambda x:(x[1],x[0]))
pre_end =-1
count =0
for i in range(n):
    if pre_end <= meeting[i][0] :
        count+=1
        pre_end = meeting[i][1]
print(count)