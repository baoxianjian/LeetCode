package tree.solution;

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap; 

// Testing class 
public class ImplementTrie_208 { 
    
class Trie {
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
    public Trie() {
        root = new TrieNode((char)0);
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
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
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word == null || word.equals("")) return false;
        int len = word.length();
        TrieNode node = root;
        for(int i=0; i<len; i++) {
            HashMap<Character, TrieNode> children = node.children;
            
            char c = word.charAt(i);
            if(children.containsKey(c)) {
                node = children.get(c);
                if(node.isEnd && i==len -1){
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null || prefix.equals("")) return false;
        int len = prefix.length();
        TrieNode node = root;
        for(int i=0; i<len; i++) {
            HashMap<Character, TrieNode> children = node.children;
            char c = prefix.charAt(i);
            if(children.containsKey(c)) {
                node = children.get(c);
                if(i == len - 1) 
                    return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    public void test(){
        Trie dict = new Trie(); 
        dict.insert("are"); 
        dict.insert("area"); 
        dict.insert("base"); 
        dict.insert("cat"); 
        dict.insert("cater"); 
        dict.insert("basement"); 
  
        String input = "cater"; 
        System.out.print(input + ":   "); 
        System.out.println(dict.search(input));
  
        input = "bas"; 
        System.out.print(input + ":   "); 
        System.out.println(dict.startsWith(input));                       
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
   
   public static void main(String[] args) { 
       ImplementTrie_208 test = new ImplementTrie_208();
       test.new Trie().test();
       
        
    } 
}
