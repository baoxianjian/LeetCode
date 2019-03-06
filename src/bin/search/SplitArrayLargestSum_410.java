package bin.search;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xbao
 */
public class SplitArrayLargestSum_410 {
    
//    public boolean guess(long mid, int[] nums, int m) {
//        long sum = 0;
//        long mm = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if ( sum + nums[i] > mid) {
//                mm++;
//                sum = nums[i];
//                if (nums[i] > mid) {
//                    return false;
//                }
//            } else {
//                sum += nums[i];
//            }
//        }
//        return mm <= m;
//    }
//    
//    public int splitArray(int[] nums, int m) {
//        long n = nums.length;
//        long R = 1; //largest sum
//        for (int i = 0; i<n; i++) {
//            R += nums[i];
//        }
//        long L = 0;
//        long mid = 0;
//        long ans = 0;
//        while(L < R) {
//            mid = (L + R) / 2;
//            if (guess(mid, nums, m)) {
//                ans = mid;
//                R = mid;
//            } else {
//                L = mid+1;
//            }
//        }
//        return (int)ans;   
//    }
    
    public boolean guess(long max, int[] nums, int m, int length) {
        int mm = 1;
        long sum=0;
        for (int i=0; i<length; i++) {
            if (sum+nums[i] <= max) {
                sum += nums[i];
            } else {
                mm++;
                sum = nums[i];
                if (nums[i] > max) {
                    return false;
                }
            }
        }
        return mm<=m;
    }
        
    public int splitArray(int[] nums, int m) {
        long L = 0;
        long R = 1;
        int length = nums.length;
        //the ans possibly ranges from 0 to sum(nums)
        for (int i=0; i<length; i++) {
            R += nums[i];
        }
        long mid = 0, ans = 0;
        while(L < R) {
            mid = (L + R) / 2;
            //in m subarrays, find sum <= mid
            if(guess(mid, nums, m, length)) {
                //mid can be lower
                ans = mid;
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return (int)ans;
    }
        
        
    
    public static void main(String[] args)
    {
        //System.out.println(new SplitArrayLargestSum_410().guess(16, new int[]{7,2,5,10,8}, 2, 5));
        System.out.println(new SplitArrayLargestSum_410().splitArray(new int[]{7,2,5,10,8}, 2));
    }
}
