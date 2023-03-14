s = input().split('-')
result =0 
for i in s[0].split('+') :
    result += int(i)
for i in s[1:]:
    for k in i.split('+'):
        result-=int(k)
        
print(result)