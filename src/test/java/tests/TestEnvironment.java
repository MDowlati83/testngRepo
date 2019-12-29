package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import core.Base;
import pageObjects.LoginPageObject;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.ExcelUtility;

public class TestEnvironment extends Base {

	LoginPageObject loginpage;
	TekSchoolScenariosPageObject tspageObject;

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		loginpage = new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();

	}

	@Test(dataProvider = "getData")
	public void testEnvironmentLogin(String userName, String password) {
		tspageObject = new TekSchoolScenariosPageObject();
		tspageObject.clickOnMyAccount();
		tspageObject.clickOnLogin();
		tspageObject.enterEmailAddress(userName);
		tspageObject.enterPassword(password);
		tspageObject.clickOnLoginButton();

	}

	@DataProvider()
	public Object[][] getData() {
		Object data[][] = ExcelUtility.getData("TestEnvLogin");
		return data;
	}

	@AfterMethod
	public void tearDown() {
		Base.teardown();

	}

}
