/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

/**
 *
 * @author XBao
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int old = x;
        long temp = 0;
        
        while(x!=0)
        {
            temp = (temp*10) + x%10;
            x = x/10;
        }
        if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE)
            return false;

        return temp == old;
    }
    
    
    public static void main(String[] args){
        System.out.println(new PalindromeNumber_9().isPalindrome(202));
    }
}
