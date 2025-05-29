import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] array = new int[k];
        
        for(int i=0; i<score.length; i++){
            if(i<k){
                array[0] = score[i];
                Arrays.sort(array);
                answer[i] = array[(k-1)-i];
            }else {                
                if(score[i] <= array[0]){
                    answer[i] = array[0];
                    continue;
                }
                for(int j=0; j<k; j++){
                    if(score[i] >= array[j]){
                        int changeNum = array[j];
                        array[j] = score[i];
                        if(j!=0) array[j-1] = changeNum;
                    }
                }
                Arrays.sort(array);
                answer[i] = array[0];
            }            
        }        
        return answer;
    }
}