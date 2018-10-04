/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baoge
 */
public class FindAllDuplicatesinanArray_442 {
    
    public static void main(String[] args)
    {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
    
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length==0) return list;
        
        for(int i=0; i<nums.length; i++)
        {
            int vIdx = Math.abs(nums[i])-1;
            //已经是负的(说明之前已经处理过) 即重复值
            if(nums[vIdx] < 0)
            {
                list.add(vIdx+1);
            }
            nums[vIdx] = -nums[vIdx];
        }
        return list;
    }
}
