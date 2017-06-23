package main.subtask4;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PointTest {
	private Point point;

	@AfterMethod(groups = { "methods", "exceptions", "constructors" })
	public void afterMethod() {
		point = null;
	}

	@Test(groups = { "constructors", "methods" }, dataProvider = "dp2", dataProviderClass = DataProviderSubTask4.class)
	public void tst_constructor_Point(boolean expected, int x, int y, Area area) {
		point = new Point(x, y);
		Assert.assertEquals(point.isPointInArea(area), expected);
	}
}
