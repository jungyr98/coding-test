import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        double day = 0;
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int job : progresses){
            queue.add(job);
        }
        
        for(int i=0; i<speeds.length; i++){
            double job = queue.poll();            
            if(day == 0 || day >=(100-job)/speeds[i]) cnt++;
            else {
                list.add(cnt);
                cnt = 1;
            }
            
            if(cnt == 1) day = Math.ceil((100-job)/speeds[i]);          
            if(i == speeds.length-1) list.add(cnt);
            
        }
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}