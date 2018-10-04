/*
 461. Hamming Distance

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
      ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */
package intger;

public class HammingDistance_461 {
    public static int hammingDistance(int x, int y) {        
        System.out.println(Integer.bitCount(2)); //10 统计1的个数:1
        System.out.println(Integer.bitCount(10));  //1010 2 
/*
1   (0 0 0 1)
4   (0 1 0 0)
异或   1   1
统计1的个数： ，2 
*/
       return Integer.bitCount(x ^ y);
    }
    public static void main(String[] args)
    {
       System.out.println(hammingDistance(1,4));
    }
}
