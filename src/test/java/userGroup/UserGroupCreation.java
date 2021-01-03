package userGroup;

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
import pageActions.UserGroupActions;
import webTest.CommonTestFunctions;

public class UserGroupCreation extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	UserGroupActions userGroupActions;
	
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
		userGroupActions = new UserGroupActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	@Test(priority = 1, enabled = true)
	public void verifyUserGroupCreation() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		userGroupActions.clickUserGroupIcon();
		userGroupActions.clickGroups();
		userGroupActions.clickAddGroup();
        userGroupActions.enterGroupName();
		userGroupActions.enterDescription();

//		userGroupActions.clickSearchUserGroup();
		userGroupActions.enterUserID();
		userGroupActions.clickDone();
		studioActions.clickokMenuStructure();
		userGroupActions.clickCancel(); 
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
