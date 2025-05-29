class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        char[] array = s.toCharArray();

        if(array.length%2 != 0){ 
            return false; 
         }
        
        for(int i=0; i<array.length; i++){
            if(array[i] == 40) {
                a++;
            } else if(array[i] == 41) a--;
            
            if(a<0 || (i==array.length-1 && a>0)) {
                return false;
            }
        }

        return answer;
    }
}