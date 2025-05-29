import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        
        for(String babb : babbling){
            
            StringBuilder builder = new StringBuilder(babb);
            List<String> available = new ArrayList<>(list);
            
            int a = 0;
            String preAble = "";
            for(int i=0; i<available.size(); i=a) {
                
                String able = available.get(i);
                
                if(builder.length() >= able.length()) {
                    if(!preAble.equals(able) && able.equals(builder.substring(0, able.length()))) {
                        preAble = able;
                        builder.delete(0, able.length());
                        if(builder.length() == 0) {
                            answer++;
                            break;
                        } else {
                            a = 0;
                            continue;
                        }
                    }
                }    
                ++a;
            }
        }
        
        return answer;
    }
}