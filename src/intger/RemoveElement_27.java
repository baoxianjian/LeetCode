/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

import java.util.Arrays;

/**
 * 拿后面的数来补就行了, 补上的数（可能相同）也要重新判断，所以i--,
 * Note that the order of those five elements can be arbitrary.
 * @author baoge
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        for(int i=0;i<count;i++){
            if(val == nums[i]){
                nums[i] = nums[--count];
                i--;
            }
        }
        
        return count;
    }
    
    
    public static void main(String[] args)
    {
        int[] list = new int[]{0,1,2,2,3,0,4,2};
        new RemoveElement_27().removeElement(list, 2);
        Arrays.stream(list).forEach(System.out::println);
    }
}
