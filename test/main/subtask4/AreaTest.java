package main.subtask4;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AreaTest {
	private Area area;

	@AfterMethod(groups = { "methods", "exceptions", "constructors" })
	public void afterMethod() {
		area = null;
	}

	@Test(groups = { "constructors" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask4.class)
	public void tst_constructor_Area(int x1, int y1, int x2, int y2) {
		area = new Area(x1, y1, x2, y2);
		Assert.assertEquals(area.getX1(), x1);
		Assert.assertEquals(area.getY1(), y1);
		Assert.assertEquals(area.getX2(), x2);
		Assert.assertEquals(area.getY2(), y2);
	}

	@Test(groups = { "methods" }, dataProvider = "dp4", dataProviderClass = DataProviderSubTask4.class)
	public void tst_method_isPointInArea(int x1, int y1, int x2, int y2, boolean expected, Point point) {
		area = new Area(x1, y1, x2, y2);
		Assert.assertEquals(area.isPointInArea(point), expected);
	}
}
