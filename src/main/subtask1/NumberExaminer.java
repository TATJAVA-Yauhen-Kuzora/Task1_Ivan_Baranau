package main.subtask1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExaminer {
	public boolean isTwoFirstTwoLast(String number) throws IllegalArgumentException {
		if (!isFourDigit(number)) {
			throw new IllegalArgumentException("Invalid input value");
		} else {
			if ((number.charAt(0) + number.charAt(1)) == (number.charAt(2) + number.charAt(3))) {
				return true;
			} else {
				return false;
			}
		}
	}

	private boolean isFourDigit(String number) {
		Pattern p = Pattern.compile("\\d{4}");
		Matcher m = p.matcher(number);
		return m.matches();
	}
}
