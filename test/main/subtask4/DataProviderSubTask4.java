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
	public Object[][] dp2() { // boolean expected, int x, int y, Area area;
		Area area = new Area(-2, 0, 2, 4); // right inputed Area();
		Area wrongArea = new Area(5, 5, 0, 0); // wrong inputed Area();
		return new Object[][] { new Object[] { true, 1, 1, area }, //
				new Object[] { true, -2, 0, area }, //
				new Object[] { false, 5, 5, area }, //
				new Object[] { false, 10, 10, area }, //
				new Object[] { true, 2, 2, wrongArea }, //
		};
	}
}
