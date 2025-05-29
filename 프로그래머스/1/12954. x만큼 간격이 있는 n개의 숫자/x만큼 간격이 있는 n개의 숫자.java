class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0; // 합계 변수 초기화
        for(int i=0; i<n; i++){
            sum += x;
            answer[i] = sum;
        }
        
        return answer;
    }
}