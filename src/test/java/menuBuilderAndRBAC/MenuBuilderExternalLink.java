package menuBuilderAndRBAC;

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

public class MenuBuilderExternalLink extends BrowserSelection implements OtherObjects{

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
	
	@Test(priority = 3, enabled = true)
	public void verifyMenuBuilderExternalLink() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		studioActions.clickSetting();
		studioActions.clickMenuBuilder();
		studioActions.clickaddMenuBuilder();
		studioActions.clickExternalLink();
		studioActions.clickNewLink();
		studioActions.enterNewLinkName();
		studioActions.enterPathLink();
		studioActions.clickShowOnMobileApp();
		studioActions.clickSaveMenuBuilder();
		studioActions.clickokMenuStructure();
		studioActions.clickCancelMenuBuilder();
		
		studioActions.clickSetting();
		studioActions.clickRbacSettings();
		studioActions.clickAllUsers();
		studioActions.automationTestLink();
		studioActions.clickSaveMenuBuilder();
		studioActions.clickokMenuStructure();
		studioActions.cancelRBAC();
		BrowserSelection.getDriver().navigate().refresh();
		
		studioActions.searchAutomationLink();
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
