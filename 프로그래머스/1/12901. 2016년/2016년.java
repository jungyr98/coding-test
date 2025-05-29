import java.util.Locale;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;

class Solution {
    public String solution(int a, int b) {
        
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        String answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        return answer;
    }
}