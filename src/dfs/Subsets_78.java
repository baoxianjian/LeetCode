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
public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        //temp.add(1);
        dfs(res, temp, nums, 0);
        return res;
    }
    /*
    0,      向下[0]
      1,    向下[0,1]
         2, 循环一次 [0,1,2]，结束 删除2 [0,1]  向上到1，继续执行，删除1 [0]，继续循环
      2,    从1循环到2 [0,2]，删除2[0]，结束，向上到0，继续执行，删除0[]，继续循环
    1,      从0循环到1 [1]，向下
      2,    循环一次 [1,2]，结束，删除2 [1]，向上到1，继续执行，删除1 [0]，继续循环
    2       循环到2 [2]，删除2 []，结束
    
    0--1--2
    |  |   
    1  2
    |
    2
    //Loop + Recursive (row: loop,  col: recursive)
     */
    private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
        
        res.add(new ArrayList<>(temp));
        for(int i = j; i < nums.length; i++) {
            temp.add(nums[i]);  //① 加入 nums[i]
            System.out.println(i);
            dfs(res, temp, nums, i+1);  //② 递归            
            //temp.remove(temp.size() - 1);  //③ 移除 nums[i]
        }
    }
    
    public static void main(String[] args)
    {
        List<List<Integer>> list = new Subsets_78().subsets(new int[]{1,2,3});
        System.out.println(list);
    }

}
