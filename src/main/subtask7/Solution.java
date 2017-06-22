package main.subtask7;

import main.util.ConsoleHelper;

public class Solution {
	public void start(String[] args) {
		if (args.length != 3) {
			ConsoleHelper.print("Three argumensts are necessary");
		} else {
			try {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				double dx = Double.parseDouble(args[2]);
				if (a > b || dx > (b - a) || dx < 0) {
					ConsoleHelper.print("All arguments should be real numbers"); System.exit(0);
				}
				else{
					ConsoleHelper.print(new Calculator().calculateFunction(a,b,dx));
				}
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be real numbers");
			}

		}
	}
}
