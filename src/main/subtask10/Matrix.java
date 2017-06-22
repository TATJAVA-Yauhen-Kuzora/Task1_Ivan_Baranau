package main.subtask10;

import main.util.ConsoleHelper;

public class Matrix {
	
	public int[][] createMatrix(int size) {
		if (size < 0 || size % 2 != 0) {
			ConsoleHelper.print("Size should be even number and more than 0"); System.exit(0);
		} else {
			int[][] matrix = new int[size][size];
			for (int i = 0; i < matrix.length; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < matrix[i].length; j++) {
						matrix[i][j] = j + 1;
					}
				} else {
					for (int j = 0; j < matrix[i].length; j++) {
						matrix[i][j] = matrix[i].length - j;
					}
				}
			}
			return matrix;
		}
		return null;
		
	}
}
