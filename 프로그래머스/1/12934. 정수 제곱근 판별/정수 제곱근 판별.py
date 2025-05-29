import math

def solution(n):
    answer = -1
    
    dNum = math.sqrt(n)

    if dNum%1 == 0:
        dNum = int(dNum)
        answer = (dNum+1)*(dNum+1)
    
    return answer