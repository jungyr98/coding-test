class Solution {
    public boolean solution(String s) {
        return s.matches("[0-9]+") && (s.length() == 4 || s.length() == 6) ? true : false;
    }
}