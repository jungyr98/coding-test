import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<Integer, String> nameMap = new HashMap<>();
        
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++){
            nameMap.put(i, completion[i]);
        }
        
        Arrays.sort(participant);
        for(int i=0; i<participant.length; i++){
            if(i == (participant.length-1) || !nameMap.get(i).equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}