package main.subtask9;

public class Merger {
	public int[] mergeArrayFromPosition(int[]arr1,int[]arr2,int position){
		
		int[] result = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, position);
		System.arraycopy(arr2, 0, result, position, arr2.length);
		System.arraycopy(arr1, position, result, arr2.length + position, arr1.length - position);
		return result;
	}
		
}
