import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int num : nums){
            if(queue.isEmpty()){
                queue.add(num);
                answer++;
                continue;
            }
            if(!queue.contains(num)){
                queue.add(num);
                answer++;
            }
        }
        
        if(answer > nums.length/2){
            answer = nums.length/2;
        }
        
        return answer;
    }
}