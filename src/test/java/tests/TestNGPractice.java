package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPractice {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this method runs before each test");
	}

	@Parameters({ "url", "address", "date" })
	public void googlePage(String url, String address, double date) {
		System.out.println("url is: " + url);
		System.out.println("adrres is: " + address);
		System.out.println("date is:" + date);
	}

	@Test
	public void firstTest() {
		System.out.println("Start of SDET was Aug 2019");

	}

	@Test(priority = 2, dependsOnMethods = { "testOne" })
	public void secondTest() {
		System.out.println("Start of SDET was Aug 2019");
	}

	@Test(priority = 3, enabled = false)
	public void thirdTest() {
		System.out.println("Start of SDET was Aug 2019");
	}

	@Test
	public void forthTest() {
		System.out.println("Start of SDET was Aug 2019");

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("this method runs after each test");

	}

}
