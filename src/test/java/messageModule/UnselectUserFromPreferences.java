package messageModule;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.AppManagerActions;
import pageActions.ChatActions;
import pageActions.CommonActions;
import pageActions.HomePageActions;
import pageActions.MessageModuleActions;
import pageActions.QAPageActions;
import pageActions.SitePagesActions;
import pageActions.StudioActions;
import webTest.CommonTestFunctions;

public class UnselectUserFromPreferences extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	MessageModuleActions messageActions;
	
	@Parameters({"userName", "password"})
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException
	{
		//Calling Objects
		qaActions = new QAPageActions();
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		messageActions = new MessageModuleActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}

	@Test
	public void verifyUnselectUserFromPreferences() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		qaActions.preferencesClick();
		messageActions.clickMangeMessagePermission();
		messageActions.clickAllUserUnderManage();
		String classname= messageActions.assertToggleSelectedCheck();
		String real = "ng-untouched ng-valid ng-dirty ng-valid-parse ng-not-empty";
		messageActions.clickPreferncesToggle();	
		messageActions.clickSaveManagePermissions();
		
	}
	
//	AssertNewConnectionAdded();
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
