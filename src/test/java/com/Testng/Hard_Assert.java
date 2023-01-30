package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	
	@Test
	private void demo() {
		String exp = "Suriya";
		String act = "Suriya";
		Assert.assertEquals(exp, act);
		System.out.println("Validation");
				

	}

}
