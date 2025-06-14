import java.util.Stack;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 정답 Array
        int[] endArray = new int[prices.length]; // 계산을 끝낸 숫자 Array
        Stack<Integer> stack = new Stack<>(); // 스택 객체
        int idx = 0; // 배열 인덱스용 변수
        
        // 1. 매개변수 prices 값 스택 객체에 복사
        for(int price : prices) {
            stack.push(price);
        }
        
        // 2. Stack 순서대로 제거하며 가격 비교
        while(!stack.isEmpty()){
            int saveCount = 0; // 떨어지지 않은 기간(초)
            int price = stack.pop(); // 현재 기준 가격
            int size = endArray.length - stack.size() -1;
            if(price == 1) {
                saveCount = size;
            } else {
                for(int i=size; i>=0; i--) {
                    if(endArray[i] == 0) continue;
                    // n초 시점의 가격이 n+m초 가격보다 클 경우
                    if(price > endArray[i]) {
                        saveCount += 1;
                        break;
                    }
                    saveCount++;
                }
            }
            endArray[idx] = price;
            answer[idx] = saveCount;
            idx++;
        }
        
        // reverse 처리
        int n = answer.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = answer[i];
            answer[i] = answer[n - 1 - i];
            answer[n - 1 - i] = temp;
        }
        
        return answer;
    }
}