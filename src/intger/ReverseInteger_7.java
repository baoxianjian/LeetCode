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
public class ReverseInteger_7 {
    public int reverse(int x) {
        long res = 0;
        //521   
        while(x!=0){
            res = (res*10) + (x%10); //1 2 5
            x = x/10; //52 5 0 
        }
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int)res;
    }
    
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE/2-1);
        System.out.println(new ReverseInteger_7().reverse(1073741823));
    }
}
