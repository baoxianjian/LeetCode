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
public class StringtoInteger_atoi_8 {
    public int myAtoi(String str) {
        if(str==null || str.length() == 0) return 0;
        long res = 0;
        int len = str.length();
        int idx = 0;
        boolean negative = false;
        while (str.charAt(idx) ==' ') {
            idx++;
            if(idx == str.length())
                return 0;
        }
        if(str.charAt(idx) == '+') {
            idx++;
        } else if(str.charAt(idx) == '-') {
            negative = true;
            idx++;  
        }
        
        for(int i=idx; i<len; i++) {
            if (str.charAt(i)< '0' || str.charAt(i) > '9') {
                break;
            }
            res = res*10 + Character.getNumericValue(str.charAt(i));
            if(res > Integer.MAX_VALUE) break;
        }
        
        res = negative ? -res : res;
        if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)res;
    }
    
    
    public static void main(String args[])
    {
        int num = new StringtoInteger_atoi_8().myAtoi("  +4a2");
        System.out.println(num);
    }
}
