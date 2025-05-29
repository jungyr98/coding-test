import java.util.*;

class Record {
    int no;
    int stream;
    String type;
    
    public Record (int no, int stream, String type) {
        this.no = no;
        this.stream = stream;
        this.type = type;
    }

}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        List<Record> list = new ArrayList<>();
        
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
            Record record = new Record(i, plays[i], genres[i]);
            list.add(record);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        Collections.sort( list, (o1,o2) -> o2.stream - o1.stream );
        
        for(String type : keySet){
            int count = 0;
            for(Record record : list){
                if(type.equals(record.type)){
                    count++;
                    answer.add(record.no);
                    if(count==2) break;
                }
            }
        }
        
        int[] arr = answer.stream()
                .mapToInt(i -> i)
                .toArray();
        
        
        return arr;
    }
}