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
public class Combinations_77 {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static int[] path = new int[100];
    public static int K = 0;
    
    public static void dfs(int idx, int n, int k){
        //限制在第k（2）层
        if(k == 0){
            List<Integer> tmp = new ArrayList<>();
            //执行两次，把上个level中的值和现在lelvel中的值加入tmp
            for(int i=0; i<K; i++) {
               tmp.add(path[i]);
            }
            ans.add(tmp);
            return;
        } 
        
        for(int i=idx; i<=n; i++){
            path[k-1] = i;
            dfs(i+1, n, k-1);
        }
    }
//(int idx, int n, int k) path[current level]
//    (1, 4, 1) 1
//        (2, 4, 0) 2
//        (3, 4, 0) 3
//        (4, 4, 0) 4
//    (2, 4, 1) 2
//        (3, 4, 0) 3
//        (4, 4, 0) 4
//    (3, 4, 1) 3
//        (4, 4, 0) 4
//    (4, 4, 1) 4
        
    
    
    
    public List<List<Integer>> combine(int n, int k) {
        ans.clear();
        K = k;
        dfs(1, n, k);
        return ans;
    }
    
    public static void main(String[] args)
    {
        List<List<Integer>> list = new Combinations_77().combine(4, 2);
        System.out.println(list);
    }
}
