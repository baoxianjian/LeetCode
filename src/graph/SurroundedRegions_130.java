/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intger;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 Search all elements with 'O' on the boundary, and replace all elements to 'V' who are adjacent them. The rest 'O's are X, and all the 'V's are 'O'.
 在边缘上找缺口‘O’，沿着缺口找所有的邻接的‘O’，把他们设个标记，然后剩下的（非外层缺口邻接的）就是里面的（O直接换成X即可）。外层搞定了，内层就好搞了。
 */
public class SurroundedRegions_130 {
    public void solve(char[][] board) {
        if(board == null) return;
        int m = board.length;
        if(m == 0) return;
        int n = board[0].length;
        
        Queue<Integer[]> queue = new LinkedList<>();
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if((i==0 || j==0 || i== m-1 || j==n-1) && board[i][j]=='O')
                {
                    queue.add(new Integer[]{i, j});
                }
            }   
        }
        
        while(queue.size()>0)
        {
            Integer[] temp = queue.remove();
            int x = temp[0];
            int y = temp[1];
            board[x][y] = 'V';
            
            if(x-1>=0 && board[x-1][y] == 'O')
                queue.add(new Integer[]{x-1, y});
            if(x+1<m && board[x+1][y] == 'O')
                queue.add(new Integer[]{x+1, y});
            if(y-1>=0 && board[x][y-1] == 'O')
                queue.add(new Integer[]{x, y-1});
            if(y+1<n && board[x][y+1] == 'O')
                queue.add(new Integer[]{x, y+1});            
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(board[i][j] == 'O') 
                    board[i][j] = 'X';
                if(board[i][j] == 'V') 
                    board[i][j] = 'O';
            }
        }
    }
    
    public static void main(String[] args)
    {
        SurroundedRegions_130 test = new SurroundedRegions_130();
        char[][] board = new char[][]{
            {'X', 'X', 'X','X'},
            {'X', 'O', 'O','X'},
            {'X', 'X', 'O','X'},
            {'X', 'O', 'X','X'},
        };
        test.solve(board);
        Arrays.asList(board).forEach(System.out::println);
    }
}
