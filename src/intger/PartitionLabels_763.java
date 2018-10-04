package intger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *字符串分区
 * 每个字符都在自己的分区中，不会出现在其他分区里
 * 那么，每个字符串的最后出现一个地址，就是分区的点
 * 每个字符都有分区地址，以他们最大的那个为准
 * 即前面字符的分区点都没有这个大时，就以这个为分区点
 * @author baoge
 */
public class PartitionLabels_763 {
    public static List<Integer> partitionLabels(String S) {
        int lastIndex[] = new int[128];
        for(int i =0; i<S.length(); i++)
            lastIndex[S.charAt(i)]=i;

//         for(int i =97; i<lastIndex.length; i++)
//             System.out.print((char)i+":"+lastIndex[i]+" ");
//         
//         
         List<Integer> ans = new ArrayList<Integer>();   
         int start=0;
         int end=0;
         for(int i=0; i<S.length(); i++)
         {
             //"ababcbacadefegdehijhklij"
             end = Math.max(end, lastIndex[S.charAt(i)]);
             if(i == end)
             {
                 ans.add(end-start+1);
                 start = end+1;
             }
         }
         return ans;
    }
    
    public static void main(String[] args)
    {
        List<Integer> list = partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(list);
    }
}
