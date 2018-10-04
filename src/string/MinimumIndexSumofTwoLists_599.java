package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoge
 */
public class MinimumIndexSumofTwoLists_599 {
    public static void main(String[] args)
    {
        String[] list = findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},new String[]{"KFC","Shogun","Burger King"});
        System.out.println(Arrays.toString(list));
    }
    
    //����������ͬʱ���� �� �±�֮���ǰ��(��С��)
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String, Integer>();
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<list1.length; i++)
        {
            map.put(list1[i], i);
        }
        for(int i=0; i<list2.length; i++)
        {
            if(map.containsKey(list2[i])) //�������ͬʱϲ����
            {
                int j=map.get(list2[i]);
                
                if(j+i <= minSum)  //����±�֮��С�ڵ���֮ǰ��
                {
                    //�����С��֮ǰ�� ֮ǰ�ļ�¼���
                    if(j+i<minSum){minSum=i+j;result.clear();}
                    
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
