package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xbao
 */
public class SubsetsII_90 {
    
    public static List<List<Integer>> ans = new ArrayList<>();
    public static boolean[] v = new boolean[100];
    
    public static void dfs(int idx, int nums[]) {
        if(idx>=nums.length) {
            List<Integer> tmp = new ArrayList<>();
            for(int i=0;i<nums.length;i++) {
                if(v[i]){
                    tmp.add(nums[i]);
                }
            }
            ans.add(tmp);
            return;
        }
        //大于0 && 上一层的值和当前值相等 && 上一层已经访问完毕
        if(idx > 0 && nums[idx] == nums[idx-1] && v[idx-1]==false) {
            v[idx] = false;
            dfs(idx+1, nums);
        } else {
            v[idx] = true;
            dfs(idx+1, nums);
            v[idx] = false;
            dfs(idx+1, nums);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();
        Arrays.sort(nums);
        dfs(0, nums);
        return ans;
    }
    
    public static void main(String[] args)
    {
        List<List<Integer>> list1 = new SubsetsII_90().subsetsWithDup(new int[]{1,2,2});
        System.out.println(list1);
    }
}
