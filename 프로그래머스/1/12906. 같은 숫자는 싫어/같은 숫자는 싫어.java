import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        for(int num : arr){
            if(stack.isEmpty()){
                stack.push(num);
                queue.add(num);
                continue;
            }
            if(stack.peek() != num){                
                stack.push(num);
                queue.add(num);
            }
        }
        
        int[] answer = new int[queue.size()];
        int cnt = 0;
        while(!queue.isEmpty()){
            answer[cnt] = queue.poll();
            cnt++;
        }

        return answer;
    }
}