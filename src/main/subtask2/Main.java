package main.subtask2;

import main.util.ConsoleHelper;

public class Main {

	public static void main(String[] args) {
		if (args.length != 3) {
			ConsoleHelper.print("Three argumensts are necessary");
		} else {
			try {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				double c = Double.parseDouble(args[2]);
				Formula formula = new Formula();
				ConsoleHelper.print("The result is " + formula.calculate(a, b, c));
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be real numbers");
			}
		}
	}
}
