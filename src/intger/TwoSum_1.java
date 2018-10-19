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
 * @author XBao
 */
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    
    public static void main(String[] args)
    {
       int[] result = new TwoSum_1().twoSum(new int[]{2, 7, 11, 15}, 9);
       Arrays.stream(result).forEach(System.out::println);
    }
}
