package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice {
	@Test
	public void firstTest () {
		System.out.println("this is first Test");
		
	}
	@Test(priority = 2, dependsOnMethods = {"testOne"})
	public void secondTest() {
		System.out.println("this is secondTest");
	}
	@Test(priority = 3, enabled = false)
	public void thirdTest() {
		System.out.println("this is Third Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this should print before each method");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("this method should print after each method");
		
	}
		
	}
		
	


