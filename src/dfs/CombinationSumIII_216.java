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
public class CombinationSumIII_216 {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static int[] path = new int[100];
    public static int K = 0;
    public static int maxCount = 0;
    
    public void dfs(int idx, int k, int n) {
        if(k==0) {
            List<Integer> tmp = new ArrayList<>();
            int sum = 0;
            for(int i=0; i<K; i++){
                tmp.add(path[i]);
                sum += path[i];
            }
            if(sum == n) {
                ans.add(tmp);
            }
            return;
        }
        
        for(int i=idx; i<=maxCount; i++) {
            path[k-1] = i;
            dfs(i+1, k-1, n);
        }
    }
    
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans.clear();
        K = k;
        maxCount = Math.min(n, 9);
        dfs(1, k, n);
        return ans;
    }
    
    
    public static void main(String[] args)
    {
        List<List<Integer>> list = new CombinationSumIII_216().combinationSum3(9, 45);
        System.out.println(list);
        
        List<List<Integer>> list2 = new CombinationSumIII_216().combinationSum3(3, 9);
        System.out.println(list2);
    }
}
