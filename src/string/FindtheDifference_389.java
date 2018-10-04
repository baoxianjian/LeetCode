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
public class FindtheDifference_389 {
    
    public static void main(String[] args)
    {
        System.out.println(findTheDifference("adbc","abcd"));
    }
    
    public static char findTheDifference(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
	char c = t.charAt(len2-1);
	for (int i = 0; i < len1; ++i) {
            c ^= s.charAt(i); //d adbc abcd
            c ^= t.charAt(i); //aaÏû ddÏû ccÏû
	}
	return c;
    }
    
}
