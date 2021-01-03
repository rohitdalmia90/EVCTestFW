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

public class MenuBuilderMenuItem extends BrowserSelection implements OtherObjects{

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
	
	@Test(priority = 1, enabled = true)
	public void verifyMenuBuilder() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		studioActions.clickSetting();
		studioActions.clickMenuBuilder();
		studioActions.clickaddMenuBuilder();
		studioActions.clickMenuItem();
		studioActions.clickMenuItemApps();
		studioActions.clickSelectedApps();
		String selectApp=studioActions.getTextSelectedApps();
		System.out.println(selectApp);
		studioActions.clickAddSelectedApp();
		String sis=studioActions.getTextSelectedAppDisplay();
		System.out.println(sis);
		studioActions.displaySelectedApp();
		studioActions.clickSelectedAppNavigation();
		studioActions.clickShowOnMobileApp();
//		studioActions.clickHideOnNavigation();
		studioActions.clickSaveMenuBuilder();
		studioActions.clickokMenuStructure();
		studioActions.clickCancelMenuBuilder();
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
