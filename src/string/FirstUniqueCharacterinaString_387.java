package string;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class FirstUniqueCharacterinaString_387 {
    
    public static void main(String[] args)
    {
        System.out.println(firstUniqChar3("leetcode"));
//        System.out.println(firstUniqChar("loveleetcode"));
//        System.out.println(firstUniqChar("cc"));
//        System.out.println(firstUniqChar("cca"));
//        System.out.println(firstUniqChar("acc"));
//        System.out.println(firstUniqChar("aadadaad"));
    }
    
    public static int firstUniqChar(String s) {
        if(s==null) return -1;
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                int idx = s.indexOf(s.charAt(i), i+1);
                if( idx == -1)
                {
                    return i;
                }
                s=s.replaceAll(s.charAt(idx)+"", Character.toUpperCase(s.charAt(idx))+"");
            }
        }
        
        return -1;
    }
    
    
    
    public static int firstUniqChar2(String s) {
        int freq [] = new int[26];
        int len=s.length();
        for(int i = 0; i < len; i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < len; i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
    
    public static int firstUniqChar3(String s) {
        int[] count = new int[256];
        char[] sa = s.toCharArray();
        for (char ch : sa) count[ch]++;
        for (int i=0; i<sa.length;i++) {
            if(count[sa[i]]==1) return i;
        }
        return -1;
    }

    public static int firstUniqChar4(String s) {
        int minInd = Integer.MAX_VALUE;
        int temp = 0;
        
        for (int i=97; i<123; i++) {
            temp = s.indexOf(i);
            if (temp != -1 && temp == s.lastIndexOf(i)) //正反面找到的都是它 即唯一
                minInd = Math.min(temp, minInd); //把所有唯一的字母找出 取位置最靠前的
        }
        
        return minInd == Integer.MAX_VALUE? -1: minInd;
    
    }
    
    
}
