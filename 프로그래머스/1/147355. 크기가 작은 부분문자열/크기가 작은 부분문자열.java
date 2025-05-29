class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long fmtNum = Long.parseLong(p);
        
        for(int i=0; i<t.length(); i++){
            if(i+p.length() > t.length()){
                break;
            }
            Long cutText = Long.parseLong(t.substring(i,i+p.length()));
            if(fmtNum >= cutText){
                answer++;
            }
        }
        return answer;
    }
}