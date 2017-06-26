package main.subtask6;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask6 {

	@DataProvider
	public Object[][] dp1() { //
		return new Object[][] { new Object[] { 2, 1, 1, 1 }, //
				new Object[] { 0, -100, 100, 0 }, //
				new Object[] { 5, 5.5, -0.5, 0 }, //
		};
	}
}
