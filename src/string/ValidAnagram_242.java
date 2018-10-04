/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author baoge
 */
public class ValidAnagram_242 {
    public static void main(String[] args)
    {
        System.out.println(isAnagram("ac","ca"));
    }
    
    public static boolean isAnagram(String s, String t) {
        if(s==null && t==null) return true;
        if(s == null || t== null) return false;
        if(s.length() != t.length()) return false;
        
        int[] counter = new int[26];
        int length = s.length();
        for(int i=0; i< length; i++)
        {
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int i=0;i<counter.length; i++)
        {
            if(counter[i]!=0) return false;
        }
        return true;
    }
}
