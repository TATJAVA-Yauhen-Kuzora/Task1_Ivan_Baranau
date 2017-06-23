package main.subtask3;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask3 {

	@DataProvider
	public Object[][] dp1() { //
		return new Object[][] { new Object[] { 0.5, 1.0, 1.0 }, //
				new Object[] { 2.0, 2.0, 2.0 }, //
				new Object[] { Double.POSITIVE_INFINITY, Double.MAX_VALUE, Double.MAX_VALUE }, //
				new Object[] { 0.5, 1, 1 }, //
				new Object[] { 0.0000, Double.MIN_VALUE, Double.MIN_VALUE }, //
		};
	}

	@DataProvider
	public Object[][] dp2() { //
		return new Object[][] { new Object[] { Double.POSITIVE_INFINITY, 1.0 }, //
				new Object[] { 1.0, Double.POSITIVE_INFINITY }, //
				new Object[] { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY }, //
				new Object[] { Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY }, //
				new Object[] { Double.NaN, 1.0 }, //
				new Object[] { 1.0, Double.NaN }, //
				new Object[] { Double.NaN, Double.NaN }, //
				new Object[] { -4.0, -5.0 }, //
				new Object[] { -Double.MIN_VALUE, Double.MIN_VALUE }, //
				new Object[] { Double.MAX_VALUE, -Double.MAX_VALUE }, //
		};
	}
}
