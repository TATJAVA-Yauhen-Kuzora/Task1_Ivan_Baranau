package main.subtask8;

import java.util.Arrays;

import main.util.ArrayUtil;
import main.util.ConsoleHelper;

public class Solution {
	public void start(String[]args){
		if (args.length != 2) {
			ConsoleHelper.print("Two argumensts are necessary");
		}
		else{
			try{
				int size=Integer.parseInt(args[0]);
				int k=Integer.parseInt(args[1]);
				int[] mas=ArrayUtil.createArrayWithNaturalNumber(size);
				NaturalNumberArray array=new NaturalNumberArray(mas);
				ConsoleHelper.print("Array is : "+Arrays.toString(mas));
				ConsoleHelper.print("k is : "+k);
				ConsoleHelper.print("Sum is : "+array.calculateSum(k));;
			}catch(NumberFormatException e){
				ConsoleHelper.print("All arguments should be integer");
			}
		}
		
	}
}
