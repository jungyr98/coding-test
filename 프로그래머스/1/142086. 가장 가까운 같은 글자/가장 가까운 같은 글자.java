class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i=1; i<s.length(); i++){
            String cutText = s.substring(0, i);
            int firstIdx = cutText.indexOf(s.charAt(i));
            
            if(firstIdx == -1){
                answer[i] = firstIdx;
            }else {
                int lastIdx = cutText.lastIndexOf(s.charAt(i));
                if((i-firstIdx) > (i-lastIdx)) {
                    answer[i] = i-lastIdx;
                }else {
                    answer[i] = i-firstIdx;
                }
            }                        
        }
        
        return answer;
    }
}