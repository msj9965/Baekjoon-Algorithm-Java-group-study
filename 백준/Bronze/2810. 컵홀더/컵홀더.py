import sys
n = int(sys.stdin.readline())
chairs = sys.stdin.readline().rstrip()
if chairs.count('L')//2>0:
    count_cuphold = len(chairs)- (chairs.count('L')//2)+1
else:
    count_cuphold= len(chairs)
print(count_cuphold)