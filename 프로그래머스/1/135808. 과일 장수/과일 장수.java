import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        if(score.length % m == 0){
            for(int i=0; i<score.length; i+=m){
                answer += score[i]*m;
            }
        }else {
            for(int i=(score.length-m); i>0; i-=m){
                answer += score[i]*m;
            }
        }
        
        return answer;
    }
}