package main.subtask4;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PointTest {
	private Point point;

	@AfterMethod(groups = { "constructors" })
	public void afterMethod() {
		point = null;
	}

	@Test(groups = { "constructors" }, dataProvider = "dp2", dataProviderClass = DataProviderSubTask4.class)
	public void tst_constructor_Point(int x, int y) {
		point = new Point(x, y);
		Assert.assertEquals(point.getX(), x);
		Assert.assertEquals(point.getY(), y);
	}
}
