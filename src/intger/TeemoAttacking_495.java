package intger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class TeemoAttacking_495 {
    public static void main(String[] args)
    {
        System.out.println(findPoisonedDuration(new int[]{1,3,7,8,12,15},3));
    }
    
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries==null || timeSeries.length==0){return 0;}
        int sum = 0;
        for(int i =1; i<timeSeries.length; i++)
        {
            sum += Math.min(timeSeries[i]-timeSeries[i-1], duration);
        }
        
        return sum+duration;
    }
}
