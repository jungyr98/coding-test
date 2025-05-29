class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int starLength = phone_number.substring(0, phone_number.length()-4).length();
        while(starLength > 0){
            answer += "*";
            starLength--;
        }
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
}