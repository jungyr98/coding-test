public class Solution {
    public int solution(int n) {
        
        String text = Integer.toString(n); // int 문자열로 형변환
        int sum = 0; // 합계
        
        for(int i=0; i<text.length(); i++){
            // char형으로 문자 추출 한 뒤 다시 String으로 형변환
            String textNum = String.valueOf(text.charAt(i));
            // 합계 구하기 위해 String을 int로 형변환
            int num = Integer.parseInt(textNum);
            sum += num;
        }

        return sum;
    }
}