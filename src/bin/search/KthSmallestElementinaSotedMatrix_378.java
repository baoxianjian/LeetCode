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
public class KthSmallestElementinaSotedMatrix_378 {
    public boolean guess(int g, int[][] matrix, int k, int n){
        int sum1 = 0;
        for (int i = 0; i<n; i++) {
            //find kth
            //guess idx from 0 to length-1
            int L = 0, R = n - 1;
            int ans = -1;
            while (L <= R) {
                int mid = (L + R) / 2;
                if(matrix[i][mid] < g){
                    ans = mid;
                    L = mid + 1;
                } else {
                    R = mid -1;
                } 
            }
            sum1 += (ans+1);
        }
        //kth start at 1
        //sum1 of index start at 0
        return sum1 <= k-1; //does't reach to kth
    }
    
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        //smallest element in the matrix
        //guess number ranges from matrix[0][0] to matrix[n-1][n-1]
        int R = matrix[n-1][n-1];
        int L = matrix[0][0];
        int ans = 0;
        while (L <= R) {
            int mid = (L + R) / 2;
            //does mid in kth?
            if(guess(mid, matrix, k, n)){
                ans = mid;
                L = mid + 1;
            } else {
                R = mid -1;
            } 
        }
        return ans;
    }
    
    public static void main(String[] args)
    {
        System.out.println(new KthSmallestElementinaSotedMatrix_378().kthSmallest(
                new int[][]{
                    { 1,  5,  9},
                    {10, 11, 13},
                    {12, 13, 15}
                }, 8)
        );
    }
}
