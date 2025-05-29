class Solution {
    public String solution(int n) {
        String answer = "수박";
        answer = "수박".repeat(n/2);  
        
        if(n%2 != 0){
            answer += "수";
        }
        
        return answer;
    }
}