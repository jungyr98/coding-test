import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int num : numbers){
            answer -= num;
        }
        return answer;
    }
}