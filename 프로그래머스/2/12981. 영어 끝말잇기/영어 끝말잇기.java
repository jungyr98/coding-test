import java.util.Arrays;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        String[] end = new String[words.length];
        end[0] = words[0];
        
        for(int i=1; i<words.length; i++) {
            String pre = words[i-1];
            String result = words[i];            
            if(Arrays.asList(end).indexOf(result) == -1 && pre.charAt(pre.length()-1) == result.charAt(0)) {
                end[i] = result;
            } else {
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = (i+1) % n == 0 ? (i+1) / n : ((i+1) / n)+1;
                break;
            }
        }

        return answer;
    }
}