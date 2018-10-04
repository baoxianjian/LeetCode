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
public class SingleNumber_260 {
    
    public static void main(String[] args)
    {
         singleNumberTest();
    }
    
    
    public static void singleNumberTest()
    {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }
    
    //这种方法只能用于 nums[i]>=0的情况
    public static int[] singleNumber1(int[] nums) 
    {
        if(nums == null || nums.length==0) return null;
        
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            int vIdx = Math.abs(nums[i])-1;
            
            if(nums[vIdx] > 0)
            {
                nums[vIdx] = -nums[vIdx];
            }
            else
            {
                //一个数为负,说明已经被标记过，即重复
                //一个数重复的次数=其他未出现数次数(占了位)
                count++;
            }
        }
        
        int[] result = new int[count];
        for(int i=0,j=0; i<nums.length;i ++)
        {
            if(nums[i]>0)
            {
                result[j++] = nums[i];
            }
        }
        return result;
    }
    
    
    public static int[] singleNumber(int[] nums) {
        int diff = 0;
        //用异或把相同的数干掉
        for(int num : nums)
        {
            diff ^= num;
        }
        
        //剩下的数分2组
        diff &= -diff;
        
        int[] result = new int[2];
        for(int num : nums)
        {
            //第一组
            if((diff & num) ==0)
            {
                result[0] ^= num;
            }
            else //第二组
            {
                result[1] ^= num;
            }
        }
        return result;
    }
}
