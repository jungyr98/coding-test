class Solution {
    public int solution(String s) {
        int answer = 0;
        int trueCount = 0;
        int falseCount = 0;
        int idx = 0;
        char firstText = 'A';
        
        for(int i=0; i<s.length(); i+=idx){
            if(i==s.length()-1) {
                answer++;
                break;
            }
            char text = s.charAt(i);        
            
            if(firstText != 'A'){
                if(firstText == text) trueCount++;
                else falseCount++;

                if(trueCount == falseCount) {
                    answer++;
                    trueCount = 0;
                    falseCount = 0;
                    firstText = 'A';
                }
                idx = 1;
            } else {
                if(text != s.charAt(i+1)) {
                    answer++;
                } else {
                    firstText = text;
                    trueCount = 2;
                }
                idx = 2;
            }                        
        }
        
        return answer;
    }
}