package main.subtask1;

import org.testng.annotations.DataProvider;

public class DataProviderSubTask1 {

	@DataProvider
	public Object[][] dp1() { //
		return new Object[][] { new Object[] { true, "0000" }, //
				new Object[] { true, "9999" }, //
				new Object[] { true, "5418" }, //
				new Object[] { false, "1234" }, //
				new Object[] { false, "7466" }, //
		};
	}

	@DataProvider
	public Object[][] dp2() { //
		return new Object[][] { new Object[] { "----" }, //
				new Object[] { "\nce" }, //
				new Object[] { "___!" }, //
				new Object[] { "-5442" }, //
				new Object[] { "74655" }, //
				new Object[] { "+=+?" }, //
		};
	}
}
