package main.subtask2;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask2 {

	@DataProvider
	public Object[][] dp1() { // positive tests
		return new Object[][] { new Object[] { 1.618033988749895, 1, 1, 1 }, //
				new Object[] { 1, 1, 1, 2 }, //
				new Object[] { Double.NaN, 0, -1, 1 }, // negative tests
				new Object[] { Double.POSITIVE_INFINITY, 0, 1, 1 }, //
				new Object[] { Double.NaN, 0, 0, 0 } //
		};
	}
}
