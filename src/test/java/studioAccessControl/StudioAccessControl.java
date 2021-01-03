package studioAccessControl;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.CommonActions;
import pageActions.HomePageActions;
import pageActions.QAPageActions;
import pageActions.StudioActions;
import webTest.CommonTestFunctions;

public class StudioAccessControl extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	
	@Parameters({"userName", "password"})
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException
	{
		//Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		qaActions = new QAPageActions();
		studioActions = new StudioActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	@Test(priority = 2, enabled = true)
	public void verifyStudioAccessControl() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		studioActions.clickSetting();
		studioActions.clickStudioAccessControl();
		studioActions.clickAddStudioAdmin();
		studioActions.enterUserAdminEmail();
		studioActions.clickAddAdminEmail();
		studioActions.clickokMenuStructure();
		
		studioActions.cancelRBAC();
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
