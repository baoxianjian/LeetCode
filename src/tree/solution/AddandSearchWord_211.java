package tree.solution;

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class AddandSearchWord_211 {
    
    
class WordDictionary {
    private TrieNode root;
    
    class TrieNode {
       public char val;
       public HashMap<Character, TrieNode> children;
       public boolean isEnd;

       public TrieNode(char ch) {
           this.val = ch;
           this.children = new HashMap<>();
           this.isEnd = false;
       }
    } 

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode((char)0);
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        if(word == null || word.equals("")) return;
        int len = word.length();
        TrieNode node = root;
        
        for(int level=0; level<len; level++) {
            char c = word.charAt(level);
            HashMap<Character, TrieNode> children = node.children;
            
            if(children.containsKey(c)) {
                node = children.get(c);
            } else {
                TrieNode temp  = new TrieNode(c);
                children.put(c, temp);
                node = temp;
            }
            if(level == len - 1) {
                node.isEnd = true;
                return;
            }
        }
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */    
    public boolean search(String word) {
        if(word == null || word.equals("")) return false;
        return search(word, 0, word.length(), root);
    }
    
    private boolean search(String word, int idx, int len, TrieNode node) {
        if(idx == len) 
        {
            if(node.isEnd) return true;
            else return false;
        }                
        char c = word.charAt(idx);
        HashMap<Character, TrieNode> children = node.children;
        
        if(c == '.') {
            idx++;
            boolean result = false;
            for (Map.Entry<Character, TrieNode> entry : children.entrySet()) {
                //System.out.println(idx+" "+entry.getValue().val);
                result = search(word, idx, len, entry.getValue());
                if (result) return true;
            }
            return false;
        }
        
        if(children.containsKey(c)){
            TrieNode temp = children.get(c);
            idx++;
            //System.out.println(idx+" "+temp.val);
            return search(word, idx, len, temp);
        }
        
        return false;
    }
        
    public void test(){
        WordDictionary dict = new WordDictionary(); 
        dict.addWord("are"); 
        dict.addWord("area"); 
        dict.addWord("base"); 
        dict.addWord("cat"); 
        dict.addWord("cater"); 
        dict.addWord("basement"); 
  
        String input = "cat.."; 
        System.out.print(input + ":   "); 
        System.out.println(dict.search(input, 0, input.length(), dict.root));
  
//        input = "bas"; 
//        System.out.print(input + ":   "); 
//        System.out.println(dict.startsWith(input));                       
//  
//        input = "are"; 
//        System.out.print(input + ":   "); 
//        System.out.println(dict.getMatchingPrefix(input));               
//  
//        input = "arex"; 
//        System.out.print(input + ":   "); 
//        System.out.println(dict.getMatchingPrefix(input));               
//  
//        input = "basemexz"; 
//        System.out.print(input + ":   "); 
//        System.out.println(dict.getMatchingPrefix(input));                       
//  
//        input = "xyz"; 
//        System.out.print(input + ":   "); 
//        System.out.println(dict.getMatchingPrefix(input)); 
    }
    
    
}
   

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */ 
   public static void main(String[] args) { 
       AddandSearchWord_211 test = new AddandSearchWord_211();
       test.new WordDictionary().test();
       
        
    } 
}
