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

public class HighPriorityLink extends BrowserSelection implements OtherObjects{

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
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		messageActions = new MessageModuleActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}

	@Test
	public void verifyHighPriorityLink() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		messageActions.clickMessageModule();
		String msgmodule=messageActions.assertMessageModule();
		Assert.assertEquals(msgmodule, "MessageModule");
		String create=messageActions.assertCreateButton();
		Assert.assertEquals(create, "+ Create");
		messageActions.clickCreateButton();
		messageActions.clickSelectUserGroup();
		messageActions.clickSelectAllUser();
		messageActions.clickNextButton();
		messageActions.clickpushNotificationIcon();
		messageActions.enterMailTitle();
		messageActions.composeMsgConnectPost();
		messageActions.selectPriorityHigh();
		messageActions.clickSelectApp();
		messageActions.clickNextButton();
		messageActions.clickPublish();	
		BrowserSelection.getDriver().navigate().refresh();
		messageActions.clickNotifications();
		String notify=messageActions.assertLowPriorityNoAcknowledgement();
		Assert.assertEquals(notify, "HighPriorityLink");
//		messageActions.clickAcknowledge();
		String connect=messageActions.assertSelectedApp();
		Assert.assertEquals(connect, "Unifyed Connect");
		
	}
	
//	AssertNewConnectionAdded();
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
