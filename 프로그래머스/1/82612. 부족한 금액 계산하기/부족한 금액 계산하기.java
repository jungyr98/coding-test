class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long pay = 0;
        for(int i=1; i<=count; i++){
            pay += price*i;
        }
        if(money-pay < 0){
            answer = -1*(money-pay);
        }    
        return answer;
    }
}