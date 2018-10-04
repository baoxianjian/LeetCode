package string;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class LetterCasePermutation_784 {
    
    public static List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<String>();
        dfs(S.toCharArray(),0,ans);
        return ans;
    }
    
    private static void dfs(char[] str, int idx, List<String> ans)
    {
        //分裂到最后的叶节点就是答案
        if(idx==str.length)
        {
            ans.add(new String(str));
            return;
        }
        //数字直接只有一个节点
        //字母有大写和小写两个节点
        
        //数字节点或字母的第一个分裂
        dfs(str, idx+1, ans); 
        
        //字母大小写转换后分裂
        if(!Character.isLetter(str[idx])) return;
        str[idx] ^= 1<<5; //转换
        dfs(str, idx+1, ans); //分裂
        str[idx] ^= 1<<5;//转回去，不影响原始数据
    }

    public static void main(String[] args)
    {
        List<String> list = letterCasePermutation("a1b2");
        list.forEach(s->System.out.println(s));
        
    }


}
