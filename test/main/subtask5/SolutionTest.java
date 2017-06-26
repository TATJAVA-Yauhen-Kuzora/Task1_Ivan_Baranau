package main.subtask5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SolutionTest {
	private Solution solut;

	@BeforeMethod(groups = { "methods" })
	public void beforeMethod() {
		solut = new Solution();
	}

	@AfterMethod(groups = { "methods" })
	public void afterMethod() {
		solut = null;
	}

	@Test(groups = { "methods" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask5.class)
	public void tst_method_powerNumber(double[] arrayAfter, double[] arrayBefore) {
		double testArrayAfter[] = solut.powerNumber(arrayBefore);
		for (int i = 0; i < testArrayAfter.length; i++) {
			Assert.assertTrue(arrayAfter[i] == testArrayAfter[i]);
		}
	}

	@Test(groups = { "methods" }, dataProvider = "dp2", dataProviderClass = DataProviderSubTask5.class)
	public void tst_methods_changeStringToDoubleArray(double[] excpected, String[] args) {
		double testArrayAfter[] = solut.changeStringToDoubleArray(args);
		for (int i = 0; i < testArrayAfter.length; i++) {
			Assert.assertTrue(excpected[i] == testArrayAfter[i]);
		}
	}
}
