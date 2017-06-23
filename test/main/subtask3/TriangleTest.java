package main.subtask3;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TriangleTest {
	private Triangle triangle;

	@Test(groups = { "constructors" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask3.class)
	public void tst_constructor_Triangle(double a, double b, double expectedSquare, double expectedPerimeter) {
		triangle = new Triangle(a, b);
		Assert.assertEquals(triangle.getLeg1(), a);
		Assert.assertEquals(triangle.getLeg2(), b);
	}

	@Test(groups = { "methods" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask3.class)
	public void tst_method_findArea(double a, double b, double expectedSquare, double expectedPerimeter) {
		triangle = new Triangle(a, b);
		Assert.assertEquals(triangle.findArea(), expectedSquare, 0.001);
	}

	@Test(groups = { "methods" }, dataProvider = "dp1", dataProviderClass = DataProviderSubTask3.class)
	public void tst_method_findPerimeter(double a, double b, double expectedSquare, double expectedPerimeter) {
		triangle = new Triangle(a, b);
		Assert.assertEquals(triangle.findPerimeter(), expectedPerimeter, 0.001);
	}

	@Test(groups = {
			"exceptions" }, dataProvider = "dp2", dataProviderClass = DataProviderSubTask3.class, expectedExceptions = IllegalArgumentException.class)
	public void tst_exception_Triangle(double a, double b) {
		triangle = new Triangle(a, b);
	}

	@AfterMethod(groups = { "methods", "exceptions", "constructors" })
	public void afterMethod() {
		triangle = null;
	}
}
