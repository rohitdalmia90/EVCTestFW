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

public class MenuBuilderGroup extends BrowserSelection implements OtherObjects{

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
	
	@Test(priority = 5, enabled = true)
	public void verifyMenuBuilderGroup() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		studioActions.clickSetting();
		studioActions.clickMenuBuilder();
		studioActions.clickaddMenuBuilder();
		studioActions.clickGroup();
		studioActions.hoverAndClickAddNewGroup();
		
		studioActions.clickAddMenuItemInGroup();
		studioActions.clickSelectPages();
		studioActions.selectOurTeamPage();
		studioActions.selectColumnPage();
		studioActions.clickAddSelectedApp();
		
		studioActions.clickNewGroup();
		studioActions.enterNewGroupName();
		studioActions.mobileChkboxGroup();
		
		
		studioActions.clickSaveMenuBuilder();
		studioActions.clickokMenuStructure();
		studioActions.clickCancelMenuBuilder();
		
		studioActions.clickSetting();
		studioActions.clickRbacSettings();
		studioActions.clickAllUsers();
		studioActions.clickArrowAutomationGroup();
		studioActions.selectReadColumn();
		studioActions.selectReadOurTeam();
		studioActions.clickSaveMenuBuilder();
		studioActions.clickokMenuStructure();
		studioActions.cancelRBAC();
		BrowserSelection.getDriver().navigate().refresh();
		
		studioActions.searchAutomationGroup();
		studioActions.displayColumnGroup();
		studioActions.displayOurTeamGroup();
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
