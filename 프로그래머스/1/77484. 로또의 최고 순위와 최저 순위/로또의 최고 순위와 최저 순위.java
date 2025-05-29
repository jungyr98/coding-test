class Solution {
    public int getNo(int total) {
        int no = 0;
        
        switch (total) {
            case 6:
                no = 1;
                break;
            case 5:
                no = 2;
                break;
            case 4:
                no = 3;
                break;
            case 3:
                no = 4;
                break;
            case 2:
                no = 5;
                break;
            case 1:
            case 0:
                no = 6;
        }
        
        return no;
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int checked = 0;
        int zero = 0;
        
        for(int myNum : lottos) {
            if(myNum == 0) {
                zero++;
                continue;
            }
            for(int winNum : win_nums){
                if(myNum == winNum) {
                    checked++;
                    break;
                }
            }
        }
        
        answer[0] = getNo(checked + zero);
        answer[1] = getNo(checked);
        
        return answer;
    }
}