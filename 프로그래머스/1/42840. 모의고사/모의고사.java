import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[][] group = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] total = new int[3];
        int cnt = 0;
        
        for(int i=0; i<group.length; i++){
            int sum = 0;
            int idx = 0;
            for(int num : answers){
                if(group[i][idx] == num) sum++;
                if((idx+1) == group[i].length) idx = 0;
                else idx++;
            }
            total[i] = sum;
        }
        
        int[] copy = total.clone();
        Arrays.sort(copy);
        for(int tot : total){
            if(tot == copy[copy.length-1]) cnt++;
        }
        
        int[] answer = new int[cnt];
        int idx = 0;
        for(int i=0; i<copy.length; i++){
            if(total[i] == copy[copy.length-1]) {
                answer[idx] = i+1;
                idx++;
            }
        }
        
        return answer;
    }
}