package appManager;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.AppManagerActions;
import pageActions.CommonActions;
import pageActions.HomePageActions;
import pageActions.QAPageActions;
import pageActions.SitePagesActions;
import pageActions.StudioActions;
import webTest.CommonTestFunctions;

public class CreateNewApplet extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	SitePagesActions sitePagesActions;
	AppManagerActions appManagerActions;
	
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
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}

	@Test(priority = 1, enabled = true)
	public void verifyCreateNewApplet() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		appManagerActions.clickAppManagerIcon();
		appManagerActions.clickUnifyedAppstore();
		appManagerActions.clickCustomTab();
		appManagerActions.clickCreateNewApp();
		appManagerActions.clickChooseImage();
		appManagerActions.enterAppName();
		appManagerActions.clickNextButton();
		appManagerActions.clickNextButton();
		appManagerActions.clickAddButton();
		appManagerActions.clickOkAppSaved();
		//input[@class='form-control inputControll ng-pristine ng-valid ng-empty ng-touched']
		
//		appManagerActions.clickOkAppSaved();
//		appManagerActions.clickCancel();
//		appManagerActions.clickPublish();
//		String text = appManagerActions.assertPublishBox();
//		Assert.assertEquals(text, "Global Publish");
//		appManagerActions.clickNoButton();
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
