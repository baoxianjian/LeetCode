package intger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class FindAllNumbersDisappearedinanArray_448 {
    
    public static void main(String[] args)
    {
         findDisappearedNumbersTest();
    }
    
    
    public static void findDisappearedNumbersTest()
    {        
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        //-4,-3,-2,-7,8,2,-3,-1
    }
    
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length == 0) return list;
        
        //下标+1就可以对应一个元素了
        for(int i=0; i<nums.length; i++)
        {
            int vIdx = Math.abs(nums[i])-1;
            //已经是负的(说明之前已经处理过) 就不再赋负值
            if(nums[vIdx] > 0) nums[vIdx] = -nums[vIdx];
        }
        //System.out.println(Arrays.toString(nums));
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0) list.add(i+1);
        }
        return list;
    }
}
