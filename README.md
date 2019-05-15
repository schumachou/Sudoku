The method implementation is located in src/main/java/com/svit/Sudoku.java

The test class is located in in src/test/java/com/svit/SudokuTest.java

According to the requirements mentioned in mail, we assume 
	1. the board was filled out
	2. all the numbers are between 1 and 9
So we only check for the validity of the board that was filled out.

There are four test cases:
	1. the first one is the only valid board
	2. the second one has duplicates on first row
	3. the third one has duplicates on first column
	4. the last one has duplicates in sub-grid

To run the JUnit test with maven, just using the command below:
	mvn test

It should show the result like:
	Tests run: 4, Failures: 3, Errors: 0, Skipped: 0
