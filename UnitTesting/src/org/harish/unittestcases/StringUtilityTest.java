package org.harish.unittestcases;

import org.harish.unittestsource.StringUtility;
import org.junit.Test;

public class StringUtilityTest {

	@Test(expected=NullPointerException.class)
	public void checkUsernameTest() {
		new StringUtility().checkUsername(null);
	}
	
	@Test(timeout=10)
	public void checkUsernameTestTimeout() {
		new StringUtility().checkUsername("harish");
	}

}
