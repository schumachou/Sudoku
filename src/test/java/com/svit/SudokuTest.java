package com.svit;

//import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import org.junit.*;

public class SudokuTest {
	
	@Test
	// valid input
	public void testValidator1() throws Throwable{
		Sudoku sudoku = new Sudoku();
		int[][] board = {{5,3,4,6,7,8,9,1,2},
						 {6,7,2,1,9,5,3,4,8},
						 {1,9,8,3,4,2,5,6,7},
						 {8,5,9,7,6,1,4,2,3},
						 {4,2,6,8,5,3,7,9,1},
						 {7,1,3,9,2,4,8,5,6},
						 {9,6,1,5,3,7,2,8,4},
						 {2,8,7,4,1,9,6,3,5},
						 {3,4,5,2,8,6,1,7,9}};
		boolean result = sudoku.validator(board);
		assertTrue(result);
	}

	@Test
	// duplicates in row
	public void testValidator2() throws Throwable{
		Sudoku sudoku = new Sudoku();
		int[][] board = {{5,3,4,6,2,8,9,1,2},
						 {6,7,2,1,9,5,3,4,8},
						 {1,9,8,3,4,2,5,6,7},
						 {8,5,9,7,6,1,4,2,3},
						 {4,2,6,8,5,3,7,9,1},
						 {7,1,3,9,7,4,8,5,6},
						 {9,6,1,5,3,7,2,8,4},
						 {2,8,7,4,1,9,6,3,5},
						 {3,4,5,2,8,6,1,7,9}};
		boolean result = sudoku.validator(board);
		assertTrue(result);
	}
	
	@Test
	// duplicates in column
	public void testValidator3() throws Throwable{
		Sudoku sudoku = new Sudoku();
		int[][] board = {{5,3,4,6,7,8,9,1,2},
						 {6,7,2,1,9,5,3,4,8},
						 {1,9,8,3,4,2,5,6,7},
						 {8,5,9,7,6,1,4,2,3},
						 {5,2,6,8,7,3,7,9,1},
						 {7,1,3,9,2,4,8,5,6},
						 {9,6,1,5,3,7,2,8,4},
						 {2,8,7,4,1,9,6,3,5},
						 {3,4,5,2,8,6,1,7,9}};
		boolean result = sudoku.validator(board);
		assertTrue(result);
	}
	
	@Test
	// duplicates in sub-grid
	public void testValidator4() throws Throwable{
		Sudoku sudoku = new Sudoku();
		int[][] board = {{5,3,4,6,7,8,9,1,2},
						 {6,7,2,1,9,5,3,4,8},
						 {1,9,6,3,4,2,5,8,7},
						 {8,5,9,7,6,1,4,2,3},
						 {5,2,6,8,7,3,7,9,1},
						 {7,1,3,9,2,4,8,5,6},
						 {9,6,1,5,3,7,2,8,4},
						 {2,8,7,4,1,9,6,3,5},
						 {3,4,5,2,8,6,1,7,9}};
		boolean result = sudoku.validator(board);
		assertTrue(result);
	}
}
