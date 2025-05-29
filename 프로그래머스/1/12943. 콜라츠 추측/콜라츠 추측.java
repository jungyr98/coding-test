import java.lang.Math;

class Solution {
    public int solution(int num) {
        int answer = 0;
        Long fmtNum = Long.valueOf(num);
        
        while(fmtNum>1){
            answer++;
            if(answer > 500){
                answer = -1;
                break;
            }
            if(fmtNum%2 == 0){
                fmtNum = fmtNum/2;
                continue;
            }else{
                fmtNum = (fmtNum*3) + 1;
            }        
        }
        return answer;
    }
}