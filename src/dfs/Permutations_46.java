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
        //��λ��ѭ�������һ��
        if (idx >= nums.length) {
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i=0; i<nums.length; i++) {
                tmp.add(nums[path[i]]);
            }
            ans.add(tmp);
            return;
        }
        for(int i=0; i<nums.length; i++) {
            //�൱��i������j������k���������㣩
            if(v[i] == false){
                path[idx] = i; //��¼ÿһ���ֵ
                //����һ���ù����ڶ���Ͳ���ʹ��
                v[i] = true;
                robot(idx+1, nums);
                //ֻ���㼶����ȣ��й�ϵ���´�ѭ����Ȼ����
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
