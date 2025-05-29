import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        for(int num : arr){
            list.add(num);
        }
        Arrays.sort(arr);
        
        if(arr.length >1){
            int cnt = 0;
            answer = new int[arr.length-1];
            for(int i=0; i<list.size(); i++){
                if(list.get(i) != arr[0] ){
                    answer[cnt] = list.get(i);
                    cnt++;
                }                
            }                  
        }else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}