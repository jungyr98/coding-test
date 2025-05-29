class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            if(food[i] == 1) continue;
            answer += String.valueOf(i).repeat(food[i]/2);
        }
        
        StringBuffer sb = new StringBuffer(answer);   
        answer += '0' + sb.reverse().toString();
        
        return answer;
    }
}