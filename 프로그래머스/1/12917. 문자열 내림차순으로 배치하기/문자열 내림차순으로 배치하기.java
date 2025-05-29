import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            answer += String.valueOf(arr[i]);
        }
        StringBuilder sb = new StringBuilder(answer);
        answer = sb.reverse().toString();
        return answer;
    }
}