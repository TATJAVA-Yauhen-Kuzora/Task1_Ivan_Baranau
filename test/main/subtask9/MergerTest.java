package main.subtask9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class MergerTest {
	private Merger merger;

	@BeforeMethod(groups = { "methods", "exceptions", "constructors" })
	public void beforeMethod() {
		merger = new Merger();
	}

	@AfterMethod(groups = { "methods", "exceptions", "constructors" })
	public void afterMethod() {
		merger = null;
	}

	@Test(groups = { "methods" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask9.class)
	public void tst_methods_mergeArrayFromPosition(int[] expectedArray, int[] array1, int[] array2, int position) {
		int testArray[] = merger.mergeArrayFromPosition(array1, array2, position);
		for (int i = 0; i < testArray.length; i++) {
			Assert.assertEquals(testArray[i], expectedArray[i]);
		}
	}
}
