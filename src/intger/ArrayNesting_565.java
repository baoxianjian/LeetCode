package intger;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class ArrayNesting_565 {
    
    public static void main(String[] args)
    {
        System.out.println(arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }
    
    public static int arrayNesting(int[] nums) {
        
        int max = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] < 0){continue;} //说明该元素在某个路径中走过
            int idx = i;
            int length = 1;
            
            while(Math.abs(nums[idx])!=i) //索引不回来 所有元素唯一 不会再其他地方徘徊
            {
                idx = Math.abs(nums[idx]);
                nums[idx] = - nums[idx];
                length++;
            }
            max = Math.max(max, length);
        }
        return max;
    }   
    
    public static int arrayNestingOrigianl(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++)
        {
            int idx = i;
            int length = 1;
            
            while(nums[idx]!=i) //索引不回来 所有元素唯一 不会再其他地方徘徊
            {
                idx = nums[idx];
                length++;
            }
            max = Math.max(max, length);
        }
        return max;
    }   
}
