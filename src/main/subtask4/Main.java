package main.subtask4;

import main.util.ConsoleHelper;

public class Main {
	public static void main(String[] args) {
		if (args.length != 2) {
			ConsoleHelper.print("Two argumensts are necessary");
		} else {
			try {
				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				Area area1 = new Area(-2, 0, 2, 4);
				Area area2 = new Area(-4, -3, 4, 0);
				Point point = new Point(x, y);
				ConsoleHelper.print(point.isPointInArea(area1) || point.isPointInArea(area2));
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be integer");
			}
		}
	}
}
