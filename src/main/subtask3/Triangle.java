package main.subtask3;

public class Triangle {
	private double leg1;
	private double leg2;

	public Triangle(double leg1, double leg2) throws Exception {
		if (leg1 < 0 || leg2 < 0 || !Double.isInfinite(leg1) || !Double.isInfinite(leg2) || !Double.isNaN(leg1)
				|| !Double.isNaN(leg2)) {
			throw new IllegalArgumentException("Invalid values of the legs");
		} else {
			this.leg1 = leg1;
			this.leg2 = leg2;
		}
	}

	public double getLeg1() {
		return leg1;
	}

	public double getLeg2() {
		return leg2;
	}

	public double findArea() {
		return leg1 * leg2 * 0.5;
	}

	public double findPerimeter() {
		return leg1 + leg2 + getHypotenusa();
	}

	private double getHypotenusa() {
		return Math.sqrt(leg1 * leg1 + leg2 * leg2);
	}
}
