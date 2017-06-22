package main.subtask8;

public class NaturalNumberArray {
	private int[] array;

	public NaturalNumberArray(int[] array) {
		this.array = array;
	}

	public int calculateSum(int k) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum += array[i];
			}
		}
		return sum;
	}
}
