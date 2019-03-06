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
public class SqrtX_69 {
    public boolean guess(long x, long y) {
        return (long)x * x <= y;
    }
    
    public int mySqrt(int y) {
        long L = 0, R = (long)y+1;
        long mid = 0;
        long ans = 0;
        while(L < R) {
            mid = (L + R) / 2;
            if (guess(mid, y)) {
                ans = mid;
                L = mid+1;
            } else {
                R = mid;
            }
        }
        return (int)ans;
    }
    
    public static void main(String[] args)
    {
        System.out.println(new SqrtX_69().mySqrt(2147483647));
    }
}
