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
				CoordinatePlane plane=new CoordinatePlane();
				plane.addStatedArea(new Area(-2, 0, 2, 4));
				plane.addStatedArea(new Area(-4, -3, 4, 0));
				Point point = new Point(x, y);
				ConsoleHelper.print(plane.checkPointOnPlane(point));
			} catch (NumberFormatException e) {
				ConsoleHelper.print("All arguments should be integer");
			}
		}
	}
}
