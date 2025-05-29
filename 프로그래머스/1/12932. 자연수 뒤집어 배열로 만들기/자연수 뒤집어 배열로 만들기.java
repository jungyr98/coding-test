class Solution {
    public int[] solution(Long n) {
        
        String fmtNum = Long.toString(n);
        int[] answer = new int[fmtNum.length()];
        
        int idx = 0;
        for(int i=(fmtNum.length()-1); i>=0; i--){
            answer[idx] = Integer.parseInt(String.valueOf(fmtNum.charAt(i)));
            idx++;
        }
        return answer;
    }
}