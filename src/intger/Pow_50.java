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
public class Pow_50 {
    public double myPow(double x, int n) {
        boolean sign = n > 0 ? true : false;
        n = Math.abs(n);
        double result = helper(x, n);
        return sign ? result : 1 / result;
    }
    
    private double helper(double x, int n){
        if(n == 1) return x;
        if(n == 0) return 1;
        double temp = helper(x, n/2); //5 2 1
        return n % 2 == 0 ? temp*temp : x*temp*temp;
    }
    
    
    public static void main(String[] args){
       System.out.println(new Pow_50().myPow(3d, 1));
       System.out.println(new Pow_50().myPow(3d, -2));
       System.out.println(new Pow_50().myPow(3d, 5));
       
    }
}
