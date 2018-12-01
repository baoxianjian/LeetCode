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
        if(s==null || s.equals("")){return "";}
        
        //s=s.replaceAll("[ ]+", " ");
        String[] words =s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            if(words[i].equals("")) {
                continue;
            }
            str.append(words[i]);
            str.append(" ");
          //  str+=words[i]+" ";
        }
        
        return str.toString().trim();
    }
    
    public static void main(String[] args)
    {
        String str=new ReverseWordsinaString_151().reverseWords("the sky    is bulue");
        System.out.println(str);
    }

}
