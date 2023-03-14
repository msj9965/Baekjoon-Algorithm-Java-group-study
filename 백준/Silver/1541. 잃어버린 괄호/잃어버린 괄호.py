import re
s = input()
if s.find('-') != -1:
    s1 = s[0:s.find('-')]
    s2 = s[s.find('-')+1:len(s)]
    
    s1_num = list(re.split(r'-|\+', s1))
    s2_num = list(re.split(r'-|\+', s2))
    s1_num = list(map(int,s1_num))
    s2_num = list(map(int, s2_num))
    result = sum(s1_num)-sum(s2_num)
else :
    s_num = list(re.split(r'-|\+',s))
    s_num = list(map(int, s_num))
    result = sum(s_num)
print(result)