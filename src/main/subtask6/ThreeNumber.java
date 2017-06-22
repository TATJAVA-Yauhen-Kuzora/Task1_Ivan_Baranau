package main.subtask6;

public class ThreeNumber {
	private double a;
	private double b;
	private double c;
	
	public ThreeNumber(double a,double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double calcSumOfMixAndMax() {
		return Math.max(Math.max(a, b),c)+Math.min(Math.min(a, b),c);
	}
}
