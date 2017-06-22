package main.util;

public class ArrayUtil {
	public static int[] createArrayWithNaturalNumber(int size) {
		if(size<=0){
			ConsoleHelper.print("Size of array should be more than 0"); System.exit(0);
		}
		int [] result=new int[size];
		for(int i=0;i<result.length;i++){
			result[i]=(int)(Math.random()*100+1);
		}
		return result;
	}
}
