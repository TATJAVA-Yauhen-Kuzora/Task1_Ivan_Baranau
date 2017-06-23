package main.subtask1;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NumberExaminerTest {
	private NumberExaminer exam;

	@BeforeMethod
	public void beforeMethod() {
		exam = new NumberExaminer();
	}

	@Test(groups = { "methods" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask1.class)
	public void tst_method_isTwoFirstTwoLast(boolean expected, String number) {
		Assert.assertEquals(exam.isTwoFirstTwoLast(number), expected);
	}

	@Test(groups = {
			"exceptions" }, dataProvider = "dp2", dataProviderClass = DataProviderSubTask1.class, expectedExceptions = IllegalArgumentException.class)
	public void tst_exception_isTwoFirstTwoLast(String number) {
		exam.isTwoFirstTwoLast(number);
	}

	@AfterMethod
	public void afterMethod() {
		exam = null;
	}
}
