package com.svit;

import java.util.Arrays;

public class Sudoku {
	
	public boolean validator(int[][] board) {
		boolean[] isVisited = new boolean[9];
		
		// validating each column
        for(int i = 0; i < 9; i++){
            Arrays.fill(isVisited, false);
            for(int j = 0; j < 9; j++){
            	int num = board[i][j];
                if(isVisited[num - 1]){
                    return false;
                }
                isVisited[num - 1] = true;
            }
        }
        
        // validating each row
        for(int j = 0; j < 9; j++){
            Arrays.fill(isVisited, false);
            for(int i = 0; i < 9; i++){
            	int num = board[i][j];
                if(isVisited[num - 1]){
                    return false;
                }
                isVisited[num - 1] = true;
            }
        }
        
        // validating each sub-grid
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                Arrays.fill(isVisited, false);
                for(int k = 0; k < 9; k++){
                	int num = board[i + k / 3][j + k % 3];
                    if(isVisited[num - 1]){
                        return false;
                    }
                    isVisited[num - 1] = true;
                }
            }
        }
        
        return true;
	}
}
