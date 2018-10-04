/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author baoge
 */
public class JudgeRouteCircle_657 {
    public static void main(String args[])
    {
    }
    
    public boolean judgeCircle(String moves) {
        char[] list = moves.toCharArray();
        int x=0,y=0;
        for(int i=0; i<list.length; i++)
        {
            switch (list[i])
            {
                case 'U': y++;break;
                case 'D': y--;break;
                case 'L': x--;break;
                case 'R': x++;break;
                default: break;
            }
        }
        if(x==0 && y==0) return true;
        return false;
    }
    
}
