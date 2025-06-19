import java.lang.Math;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        int sqrt = (int) Math.sqrt(sum);
        
        for(int i=3; i<=sqrt; i++) {
            if(sum % i == 0) {
                answer[0] = sum / i;
                answer[1] = i;
                if((answer[0]-2) * (answer[1]-2) == yellow) {
                    break;
                }
            }
        }
        
        return answer;
    }
}