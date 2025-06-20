import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> que = new LinkedList<>();
        int answer = 0;
        
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        for(String city : cities) {
            String lowerCity = city.toLowerCase();
            boolean exist = que.remove(lowerCity);
            if(exist) {
                que.add(lowerCity);
                answer++;
            } else {
                if(que.size() == cacheSize) {
                    que.remove();
                }
                que.add(lowerCity);
                answer+=5;
            }
        }
        
        return answer;
    }
}