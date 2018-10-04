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
public class AddDigits_258 {
    public static void main(String[] args)
    {
        System.out.println(addDigits(38));
    }
    
    public static int addDigits(int num) {
        //一个数:100a+10b+c, then (100a+10b+c)%9=(a+99a+b+9b+c)%9=(a+b+c)%9
        //38%9=(30+8)%9=(10*3+8)%9=(3+27+8)%9 = (8+3)%9
        //右推左 
        if(num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
