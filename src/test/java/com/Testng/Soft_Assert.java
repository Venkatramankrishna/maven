package com.Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	private void demo() {
		String exp = "Suriya";
		String act = "Suriya24";
		SoftAssert s = new SoftAssert();
		s.assertEquals(exp, act);
		System.out.println("Verification");
				

	}

}
