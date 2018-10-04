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
    
    //���ַ���ֻ������ nums[i]>=0�����
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
                //һ����Ϊ��,˵���Ѿ�����ǹ������ظ�
                //һ�����ظ��Ĵ���=����δ����������(ռ��λ)
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
        //��������ͬ�����ɵ�
        for(int num : nums)
        {
            diff ^= num;
        }
        
        //ʣ�µ�����2��
        diff &= -diff;
        
        int[] result = new int[2];
        for(int num : nums)
        {
            //��һ��
            if((diff & num) ==0)
            {
                result[0] ^= num;
            }
            else //�ڶ���
            {
                result[1] ^= num;
            }
        }
        return result;
    }
}
