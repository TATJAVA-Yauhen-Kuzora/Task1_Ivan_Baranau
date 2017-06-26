package main.subtask10;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class MatrixTest {
	private Matrix matrix;

	@BeforeMethod
	public void beforeMethod() {
		matrix = new Matrix();
	}

	@AfterMethod
	public void afterMethod() {
		matrix = null;
	}

	@Test(groups = { "methods" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask10.class)
	public void tst_methods_createMatrix(int[][] expectedArray, int k) {
		int[][] testArray = matrix.createMatrix(k);
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray.length; j++) {
				Assert.assertEquals(testArray[i][j], expectedArray[i][j]);
			}
		}
	}
}
