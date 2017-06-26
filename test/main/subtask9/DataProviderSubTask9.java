package main.subtask9;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask9 {

	@DataProvider
	public Object[][] dp1() { //
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 9, 9, 9 };
		int[] expectedArray1 = { 1, 9, 9, 9, 2, 3, 4, 5 };
		int[] expectedArray2 = { 1, 2, 3, 4, 5, 9, 9, 9 };
		return new Object[][] { new Object[] { expectedArray1, array1, array2, 1 }, //
				new Object[] { expectedArray2, array1, array2, 5 }, //
		};
	}
}
