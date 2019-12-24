package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@Test
	public void testFirst() {
		System.out.println("This is test number one");
	}

	@Test
	public void testSecond() {
		System.out.println("This is test number two");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method prints before each Test");
	}

	@Test(priority = 2, enabled = false)
	public void testThird() {
		System.out.println("this should be print first");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method prints after each Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This method prints before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This method prints before Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This method prints before Test");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("This method prints after Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This method prints before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This method prints after Suite");
	}

}
