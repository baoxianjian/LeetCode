package dp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xbao
 */
public class MinimumASCIIDeleteSumforTwoStrings_712 {
    private int[][] temp = null;
    public int minimumDeleteSum(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        //record distance, idx start from 1, 0 means null
        temp = new int[l1+1][l2+1];
        for(int i=0; i<=l1; i++) {
            for(int j=0; j<=l2; j++) {
                temp[i][j] = Integer.MAX_VALUE;
            }
        }
        return dp(s1, l1, s2, l2);
    }
    
    public int dp(String s1, int i, String s2, int j) {
        if(i == 0 && j == 0) return 0;
        //no repeat to calculate
        if(temp[i][j] != Integer.MAX_VALUE) return temp[i][j];
        //s2.charAt(j-1) is jth char of s2
        if(i==0) return temp[i][j] = dp(s1, i, s2, j-1) + s2.charAt(j-1);
        if(j==0) return temp[i][j] = dp(s1, i-1, s2, j) + s1.charAt(i-1);
        //String id start from 0
        if(s1.charAt(i - 1) == s2.charAt(j - 1)) return temp[i][j] = dp(s1, i-1, s2, j-1);
        return temp[i][j] = Math.min(
                dp(s1, i-1, s2, j)+s1.charAt(i-1),
                dp(s1, i, s2, j-1)+s2.charAt(j-1)
        );
    }
    
    public static void main(String[] args) {
        int distance = new MinimumASCIIDeleteSumforTwoStrings_712().minimumDeleteSum("sea", "eat");
        System.out.println(distance);
    }
}
