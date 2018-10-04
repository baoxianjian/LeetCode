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
        //���ѵ�����Ҷ�ڵ���Ǵ�
        if(idx==str.length)
        {
            ans.add(new String(str));
            return;
        }
        //����ֱ��ֻ��һ���ڵ�
        //��ĸ�д�д��Сд�����ڵ�
        
        //���ֽڵ����ĸ�ĵ�һ������
        dfs(str, idx+1, ans); 
        
        //��ĸ��Сдת�������
        if(!Character.isLetter(str[idx])) return;
        str[idx] ^= 1<<5; //ת��
        dfs(str, idx+1, ans); //����
        str[idx] ^= 1<<5;//ת��ȥ����Ӱ��ԭʼ����
    }

    public static void main(String[] args)
    {
        List<String> list = letterCasePermutation("a1b2");
        list.forEach(s->System.out.println(s));
        
    }


}
