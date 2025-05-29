class Solution {
    public long solution(int a, int b) {
        int startNum = 0;
        int endNum = 0;
        long answer = 0;
        
        if(a<=b){
            startNum = a;
            endNum = b;
        }else{
            startNum = b;
            endNum = a;
        }
        
        for(int i=startNum; i<=endNum; i++){
            answer += i;
        }        
        return answer;
    }
}