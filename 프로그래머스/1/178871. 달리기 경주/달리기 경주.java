import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String,Integer> playersMap = new HashMap<String,Integer>();
        for(int i=0; i<players.length; i++){
            playersMap.put(players[i], i);
        }
        for(int i=0; i<callings.length; i++){            
            int idx = playersMap.get(callings[i]);
            String prePlayer = players[idx-1];
            players[idx-1] = callings[i];
            players[idx] = prePlayer;
            playersMap.put(callings[i], idx-1);
            playersMap.put(prePlayer, idx);
        }
        
        return players;
    }
}