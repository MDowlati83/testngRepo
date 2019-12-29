package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObjects.LoginPageObject;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.ExcelUtility;

public class RegisterFormTest extends Base {

	LoginPageObject loginpage;
	TekSchoolScenariosPageObject tspageObject;

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		loginpage = new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();

	}

	@Test(dataProvider = "getData")
	public void registerFormTest(String userName, String password) {
		tspageObject = new TekSchoolScenariosPageObject();
		tspageObject.clickOnMyAccount();
		tspageObject.clickonRegister();
		tspageObject.enterEmailAddress(userName);
		tspageObject.enterPassword(password);
		tspageObject.clickOnContinue();

	}

	@DataProvider()
	public Object[][] getData() {
		Object data[][] = ExcelUtility.getData("RegisterForm");
		return data;

	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

}