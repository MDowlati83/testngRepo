package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClassPractice {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this method will execute before each test");
	}
	@Test(priority = 5)
	public void testOne() {
		System.out.println("this is test One");
		
	}
	@Test (priority = 4, enabled = false)
	public void testTwo() {
		System.out.println("this is test Two");
		
	}
	@Test (priority = 3,enabled = false)
	public void testThree() {
		System.out.println("this is test Three");
		
	}
	@Test (priority = 1 )
	public void testFour() {
		System.out.println("this is test Four");
		String actual = "TEK school of America";
		String expected = "TEK school of America";
		Assert.assertEquals(expected, actual);

	}
	@Test (priority = 2, dependsOnMethods = {"testFour"})
	public void testFive() {
		System.out.println("this is test Five");
		System.out.println("this method depends on succsessfull execution of  testNumber Four");
		
		}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this method will execute after each test");
	}
	
	

}
