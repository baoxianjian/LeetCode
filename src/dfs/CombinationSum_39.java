package dfs;

import java.util.ArrayList;
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
public class CombinationSum_39 {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static int[] path = new int[100];
    public static int len = 0;
    
    
    public static void dfs(int idx, int[] candidates, int target) {
        if(target == 0) {
            List<Integer> tmp = new ArrayList<>();
            for(int i=0; i<len; i++){
                tmp.add(path[i]);
            }
            ans.add(tmp);
            return;
        }
        if(target < 0 || idx >= candidates.length) {
            return;
        }
        
        //use
        path[len] = candidates[idx];
        len++;
        dfs(idx, candidates, target - candidates[idx]);
        //not use
        len--;
        dfs(idx+1, candidates, target);
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear();
        dfs(0,candidates, target);
        return ans;
    }
    
    public static void main(String[] args)
    {
        List<List<Integer>> list = new CombinationSum_39().combinationSum(new int[]{2,3,6,7}, 7);
        System.out.println(list);
    }
}
