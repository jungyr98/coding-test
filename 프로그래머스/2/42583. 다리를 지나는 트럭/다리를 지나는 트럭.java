import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int weight_total = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int truck : truck_weights) {
            queue.add(truck);
        }
        
        while(!queue.isEmpty()) {
            answer++;
            if(bridge.size() > 0 && answer > bridge_length) {
                weight_total -= bridge.poll();
            }
            if((weight >= weight_total + queue.peek()) && (bridge_length >= bridge.size()+1)) {
                bridge.add(queue.peek());
                weight_total += queue.poll();
            } else {
                bridge.add(0);
            }
        }
        
        if(bridge.size() == truck_weights.length){
            answer = (bridge_length + bridge.size());
        } else {
            answer += bridge.size();
        }
        
        return answer;
    }
}