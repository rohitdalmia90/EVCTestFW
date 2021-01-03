package webTest;

import frameworkGlobals.BrowserSelection;
import pageActions.LogInPageActions;

public class CommonTestFunctions extends BrowserSelection{
	LogInPageActions loginPageActions = new LogInPageActions();
	
	public void logIn(String userName, String password) throws InterruptedException
	{
		//extentTest = extentReports.createTest("LogIn", "Logging in into the application");
		loginPageActions.setUserName(userName);
		loginPageActions.setPassword(password);
		loginPageActions.clickSubmit();
	}
	
	public void logInUTA(String userName, String password) throws InterruptedException
	{
		//extentTest = extentReports.createTest("LogIn", "Logging in into the application");
		loginPageActions.setUserNameUTA(userName);
		loginPageActions.setPasswordUTA(password);
		loginPageActions.clickSubmitUTA();
	}
	
	public void logOut() throws InterruptedException
	{
		//extentTest = extentReports.createTest("LogOut", "Logging out of the application");
//		webActions.hardSleep();
		loginPageActions.clickOptnDropDown();
		loginPageActions.clickLogoutOptn();
		loginPageActions.clickYes();
	}
}
