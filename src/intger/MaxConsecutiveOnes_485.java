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
public class MaxConsecutiveOnes_485 {
    
    public static void main(String[] args)
    {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        
    }
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]==1)
            {
                count++;
                max = count > max ? count : max;
            }
            else
            {
                count = 0;
            }
        }
        return max;
    }
}
