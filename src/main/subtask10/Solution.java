package main.subtask10;

import main.util.ConsoleHelper;

public class Solution {
	public void start(String[] args) {
		if (args.length != 1) {
			ConsoleHelper.print("One argument is necessary");
		} else {
			try {
				int size = Integer.parseInt(args[0]);
				int[][] matrix = new Matrix().createMatrix(size);
				ConsoleHelper.print(matrix);
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be integer");
			}
		}
	}
}
