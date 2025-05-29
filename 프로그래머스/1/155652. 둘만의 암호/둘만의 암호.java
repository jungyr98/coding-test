import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";        
        Map<Character, Integer> ascii = new HashMap<>();
        int idx = 0;
        
        for(int i=0; i<26; i++){
            char code = (char)('a' + i);
            if(skip.indexOf(code) == -1){
                ascii.put(code, idx);
                idx++;
            }           
        }

        for(char c : s.toCharArray()){
            int find = ascii.get(c);
            for(Entry<Character, Integer> entry : ascii.entrySet()){
                if((find+index)%ascii.size() == entry.getValue()){
                    c = entry.getKey();
                    break;
                }
            }

            answer += String.valueOf(c);
        }
        
        return answer;
    }
}