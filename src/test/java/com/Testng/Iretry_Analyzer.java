package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Analyzer {
	@Test
	public void username() {
		String exp = "Hi";
		String act = "Hi";
		Assert.assertEquals(exp, act);
	}
	@Test(retryAnalyzer = Rerun.class)
	public void password() {
		String exp = "Hello";
		String act = "Helloo";
		Assert.assertEquals(exp, act);
	

	}

}
