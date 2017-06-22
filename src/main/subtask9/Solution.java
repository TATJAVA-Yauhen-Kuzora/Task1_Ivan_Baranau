package main.subtask9;

import java.util.Arrays;

import main.util.ArrayUtil;
import main.util.ConsoleHelper;

public class Solution {
	public void start(String[] args) {
		if (args.length != 3) {
			ConsoleHelper.print("Three argumensts are necessary");
		} else {
			try {
				int size1 = Integer.parseInt(args[0]);
				int size2 = Integer.parseInt(args[1]);
				int pos = Integer.parseInt(args[2]);
				if (size1 == size2 || pos < 0 || pos > size1) {
					ConsoleHelper.print(
							"Array sizes should be diffrent, position should be more than 0 and less than first array size");
					System.exit(0);
				}
				int[] arr1 = ArrayUtil.createArrayWithNaturalNumber(size1);
				int[] arr2 = ArrayUtil.createArrayWithNaturalNumber(size2);
				ConsoleHelper.print(Arrays.toString(arr1));
				ConsoleHelper.print(Arrays.toString(arr2));
				ConsoleHelper.print(Arrays.toString(new Merger().mergeArrayFromPosition(arr1, arr2, pos)));
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be integer");
			}
		}
	}
}
