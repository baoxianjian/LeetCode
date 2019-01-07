/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.HashSet;
import java.util.Set;

/**
 let:i, right:j
    p w w k e w
    -> 
    -->         
      ->         
        ->         
        -->         
        ---->         
          ---->
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static int lengthOfLongestSubstring(String s) {
        int i=0, j=0, max=0, len=s.length();
        Set<Character> set = new HashSet<>();
        while(j < len){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }else{
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
            
            System.out.println(s.substring(i,j));
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        System.out.println(LongestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring("pwwkew"));
    }
}
