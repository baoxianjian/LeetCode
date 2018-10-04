/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author baoge
 */
public class MajorityElement_169 {
    
    public static void main(String[] args)
    {
        System.out.println(majorityElement3(new int[]{6,5,5}));
        System.out.println(majorityElement(new int[]{1,1,1,4,4,4,3,4,4}));
        System.out.println(majorityElement2(new int[]{1,1,1,4,4,4,3,4,4}));
        System.out.println(majorityElement3(new int[]{1,1,1,4,4,4,3,4,4}));
    }
    
    //相消法
    public static int majorityElement(int[] nums) {
        //1,1,1,4,4,4,3,4,4
        //前三个和后面三个消除
        //3和4消除
        //剩下4
        //因为major的个数大于一半 相消后必定有一个(或多个)剩余的major
        int major = nums[0];
        int count = 1;
        for(int i=1; i<nums.length;i++)
        {
            if(count==0)
            {
                major = nums[i];
                count++;
            }
            else if(nums[i] == major) count++;
            else count--;
        }
        return major;
    }
    
    //排序法
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    
    //hash法
    public static int majorityElement3(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int half = nums.length/2;
        for(int i=0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else 
            {
                hm.put(nums[i],1);
            }
            if(hm.get(nums[i]) > half)
                return nums[i];
        }
        return 0;
    }
}
