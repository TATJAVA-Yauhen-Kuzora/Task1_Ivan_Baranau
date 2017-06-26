package main.subtask8;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NaturalNumberArrayTest {
	private NaturalNumberArray array;

	@BeforeMethod(groups = { "methods", "exceptions", "constructors" })
	public void beforeMethod() {
	}

	@AfterMethod(groups = { "methods", "exceptions", "constructors" })
	public void afterMethod() {
		array = null;
	}

	@Test(groups = { "methods", "constructors" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask8.class)
	public void tst_methods_mergeArrayFromPosition(int expectedSum, int[] intArray, int k) {
		array = new NaturalNumberArray(intArray);
		Assert.assertEquals(array.calculateSum(k), expectedSum);
	}
}
