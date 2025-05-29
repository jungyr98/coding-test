class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
                
        for(int i=0; i<n; i++){
            String fmt = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i])));
            answer[i] = fmt.replace("1", "#").replace("0", " ");
        }         
        
        return answer;
    }
}