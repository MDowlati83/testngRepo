package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this method will execute before each test");
	}
	
	@Test
	@Parameters({"userName","password"})
	public void login(String userName, String password) {
		System.out.println("User Name is: "+ userName);
		System.out.println("Password is: "+ password);
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("this method will execute after each test");
		
	}

}
