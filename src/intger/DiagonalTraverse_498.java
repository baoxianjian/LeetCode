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
public class DiagonalTraverse_498 {
    public static void main(String[] args)
    {
        //·ÅÆú
        int[][] a = new int[][]{
            {1,2},
            {3,4},
            {5,6}
        };
        
       findDiagonalOrder(a);
        
    }
    
    public static int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int a=0;a<m;)
        {
            for(int i=0; i<=a && a<n; i++)
            {
                System.out.print(matrix[a-i][i]);
            }
            System.out.println();
            a++;
            for(int j=0; j<=a && a<n; j++)
            {
                System.out.print(matrix[j][a-j]);
            }
            System.out.println();
            a++;
        }
        


//        for(int a=m-1;a<=2*m;)
//        {
//            for(int i=m-1; i>a && a<m; i++)
//            {
//                System.out.print(matrix[a-i][i]);
//            }
//            System.out.println();
//            a++;
//            for(int j=m-1; j<=a && a<m; j++)
//            {
//                System.out.print(matrix[j][a-j]);
//            }
//            System.out.println();
//            a++;
//        }
        
        
        
        return null;
    }
}
