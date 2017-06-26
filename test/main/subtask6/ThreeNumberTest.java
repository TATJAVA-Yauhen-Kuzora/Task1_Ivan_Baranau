package main.subtask6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ThreeNumberTest {
	private ThreeNumber threeNumber;

	@BeforeMethod(groups = { "methods", "exceptions", "constructors" })
	public void beforeMethod() {
	}

	@AfterMethod(groups = { "methods", "exceptions", "constructors" })
	public void afterMethod() {
		threeNumber = null;
	}

	@Test(groups = { "methods", "constructors" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask6.class)
	public void tst_calcSumOfMixAndMax(double expected, double a, double b, double c) {
		threeNumber = new ThreeNumber(a, b, c);
		Assert.assertEquals(threeNumber.calcSumOfMixAndMax(), expected);
	}
}
