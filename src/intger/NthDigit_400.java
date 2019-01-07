/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

/**
 *
 * @author xbao
 */
public class NthDigit_400 {
    public int findNthDigit(int n) {
        if (n <= 9) {
            return n;
        }
        long start = 1, num = 9;
        int len = 1;
        //100>9
        //91>2*90
        while (n > len * num) {
            n -= len * num;  //100-9=91
            start *= 10; //10
            len ++; //2
            num *= 10; //90
        }
        start = start + (n - 1) / len;
        return String.valueOf(start).charAt((n - 1) % len) - '0';
    }
    
    
    
    public static void main(String[] args){
        //1~9
        //10~54 45*2=90
        //55 100
        System.out.println(new NthDigit_400().findNthDigit(10061));
    }
}
