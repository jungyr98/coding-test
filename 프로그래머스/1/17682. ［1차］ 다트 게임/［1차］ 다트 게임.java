import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;        
        int prePoint = 0;
        
        for(int i=1; i<dartResult.length(); i++){
            int point = 0;
            int pow = 0;
            String dart = String.valueOf(dartResult.charAt(i));
        
            if(dart.equals("S")) pow = 1;
            else if(dart.equals("D")) pow = 2;
            else if(dart.equals("T")) pow = 3;
            
            if(pow != 0) {
                int preNum = Integer.parseInt(String.valueOf(dartResult.charAt(i-1)));
                if(i >= 2 && String.valueOf(dartResult.charAt(i-2)).equals("1")) preNum = 10;
                point = (int) Math.pow(preNum, pow);

                if(i != dartResult.length()-1) {
                    String option = String.valueOf(dartResult.charAt(i+1));
                    if(option.equals("#")) point *= -1;
                    else if(option.equals("*")) {
                        point *= 2;
                        answer = (answer - prePoint) + (prePoint*2);
                        prePoint = prePoint*2;                        
                    }
                }

                prePoint = point;
                answer += point;
            }
        
            
        }
        
        return answer;
    }
}