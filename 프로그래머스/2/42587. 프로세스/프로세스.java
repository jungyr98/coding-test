import java.util.*;

class Process {
    String name;
    int number;
    int idx;
    
    public Process(String name, int number, int idx){
        this.name = name;
        this.number = number;
        this.idx = idx;
    }
    
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int i = 0;
        int j = 1;
        int fCount = 0;
        String loc = String.valueOf((char)(65+location));
        Queue<Process> queue = new LinkedList<>();
        Queue<Process> sortQueue = new LinkedList<>();
        
        for(int no : priorities) {        
            Process process = new Process(String.valueOf((char)(65+i)), no, i);
            queue.add(process);
            i++;
        }
        
        int len = queue.size();
        while(sortQueue.size() < len) {
            Process process = queue.poll();
            boolean check = false;                           
            Iterator<Process> iter = queue.iterator();
            
            while(iter.hasNext()) {
                Process compareProc = iter.next();
                if(process.number < compareProc.number){                    
                    check = true;
                    break;
                }
            }
            
            if(check == false) {
                sortQueue.add(process);
            }else {
                queue.add(process);
            }
        }
        
        for(Process process : sortQueue){
            if(process.name.equals(loc)){
                return j;
            }
            j++;
        }
        

        return answer;
    }
}