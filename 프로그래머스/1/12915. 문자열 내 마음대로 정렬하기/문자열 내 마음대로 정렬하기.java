import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (o1, o2) -> o1.charAt(n) == o2.charAt(n) ? o1.compareTo(o2) : String.valueOf(o1.charAt(n)).compareTo(String.valueOf(o2.charAt(n))));
        
        return strings;
    }
}