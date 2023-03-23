import sys
n = int(sys.stdin.readline())
done = True
answer = []
stack = []
value = 1
for i in range(n):
    num = int(sys.stdin.readline())
    while value<=num:
        stack.append(value)
        value+=1
        answer.append('+')
    if num == stack[-1]:
        stack.pop()
        answer.append('-')
    else: 
        done = False

if done :
    for i in answer:
        print(i)
else:
    print("NO")
