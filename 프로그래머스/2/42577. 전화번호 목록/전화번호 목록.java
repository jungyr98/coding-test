import java.util.HashMap;

class Node{
    HashMap<Character, Node> child;
    
    public Node() {
        this.child = new HashMap<>();
    }
}

class Trie {
    Node root;
    
    public Trie(){
        this.root = new Node();
    }
    
    public void insert(String str) {
        Node node = this.root;
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            node.child.putIfAbsent(c, new Node());
            node = node.child.get(c);
        }
    }
    
    boolean search(String str) {
        Node node = this.root;
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);                        
            
            if(node.child.containsKey(c)) {
                node = node.child.get(c);
            } else {
                return false;
            }
            
            if(i == (str.length()-1) && node.child.isEmpty()){
                return false;
            }
        }
        
        return true;
    }
}

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Trie trie = new Trie();
        
        for(String number : phone_book){
            trie.insert(number);
        }
        
        for(String number : phone_book){
            if(trie.search(number)){
                return false;
            }
        }      
        
        return answer;
    }
}