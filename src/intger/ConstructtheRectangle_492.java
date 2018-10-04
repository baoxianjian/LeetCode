/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

import java.util.Arrays;

/**
 *
 * @author baoge
 */
public class ConstructtheRectangle_492 {
    
    public static void main(String[] args)
    {
        constructRectangle(4);
        constructRectangle(6);
        constructRectangle(8);
        constructRectangle(10);
        
        constructRectangle(12);
        constructRectangle(14);
        constructRectangle(16);
        constructRectangle(18);
    }
    
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];
        int sqrtN = (int)Math.sqrt(area);
        for(int i=sqrtN; i>0;i--)
        {   
            if(area % i == 0)
            {
                int j = area / i;
                result[0] = j;
                result[1] = i;
                System.out.println(Arrays.toString(result));
                return result;
            }
        }
        return result;
    }
}
