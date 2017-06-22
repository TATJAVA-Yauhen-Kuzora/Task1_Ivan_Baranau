package main.subtask6;

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
				ThreeNumber tn = new ThreeNumber(a, b, c);
				ConsoleHelper.print("The sum of min and max number is "+tn.calcSumOfMixAndMax());
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be real numbers");
			}
		}
	}
}
