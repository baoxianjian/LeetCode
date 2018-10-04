/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

/**
 *
 * @author baoge
 */
public class ExcelSheetColumnTitle_168 {
    public static void main(String[] args)
    {
       // System.out.println(((int)'A')); 65
//         System.out.println(1228%26);
//         System.out.println(1228/26%26);
//         System.out.println(1228/26/26%26);
         //1*26^2+
         //21*26^1
         //6*26^0
         System.out.println(convertToTitle(26));
         
    }
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0)
        {
            n--;
            sb.append(Character.toChars(n%26+65));
            n=n/26;
        }
        return sb.reverse().toString();
    }
}
