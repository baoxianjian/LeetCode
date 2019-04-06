/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;

import java.util.LinkedList;
import java.util.Queue;


public class NumberofIslands_200 {
    
    private char[][] map;
    
    //BFS
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        int res = 0;
        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j] == '1')
                {
                    queue.add(new Integer[]{i,j});
                    grid[i][j] = '0';

                    res++;
                }
            }
        }
        
        while(queue.size()>0) 
        {
            Integer[] temp = queue.remove();
            int a = temp[0];
            int b= temp[1];

            if( a+1 < m && grid[a+1][b] == '1')
            {
                queue.add(new Integer[]{a+1, b});
                grid[a+1][b] = '2';
            }
            if( b+1 < n && grid[a][b+1] == '1')
            {
                queue.add(new Integer[]{a, b+1});
                grid[a][b+1] = '2';
            }
            if( a-1 >= 0 && grid[a-1][b] == '1')
            {
                queue.add(new Integer[]{a-1, b});
                grid[a-1][b] = '2';
            }
            if( b-1 >= 0 && grid[a][b-1] == '1')
            {
                queue.add(new Integer[]{a, b-1});
                grid[a][b-1] = '2';
            }
        }
        
        return res;
    }

    //DFS
    public int numIslands2(char[][] grid) {
    int cnt = 0;
    map = grid;
    for (int i=0; i<grid.length; i++){
        for (int j=0;j<grid[0].length; j++){
            if (map[i][j] == '1'){
                dfs(i, j);
                cnt++;
            }
        }
    }
    return cnt;
    }
    
    public void dfs(int x, int y){
        if (x>=0 && x<map.length && y>=0 && y<map[0].length && map[x][y]=='1'){
            map[x][y] = '2'; // mark 2 after visited
            dfs(x+1, y); // go up
            dfs(x-1, y); // go down
            dfs(x, y-1); // go left
            dfs(x, y+1); // go right
        }
    }
    

    public static void main(String[] args){
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'},
        };
        NumberofIslands_200 test = new NumberofIslands_200();
        int count = test.numIslands2(grid);
        System.out.println(count);
    }
}
