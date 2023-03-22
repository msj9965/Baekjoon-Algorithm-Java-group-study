import sys
case = 1

while True:
    L, P, V = map(int, sys.stdin.readline().split())
    if L == 0 and P == 0 and V == 0:
        break
    else:
        if V <= L:
            print("Case", str(case)+":",V)
        else:
            if V%P<=L:
                print("Case", str(case)+":", (V//P)*L+(V%P)) 
            else:
                print("Case", str(case)+":", (V//P)*L+L)
    case+=1