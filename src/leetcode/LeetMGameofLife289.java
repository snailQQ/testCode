package leetcode;

//Game of Life My Submissions Question Solution 
//Total Accepted: 2431 Total Submissions: 7680 Difficulty: Medium
//According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
//
//Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
//
//Any live cell with fewer than two live neighbors dies, as if caused by under-population.
//Any live cell with two or three live neighbors lives on to the next generation.
//Any live cell with more than three live neighbors dies, as if by over-population..
//Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
//Write a function to compute the next state (after one update) of the board given its current state.
//
//Follow up: 
//Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
//In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
//Credits:
//Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
//
//Hide Tags Array
//Hide Similar Problems (M) Set Matrix Zeroes

//https://leetcode.com/problems/game-of-life/

//solution
//http://bookshadow.com/weblog/2015/10/04/leetcode-game-life/
//http://blog.csdn.net/xudli/article/details/48896549

public class LeetMGameofLife289 {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) {
        	return;
        }
        
        int row = board.length;
        int col = board[0].length;
        
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < col; j++) {
        		int liveCells = getLiveCells(board, i, j);
        		if(board[i][j] == 0) {
        			if(liveCells == 3) {
        				board[i][j] += 10;
        			}
        		} else {
        			if(liveCells == 2 || liveCells == 3) {
        				board[i][j] += 10;
        			}
        		}
        	}
        }
        
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < col; j++) {
        		board[i][j] /= 10;
        	}
        }
    }
    
    private int getLiveCells(int[][] board, int row, int col) {
    	int liveCells = 0;
    	for(int i = row-1; i <= row+1; i++) {
    		for(int j = col-1; j <= col+1; j++) {
    			if(i<0 || j<0 || i > board.length-1 || j > board[0].length-1 || (i == row && j == col)) {
    				continue;
    			}
    			if(board[i][j] % 10 == 1) {
    				liveCells++;
    			}
    		}
    	}
    	return liveCells;
    }
}
