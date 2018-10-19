package intger;

/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
For example,
Given nums = [0, 1, 3] return 2.

����棺0,1.2.4,5����Ψһ ����3��
�Ͳ�һ����

 */

/**
 *
 * @author baoge
 */
public class MissingNumber_268 {
    public static void main(String[] args)
    {
        System.out.println(missingNumber(new int[]{0,1,2,4}));
    }
    public static int missingNumber(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        
        int num1=0,num2=0;
        int i=0;
        for(i=0; i<nums.length; i++)
        {
            num1+=i;
            num2+=nums[i];
        }
        return num1+i-num2;
    }
}
