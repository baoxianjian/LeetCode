/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xbao
 */
public class Permutations_46 {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static int[] path = new int [100];
    public static boolean[] v = new boolean[100];
    
    public static void robot(int idx, int[] nums)
    {
        //定位到循环的最后一层
        if (idx >= nums.length) {
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i=0; i<nums.length; i++) {
                tmp.add(nums[path[i]]);
            }
            ans.add(tmp);
            return;
        }
        for(int i=0; i<nums.length; i++) {
            //相当于i不等于j不等于k（假设三层）
            if(v[i] == false){
                path[idx] = i; //记录每一层的值
                //若第一层用过，第二层就不再使用
                v[i] = true;
                robot(idx+1, nums);
                //只跟层级（深度）有关系，下次循环依然可用
                v[i] = false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        ans.clear();
        robot(0, nums);
        return ans;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> ans = new Permutations_46().permute(new int[]{1,2,3});
        System.out.println(ans);
    }
}
