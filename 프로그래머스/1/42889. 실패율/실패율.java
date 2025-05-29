import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int player = stages.length;
        Double[] array = new Double[N];
        Map<Integer, Double> map = new HashMap<>();
        
        Arrays.sort(stages);      
        for(int i=1; i<(N+1); i++){
            int cUser = 0;
            for(int j=0; j<stages.length; j++){
                if(i == stages[j]) ++cUser;
            }
            double result = 0;
            if(cUser != 0) result = cUser/(double)player;
            array[i-1] = result;
            map.put(i, result);
            player -= cUser;
        }
        
        Arrays.sort(array, Collections.reverseOrder()); 
        for(int i=0; i<array.length; i++){
           for(int j=1; j<N+1; j++){               
               if(map.get(j) != null){
                   int result = Double.compare(map.get(j), array[i]);
                   if(result == 0){                   
                        answer[i] = j;
                        map.remove(j);
                        break;
                   }
               }
           }
        }
        
        return answer;
    }
}