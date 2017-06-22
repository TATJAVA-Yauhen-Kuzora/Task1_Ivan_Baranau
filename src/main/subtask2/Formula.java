package main.subtask2;

public class Formula {
		
	public double calculate(double a,double b,double c) {
		double result=(b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+Math.pow(b, -2);
		return result;
	}

}
