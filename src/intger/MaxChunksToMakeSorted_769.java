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
            //当索引位置等于最大值时，就说明之前的可以作为一块排序
            if(i==max) ans++;
        }
        return ans;
    }
}
