package main.subtask4;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CoordinatePlaneTest {
	private CoordinatePlane plane;

	@BeforeMethod(groups = { "methods" })
	public void beforeMethod() {
		plane = new CoordinatePlane();
	}

	@AfterMethod(groups = { "methods" })
	public void afterMethod() {
		plane = null;
	}

	@Test(groups = { "methods" }, dataProvider = "dp3", dataProviderClass = DataProviderSubTask4.class)
	public void tst_method_checkPointOnPlane(boolean expected, Area area, Point point) {
		plane.addStatedArea(area);
		Assert.assertEquals(plane.checkPointOnPlane(point), expected);

	}
}
