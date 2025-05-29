class Solution {
    public int solution(int n) {
        int answer = 0;
        String nText = Integer.toString(n, 3);
        String reverseText = "";
        
        for(int i=(nText.length()-1); i>-1; i--){
            reverseText += String.valueOf(nText.charAt(i));
        }
        
        answer = Integer.parseInt(reverseText, 3);
        
        return answer;
    }
}