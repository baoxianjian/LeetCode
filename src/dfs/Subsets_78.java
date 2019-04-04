/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author xbao
 */
public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        //temp.add(1);
        dfs(res, temp, nums, 0);
        return res;
    }
    /*
    0,      (1)向下[0]
      1,    (2)向下[0,1]
         2, (3)3循环一次 [0,1,2]，结束 删除2 [0,1]  向上到1，继续执行，删除1 [0]，继续循环
      2,    (4)从1循环到2 [0,2]，删除2[0]，结束，向上到0，继续执行，删除0[]，继续循环
    1,      (5)从0循环到1 [1]，向下
      2,    (6)循环一次 [1,2]，结束，删除2 [1]，向上到1，继续执行，删除1 [0]，继续循环
    2       (7)循环到2 [2]，删除2 []，结束
//[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
//[[], [1], [1, 2], [1, 2, 3], [1, 2, 3, 3], [1, 2, 3, 3, 2], [1, 2, 3, 3, 2, 3], [1, 2, 3, 3, 2, 3, 3]]
       
    0--1--2
    |  |   
    1--2
    |2
    2
    //Loop + Recursive (row: loop,  col: recursive)
     */
    private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
        
        res.add(new ArrayList<>(temp));
        for(int i = j; i < nums.length; i++) {
            temp.add(nums[i]);  //① 加入 nums[i]
            System.out.println(i);
            dfs(res, temp, nums, i+1);  //② 递归            
            temp.remove(temp.size() - 1);  //③ 移除 nums[i]
        }
    }
    
    
    
    public static List<List<Integer>> ans = new ArrayList<>();
    public static boolean[] v = new boolean[100];
    
    public static void dfs2(int[] nums, int idx) {
        if(idx >= nums.length) {
            List<Integer> tmp = new ArrayList<>();
            for(int i=0; i<nums.length; i++) {
                if(v[i]) {
                    tmp.add(nums[i]);
                }
            }
            ans.add(tmp);
            return;
        }
        v[idx] = true;
        dfs2(nums, idx+1);
        v[idx] = false;
        dfs2(nums, idx+1);
    }
/*
(1) true
    (2) true
        (3) true  1 2 3
        (3) false 1 2   
    (2) false
        (3) true 1 3
        (3) false 1
(1) false
    (2) true
        (3) true  2 3
        (3) false 2
    (2) false
        (3) true 3
        (3) false 
*/
    
    public List<List<Integer>> subsets2(int[] nums) {
        ans.clear();
        nums = Arrays.stream(nums).sorted().toArray();
        dfs2(nums, 0);
        return ans;
    }
    
    public static void main(String[] args)
    {
        List<List<Integer>> list1 = new Subsets_78().subsets(new int[]{1,2,3});
        System.out.println(list1);
        
        List<List<Integer>> list2 = new Subsets_78().subsets2(new int[]{1,2,3});
        System.out.println(list2);
        
        
        
        
    }

}
