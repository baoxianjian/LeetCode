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
public class PerfectSquares_279 {
    public int numSquares(int n) {
        if(n <= 0){return 0;}
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1; i<=n; i++) 
        {
            int temp = Integer.MAX_VALUE;
            int j = 1;
            //to use maxmine perfect squares
            while(j*j <= i)
            {
                System.out.println(i+"  "+j+"  "+temp+"  "+(dp[i-j*j]+1));
                temp = Math.min(temp, dp[i-j*j]+1);
                j++;
            }
            dp[i] = temp;
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
         System.out.println(new PerfectSquares_279().numSquares(12));
    }
}
