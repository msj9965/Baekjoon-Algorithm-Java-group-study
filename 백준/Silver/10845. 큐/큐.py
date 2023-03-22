import sys
#push
def push(num):
    global q
    q.append(num)

#pop
def pop():
    global q
    if len(q)>=1:
        return q.pop(0)
    else:
        return -1
        

#size
def size():
    global q
    return len(q)

#empty
def empty():
    global q
    if len(q)>0:
        return 0
    else:
        return 1
    
#front
def front():
    global q
    if len(q)>0:
        return q[0]
    else:
        return -1
#back
def back():
    global q
    if len(q)>0:
        return q[len(q)-1]
    else:
        return -1
n= int(sys.stdin.readline())
q=[]
count =0
while count!=n:
    order_q = sys.stdin.readline().split()
    
    if order_q[0]=="push":
        push(order_q[1]) 
    elif order_q[0]=="pop":
        print(pop())
    elif order_q[0]=="size":
        print(size())
    elif order_q[0]=="empty":
        print(empty())
    elif order_q[0]=="front":
        print(front())
    elif order_q[0]=="back":
        print(back())
    count+=1
        