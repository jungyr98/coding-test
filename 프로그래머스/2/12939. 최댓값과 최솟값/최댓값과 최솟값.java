import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";        
        String[] split = s.split(" ");
        int[] array = new int[split.length];
        
        for(int i=0; i<array.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        
        Arrays.sort(array);
        answer += array[0] + " " + array[split.length-1];
        
        return answer;
    }
}