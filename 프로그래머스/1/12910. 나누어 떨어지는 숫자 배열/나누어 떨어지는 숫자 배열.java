import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int idx = -1;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        
        for(int num : arr){
            if(num%divisor == 0){
                idx++;
                list.add(num);
            }
        }
        if(idx < 0){
            answer = new int[1];
            answer[0] = idx;
        }else{
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}