package unifyedGroup;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.CommonActions;
import pageActions.HomePageActions;
import pageActions.QAPageActions;
import pageActions.SitePagesActions;
import pageActions.StudioActions;
import pageActions.UnifyedGroupActions;
import webTest.CommonTestFunctions;

public class ViewInviteRequest extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	SitePagesActions sitePagesActions;
	UnifyedGroupActions unifyedGroupActions;
	
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
		sitePagesActions = new SitePagesActions();
		unifyedGroupActions = new UnifyedGroupActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}

	@Test(priority = 9, enabled = true)
	public void verifyViewInviteRequest() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		unifyedGroupActions.clickUnifyedGroup();
		unifyedGroupActions.clickRestrictedDropdown();
		unifyedGroupActions.clickViewInviteRequest();
		String text = unifyedGroupActions.assertGroupInvites();
		Assert.assertEquals(text, "Group Invites- AutoGroupRestricted");
		unifyedGroupActions.clickCloseGroupInvite();
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
