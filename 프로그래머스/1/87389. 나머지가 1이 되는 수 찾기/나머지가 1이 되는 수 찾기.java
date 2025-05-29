
class Solution {
    public int solution(int n) {
        
        // n-1 의 최소공약수 구하기
        int minNum = 1;
        for(int i = 2; (n-1) >= i; i++){
            if((n-1)%i == 0){
                minNum = i;
                break;
            }
        }
        
        int answer = minNum;
        return answer;
    }
}