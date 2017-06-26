package main.subtask10;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask10 {
	@DataProvider
	public Object[][] dp1() { //
		int[][] expectedArray1 = { { 1, 2, 3, 4 }, { 4, 3, 2, 1 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 } };
		return new Object[][] { new Object[] { expectedArray1, 4 }, //
		};
	}
}
