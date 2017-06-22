package main.util;

import java.util.Map;

public class ConsoleHelper {
	public static void print(String message) {
		System.out.println(message);
	}

	public static void print(boolean message) {
		System.out.println(message);
	}

	public static void print(Map<Double, Double> map) {
		for (Map.Entry<Double, Double> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();

		}
	}
}
