package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTopic {
	@Test
	public void hardAssertions() {
		
		Assert.assertEquals("Test Automation", "Software Test Automation");
		System.out.println("this is after hard assertion");
		
		
		
		
	}
	@Test
	public void softAssertions() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Hello", "Hi");
		softAssert.assertTrue("Tek School".equals("TEK SCHOOL"));
		//assert.assertTrue("Today".equals.("today"));
		
	}

	
	
	
	
	
}
