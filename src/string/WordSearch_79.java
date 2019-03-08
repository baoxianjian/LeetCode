package string;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xbao
 */
public class WordSearch_79 {
    private char[][] board = null;
    private String word = null;
    private int xLength = 0;
    private int yLength = 0;
    public boolean exist(char[][] board, String word) {
        if(board == null) return false;
        this.board = board;
        this.word = word;
        xLength = board.length;
        yLength = board[0].length;
        for(int x=0; x<xLength; x++) {
            for(int y=0; y<yLength; y++) {
                if(search(x, y, 0)) return true;
            }
        }
        return false;
    }
    
    
    public boolean search(int x, int y, int d) {
        if(x<0 || x>=xLength || y<0 || y>=yLength) return false; //out of boundary testing
        if(word.charAt(d) != board[x][y]) return false; //searching, euqal ?
        if(d == word.length() -1) return true; //reached last means success
        d++;
        char cur = board[x][y];
        board[x][y] = 0; //it already searched, don't search agian
        boolean found = 
            search(x-1, y, d) || //may result in searching twice
            search(x+1, y, d) ||
            search(x, y-1, d) ||
            search(x, y+1, d);
        board[x][y] = cur;
        return found;
    }
}
