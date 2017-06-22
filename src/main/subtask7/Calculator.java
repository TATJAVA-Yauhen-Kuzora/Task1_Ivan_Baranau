package main.subtask7;

import java.util.Map;
import java.util.TreeMap;

public class Calculator {
	
	public Map<Double,Double> calculateFunction(double a,double b, double dx){
		Map<Double,Double> result=new TreeMap<>();
		double x=a;
		while(x<b){
			System.out.println("hi");
			double func=Math.pow(Math.sin(x),2)-Math.cos(2*x);
			result.put(x, func);
			x+=dx;
		}
		return result;
	}
}
