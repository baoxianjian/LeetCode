/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author baoge
 */
public class QueueReconstructionbyHeight_406 {
    
    public static void main(String[] args)
    {
        
        int[][] people = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        people=reconstructQueue(people);
        
        for(int i=0;i<people.length;i++)
        {
            System.out.print("["+people[i][0]+","+people[i][1]+"],");
        }
    }
    
    public static int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0)
            return new int[0][0];
        
        //身高越高的人 比他高的人就越少
        //所以按身高倒序 再按前面比他高的人数正序
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[0] == a[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });
        
        //人队列已经排好序, 放到合适的位置
//        for(int i=0;i<people.length;i++)
//        {
//            System.out.println("["+people[i][0]+","+people[i][1]+"]");
//        }        
        
        int n = people.length;
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            //System.out.println(people[i][1]+" ["+people[i][0]+","+people[i][1]+"]");
            tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});
        }
        int[][] res = new int[people.length][2];
        int i = 0;
        for (int[] k : tmp) {
            res[i][0] = k[0];
            res[i++][1] = k[1];
        }
        
        return res;
    }
    

}
