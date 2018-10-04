/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.stream.Stream;

/**
 *
 * @author baoge
 */
public class DetectCapital_520 {
    
    public static void main(String[] args)
    {
        detectCapitalUseTest();
    }
    
    public static void detectCapitalUseTest() 
    {
        //System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
      //  System.out.println(detectCapitalUse("leetcode"));
      //  System.out.println(detectCapitalUse("Google"));
    }
    
    public static boolean detectCapitalUse(String word) {
        if(word == null || word.trim().length() == 0) return false;
        //return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()));
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
