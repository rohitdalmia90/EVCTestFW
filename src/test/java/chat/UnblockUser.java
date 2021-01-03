package chat;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
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
import pageActions.QAPageActions;
import pageActions.SitePagesActions;
import pageActions.StudioActions;
import webTest.CommonTestFunctions;

public class UnblockUser extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	SitePagesActions sitePagesActions;
	AppManagerActions appManagerActions;
	ChatActions chatActions;
	ConfirmNewConnectionAdded assertNewConnectionAdded;
	
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
		appManagerActions = new AppManagerActions();
		chatActions = new ChatActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}

	@Test
	public void verifyUnblockUser() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		chatActions.clickChatIcon();
		chatActions.clickBlockIndividualChatUser();
		chatActions.clickBlockPopup();
		chatActions.clickSubmitBlockUser();
		chatActions.clickOKBlockUser();
		qaActions.clickProfileDropDown();
		qaActions.preferencesClick();
		chatActions.clickManageUnblockUser();
		String popup=chatActions.assertManageBlockUserPopup();
		Assert.assertEquals(popup, "Manage blocked users");
		chatActions.clickDeleteBlockUser();
//		BrowserSelection.getDriver().sendKeys(Keys.ENTER);
		chatActions.clickSaveAll();
		
		
		
			
	}
	
//	AssertNewConnectionAdded();
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
