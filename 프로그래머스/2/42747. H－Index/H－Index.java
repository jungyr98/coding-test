import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer fmtNumbers[] = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        
        // 내림차순 정렬
        Arrays.sort(fmtNumbers, Collections.reverseOrder());
        for(int i=0; i<fmtNumbers.length; i++) {
            Integer iNum = fmtNumbers[i];
            int check = 0;
            for(int j=0; j<fmtNumbers.length; j++) {
                if(iNum > fmtNumbers[j]) {
                    break;
                }
                check++;
            }
            
            if(check == iNum || (i==0 && iNum==1)) {
                answer = iNum;
                break;
            } else if (check > iNum) {
                answer = i;
                break;
            } else if (i==fmtNumbers.length-1 && check < iNum) {
                answer = check;
            }
        }
        
        return answer;
    }
}