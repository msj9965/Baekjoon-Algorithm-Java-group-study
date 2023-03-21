from collections import Counter
N= int(input())
arr = []
#값 입력
for i in range(N):
    arr.append(int(input()))
#산술평균
a =sum(arr)
avg = a/N
avg = round(avg)
print(avg)
#중앙값
arr.sort()
print(arr[int((N-1)/2)])
#최빈값
if N>1:
    cnt = Counter(arr).most_common()
    if cnt[0][1]== cnt[1][1]:
        print(cnt[1][0])
    else:
        print(cnt[0][0])
else:
    print(arr[0])

#범위
print(arr[len(arr)-1]-arr[0])