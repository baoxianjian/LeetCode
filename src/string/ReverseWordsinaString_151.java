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
public class ReverseWordsinaString_151 {
    
    public String reverseWords(String s) {
        if(s==null || s==""){return "";}
        
        s=s.replaceAll("[ ]+", " ");
        String[] words =s.split(" ");
        String str="";
        for(int i=words.length-1;i>=0;i--)
        {
            str+=words[i]+" ";
        }
        
        return str.trim();
    }
    
    public void reverseWordsTest()
    {
        String str=this.reverseWords("the sky    is bulue");
        System.out.println(str);
    }

}
