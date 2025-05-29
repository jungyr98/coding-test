class Solution {
    public Long solution(Long n) {
        
        String fmtNum = Long.toString(n); // Long 형 문자열로 변환
        Long[] array = new Long[fmtNum.length()]; // 정수 배열 초기화
        
        // 문자열에서 문자 추출 후 Long 타입 배열에 담기
        for(int i=0; i<fmtNum.length(); i++){
            array[i] = Long.parseLong(String.valueOf(fmtNum.charAt(i)));
        }
        
        String text = "";
        for(int i=0; i<array.length; i++){
            for(int j=(i+1); j<array.length; j++){
                if(array[i] < array[j]){
                    Long prevNum = array[i];
                    array[i] = array[j];
                    array[j] = prevNum;
                }
            }
            text += array[i];
        }
        Long answer = Long.parseLong(text);
        return answer;
    }
}