package main.subtask2;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FormulaTest {
	private Formula formula;

	@BeforeMethod
	public void beforeMethod() {
		formula = new Formula();
	}

	@AfterMethod
	public void afterMethod() {
		formula = null;
	}

	@Test(groups = { "methods" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask2.class)
	public void tst_method_calculate(double expected, double a, double b, double c) {
		Assert.assertEquals(formula.calculate(a, b, c), expected);
	}
}
