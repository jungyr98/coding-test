import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            s = s.replace(entry.getKey(), String.valueOf(entry.getValue()));
        }
        
        answer = Integer.parseInt(s);
        return answer;
    }
}