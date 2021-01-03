package siteAndPages;

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
import webTest.CommonTestFunctions;

public class SaveAsTemplate extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	SitePagesActions sitePagesActions;
	
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
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	//Run after CreateNewPage.java...need to change template name every time 
//	bcz of issue giving same name error after deleting already same name template
	@Test(priority = 4, enabled = true)
	public void verifySaveAsTemplate() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		sitePagesActions.clickSitesAndPages();
		sitePagesActions.clickSetting();
		sitePagesActions.clickSaveAsTemplate();
		sitePagesActions.entertTemplateName();
		sitePagesActions.clickSaveTemplateName();
		sitePagesActions.clickOkPopUpManage();
//		sitePagesActions.editPageName();
//		sitePagesActions.editPageTitle();
//		sitePagesActions.selectCategory();
//		sitePagesActions.selectTag();
//		sitePagesActions.clickSaveManagePage();
//		sitePagesActions.clickOkPopUpManage();
//		sitePagesActions.clickCloseManagePage();
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
