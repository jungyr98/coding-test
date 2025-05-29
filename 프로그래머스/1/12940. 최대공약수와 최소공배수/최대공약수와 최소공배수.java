class Solution {
    
    public int findGcd(int a, int b){
        int extra = a%b;
        if(extra == 0) return b;
        return findGcd(b, extra);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;
        if(n<m){
            a = m;
            b = n;
        }
        int gcd = findGcd(a, b);
        int lcm = (n*m) / gcd;
        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }
}