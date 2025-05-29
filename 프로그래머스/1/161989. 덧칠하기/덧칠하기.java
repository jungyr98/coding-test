class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] space = new boolean[n];
        
        for(int idx : section){
            space[idx-1] = true;
        }

        int paint = 0;
        int cnt = 0;
        for(int i=0; i<space.length; i++){
            
            if(space[i] == true){
                if(cnt >= m){
                    paint++;
                    cnt = 1;
                }else {
                    if(cnt == 0) paint++;
                    cnt++;
                }
            }else {
                if(cnt > 0) cnt++;
            }
        }

        return paint;
    }
}