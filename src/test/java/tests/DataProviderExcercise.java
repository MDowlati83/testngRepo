package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class DataProviderExcercise {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test(dataProvider = "getData")
	public void dataProviderTest(String city, String state, String zipcode) {
		System.out.println("city is :" + city);
		System.out.println("state is:" + state);
		System.out.println("zipcode is:" + zipcode);
	}

	@DataProvider()
	public Object[][] getData() {
		Object data[][] = ExcelUtility.getData("TestEnvLogin");
		return data;

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");

	}

}
