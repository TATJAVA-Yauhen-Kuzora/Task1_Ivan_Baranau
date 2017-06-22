package main.subtask1;

import main.util.ConsoleHelper;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			ConsoleHelper.print("One argument is necessary");
		} else {
			try {
				NumberExaminer number = new NumberExaminer();
				ConsoleHelper.print(number.isTwoFirstTwoLast(args[0]));
			} catch (IllegalArgumentException e) {
				ConsoleHelper.print(e.getMessage());
			}
		}
	}
}
