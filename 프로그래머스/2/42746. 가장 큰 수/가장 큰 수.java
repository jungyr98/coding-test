import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int sum = 0;
        // int[] -> Integer[] -> List<Integer>
        Integer fmtNumbers[] = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        // 자릿수에 관계없이 앞자리부터 큰 순서대로 정렬하기
        Arrays.sort(fmtNumbers, (o1, o2) -> {
            String sa = String.valueOf(o1);
            String sb = String.valueOf(o2);
            return (sb + sa).compareTo(sa + sb);
        });
        
        for(Integer num : fmtNumbers) {
            sum += num;
            answer += num.toString();
        }
        // "000.." 방지
        if(sum == 0) answer = "0";
        
        return answer;
    }
}