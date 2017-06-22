package main.subtask5;

import main.util.ConsoleHelper;

public class Solution {
	public double[] powerNumber(double[] array) {
		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				result[i] = Math.pow(array[i], 2);
			} else if (array[i] < 0) {
				result[i] = Math.pow(array[i], 4);
			} else {
				result[i] = array[i];
			}
		}
		return result;
	}

	public double[] changeStringToDoubleArray(String[] args) {
		double[] result = new double[args.length];
		for (int i = 0; i < result.length; i++) {
			try {
				result[i] = Double.parseDouble(args[i]);
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be real numbers");
			}
		}
		return result;
	}
}
