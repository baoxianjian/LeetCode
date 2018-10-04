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
public class MoveZeroes_283 {
    
    public static void main(String[] args)
    {

        moveZeroes(new int[]{0, 1, 0, 0, 0, 3, 12});
        moveZeroes(new int[]{1, 0, 0, 0, 3, 12});
        moveZeroes(new int[]{1, 0, 0, 0, 3, 12, 0});
        
    }
//    
//    public static  void moveZeroes(int[] nums) {
//        if(nums == null || nums.length == 0){return;}
//        
//        int exchangeIdx = -1;
//        int temp;
//        for(int i=0; i<nums.length; i++)
//        {
//            if(exchangeIdx==-1)
//            {
//                if(nums[i]==0) exchangeIdx = i;
//            }
//            else
//            {
//                if(nums[i]!=nums[exchangeIdx] )
//                {
//                    temp = nums[exchangeIdx];
//                    nums[exchangeIdx] = nums[i];
//                    nums[i] = temp;
//                    exchangeIdx++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//    
      public static  void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){return;}
        
        int exchangeIdx = 0;
        int temp;
        for(int i=0; i<nums.length; i++)
        {            
            if(nums[i]!=0 )
            {
                temp = nums[exchangeIdx];
                nums[exchangeIdx] = nums[i];
                nums[i] = temp;
                exchangeIdx++;
            }   
        }
        System.out.println(Arrays.toString(nums));
    }
}
