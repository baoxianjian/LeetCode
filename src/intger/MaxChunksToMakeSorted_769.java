/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

/**
 *
 * @author baoge
 */
public class MaxChunksToMakeSorted_769 {
    public int maxChunksToSorted(int[] arr) {
        int max=0;
        int ans=0;
        for(int i=0; i<arr.length; i++)
        {
            max = Math.max(arr[i],max);
            //������λ�õ������ֵʱ����˵��֮ǰ�Ŀ�����Ϊһ������
            if(i==max) ans++;
        }
        return ans;
    }
}
