class Solution {
    public String solution(String s, int n) {
        String answer = ""; // 시저 암호
        
        for(int i=0; i<s.length(); i++){            
            if(Character.isSpaceChar(s.charAt(i))){ // 공백일 때
                answer += " ";
            }else{ // 알파벳일 때
                int t = s.charAt(i) + n;
                int decimal = s.charAt(i);
                if(decimal >= 65 && decimal <= 90) { // 대문자일 때
                    if(t > 90){
                        t = 64 + (t - 90);
                    }
                }else { // 소문자일 때
                    if(t > 122){
                        t = 96 + (t - 122);
                    }    
                }          
                answer += String.valueOf((char)t);
            }                
        }
        return answer;
    }
}