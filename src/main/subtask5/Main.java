package main.subtask5;

import java.util.Arrays;

import main.util.ConsoleHelper;

public class Main {

	public static void main(String[] args) {
		if(args.length!=3){
			ConsoleHelper.print("Three argumensts are necessary");
		}
		else {
			Solution solution=new Solution();
			ConsoleHelper.print(Arrays.toString(solution.powerNumber(solution.changeStringToDoubleArray(args))));
		}
	}

}
