package main.subtask5;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask5 {

	@DataProvider
	public Object[][] dp1() { //
		double[] array1 = { -2, 2, 3, 1 };
		double[] array2 = { 16, 4, 9, 1 };
		double[] array3 = { 0, -2, 3, 1 };
		double[] array4 = { 0, 16, 9, 1 };
		return new Object[][] { new Object[] { array2, array1 }, //
				new Object[] { array2, array1 }, //
				new Object[] { array4, array3 }, //
		};
	}

	@DataProvider
	public Object[][] dp2() { //
		String[] array1 = { "3", "2", "3", "1" };
		double[] array2 = { 3, 2, 3, 1 };
		String[] array3 = { "16.01", "0", "9", "1" };
		double[] array4 = { 16.01, 0, 9, 1 };
		return new Object[][] { new Object[] { array2, array1 }, //
				new Object[] { array4, array3 }, //
		};
	}
}
