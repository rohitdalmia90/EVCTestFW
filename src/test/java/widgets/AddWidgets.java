package widgets;

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
import pageActions.SitePagesActions;
import pageActions.StudioActions;
import pageActions.WidgetActions;
import webTest.CommonTestFunctions;

public class AddWidgets extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	SitePagesActions sitePagesActions;
	WidgetActions widgetActions;
	
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
		widgetActions = new WidgetActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	//Run after CreateNewPage.java...still facing issues some pages are deleting some not
	@Test(priority = 1, enabled = true)
	public void verifyAddWidgets() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		widgetActions.clickTestCheck();
		widgetActions.clickWidgetOptn();
		widgetActions.clickSiteContent();
		widgetActions.selectSmartArticle();
		widgetActions.clickDone();
		
//		sitePagesActions.clickSitesAndPages();
//		sitePagesActions.clickSetting();
//		sitePagesActions.clickDelete();
//		sitePagesActions.clickDeleteDialogBox();
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
