import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int begin = commands[i][0]-1;
            int end = commands[i][1]-1;
            int pick = commands[i][2]-1;
            int idx = 0;
            int[] slice = new int[(end-begin)+1];
            for(int j=begin; j<=end; j++){
                slice[idx] = array[j];                
                idx++;
            }
            Arrays.sort(slice);
            answer[i] = slice[pick];
        }
        
        return answer;
    }
}