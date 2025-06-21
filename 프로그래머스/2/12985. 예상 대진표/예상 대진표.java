import java.lang.Math;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int nLog = (int) Math.floor(Math.log(Math.abs(n)) / Math.log(2));
        int half = (int) Math.pow(2, nLog-1);
        int answer = 1;        
        while(nLog > 0) {
            if((b%2==0 && b-1 == a) || (a%2==0 && a-1 == b)) {
                return answer;
            }
            if((a <= half && b > half) || (b <= half && a > half)) {
                answer = nLog;
                break;
            }            
            a -= (a/2);
            b -= (b/2);
            nLog = (int) Math.floor(Math.log(Math.abs(half)) / Math.log(2));
            half = (int) Math.pow(2, nLog-1);
            if(a > half && b > half) {
                a -= half;
                b -= half;
            }
            answer++;
        }
       
        
        return answer;
    }
}