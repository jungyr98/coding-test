def solution(n):
    answer = []
    fmtList = list(map(int, str(n)))
    listLen = len(fmtList)
    for i in range(listLen):
        answer.append(fmtList[(listLen-1)-i])
    
    return answer