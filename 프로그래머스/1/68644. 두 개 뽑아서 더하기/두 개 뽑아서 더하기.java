import java.util.Arrays;
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        answer = Arrays.stream(answer).distinct().toArray();
        Arrays.sort(answer);
        return answer;
    }
}