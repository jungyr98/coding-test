def solution(s):
    
    lowText = s.lower()
    
    if lowText.count('p') == lowText.count('y'):
        return True

    return False