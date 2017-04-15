package org.harish.unittestcases;

import static org.junit.Assert.*;

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
	
	@Test
	public void checkUsernameMethod()
	{
		assertEquals(true, new StringUtility().checkUsername("harish"));
	}

}
