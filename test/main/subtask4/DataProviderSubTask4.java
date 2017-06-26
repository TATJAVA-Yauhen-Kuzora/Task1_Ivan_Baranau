package main.subtask4;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask4 {

	@DataProvider
	public Object[][] dp1() { //
		return new Object[][] { new Object[] { -2, 0, 2, 4 }, //
				new Object[] { -4, -3, 4, 0 }, //
				new Object[] { 5, 5, 0, 0 }, //
		};
	}

	@DataProvider
	public Object[][] dp2() { //
		return new Object[][] { new Object[] { 1, 1 }, //
				new Object[] { -2, 0 }, //
				new Object[] { 5, 5 }, //
				new Object[] { 10, 10 }, //
				new Object[] { 2, 2 }, //
		};
	}

	@DataProvider
	public Object[][] dp3() { //
		Area rightArea = new Area(-2, 0, 2, 4);
		Area wrongArea = new Area(5, 5, 0, 0);
		Point goodPoint = new Point(2, 2);
		Point badPoint = new Point(10, 10);
		return new Object[][] { new Object[] { true, rightArea, goodPoint }, //
				new Object[] { false, rightArea, badPoint }, //
				new Object[] { true, wrongArea, goodPoint }, //
				new Object[] { false, wrongArea, badPoint }, //
		};
	}

	@DataProvider
	public Object[][] dp4() { //
		Point goodPoint = new Point(2, 2);
		Point badPoint = new Point(10, 10);
		return new Object[][] { new Object[] { -2, 0, 2, 4, true, goodPoint }, //
				new Object[] { -2, 0, 2, 4, false, badPoint }, //
				new Object[] { 5, 5, 0, 0, true, goodPoint }, //
				new Object[] { 5, 5, 0, 0, false, badPoint }, //
		};
	}
}
