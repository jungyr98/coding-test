import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(char word : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == word) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }

        return stack.size() > 0 ? 0 : 1;
    }
}