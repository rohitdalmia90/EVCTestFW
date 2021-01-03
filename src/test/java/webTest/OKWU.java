package webTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.HomePageActions;

public class OKWU extends BrowserSelection implements OtherObjects{
	
	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	
	@Parameters({"userName", "password"})
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException
	{
		//Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	
	@Test(priority = 1, enabled = true)
	public void verifyLandingScrnOKWU() throws InterruptedException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		int headingText = homeActions.getSizeDashboardHeading();
		Assert.assertTrue(headingText >= 1);
	}
	
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
