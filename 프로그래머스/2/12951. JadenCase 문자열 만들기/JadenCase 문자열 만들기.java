class Solution {
    public String solution(String s) {
        String answer = "";
        String toLower = s.toLowerCase(); // 전체 소문자로 변경
        char[] arr = toLower.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            String text = String.valueOf(arr[i]);
            // 최초 문자거나 이전 문자가 공백일경우
            if(i==0 || (i>0 && arr[i-1] == 32)) {
                text = text.toUpperCase();
            }
            answer += text;
        }
        
        return answer;
    }
}