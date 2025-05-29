class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for(int i=2; i<(number+1); i++){
            int cnt = 1;

            if(i%2 == 1) {
                for(int j=3; j<(i+1); j+=2){
                    if(i%j == 0) cnt++;
                    if(cnt > limit) break;
                }  
                if(cnt > limit){
                    answer += power;
                }else {
                    answer += cnt;
                }  
            } else {
                cnt++;
                for(int j=2; j<=(i/2); j++){
                    if(i%j == 0) cnt++;
                    if(cnt > limit) break;
                }
                if(cnt > limit){
                    answer += power;
                }else {
                    answer += cnt;
                }
            }
        }
        
        return answer;
    }
}