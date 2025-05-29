class Solution {
    public String solution(String s) {
        
        String[] array = s.split(" ", -1);
        String answer = "";
        
        for(int i=0; i<array.length; i++){
            String text = array[i];
            if(i != 0){
                answer += " ";
            }
            for(int j=0; j<text.length(); j++){
                if(j%2 == 1){
                    answer += String.valueOf(text.charAt(j)).toLowerCase();
                }else {
                    answer += String.valueOf(text.charAt(j)).toUpperCase();
                }
            }            
        }
            
        return answer;
    }
}