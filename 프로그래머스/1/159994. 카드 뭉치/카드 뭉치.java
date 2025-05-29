import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int preIdx1 = 0;
        int cnt1 = 0;
        int preIdx2 = 0;
        int cnt2 = 0;
        
        for(int i=0; i<cards1.length; i++){
            for(int j=preIdx1; j<goal.length; j++){
                if(cards1[i].equals(goal[j])) {
                    preIdx1 = j+1;
                    if(cnt1 >= i) cnt1++;
                    break;
                }
            }
        }

        for(int i=0; i<cards2.length; i++){
            for(int j=preIdx2; j<goal.length; j++){
                if(cards2[i].equals(goal[j])) {
                    preIdx2 = j+1;
                    if(cnt2 >= i) cnt2++;
                    break;
                }
            }
        }
        
        if((cnt1+cnt2) == goal.length){
            answer = "Yes";
        }
        
        return answer;
    }
}