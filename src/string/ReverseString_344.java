/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author XBao
 */
public class ReverseString_344 {
    public String reverseString(String s) {
        if (s==null || s.equals("")) return "";
        char[] list = s.toCharArray();
        char [] list2 = new char[list.length];
        
        for(int i=list.length-1, j=0; i>=0; i--,j++)
        {
            list2[j] = list[i];
        }
        return String.valueOf(list2);
    }
    
    
    public static void main(String[] args)
    {
        System.out.println((new ReverseString_344()).reverseString(null));
    }
}
