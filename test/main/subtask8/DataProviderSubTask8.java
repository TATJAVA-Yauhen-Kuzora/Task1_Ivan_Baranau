package main.subtask8;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask8 {

	@DataProvider
	public Object[][] dp1() { //
		int[] array1 = { -1, 2, 3, 4, -5 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		return new Object[][] { new Object[] { 6, array1, 2 }, //
				new Object[] { 3, array1, 3 }, //
				new Object[] { 5, array2, 5 }, //
		};
	}
}
