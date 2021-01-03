package webQATest;

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
import webTest.CommonTestFunctions;

public class IntrestCheckUnderProfile extends BrowserSelection implements OtherObjects{


	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	
	@Parameters({"userName", "password"})
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException
	{
		//Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		qaActions = new QAPageActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	
//	@Test(priority = 1, enabled = true)
	@Test
	public void verifyNewCategoryUnderProfile() throws InterruptedException, AWTException 
	{
		
		homeActions.waitForPageLoad();
		webActions.hardSleep();
	    
//		String headingText = qaActions.assertAnoncementHeading();
//	    Assert.assertEquals(headingText, "Announcement Test#2");
//	    for(Cookie cookie : commonActions.getDriver().manage().getCookies()) {
//			System.out.println("my cookie: " + cookie.getName() + ", value: "+cookie.getValue());
//		}
		qaActions.clickProfileDropDown();
		qaActions.clickProfileOptn();
		qaActions.categoryCheck();
//		qaActions.preferencesClick();
//		qaActions.manageCategoriesClick();
//		qaActions.createCategoriesClick();
//		qaActions.enterCategoryClick();
//		qaActions.enterCategoryName();
//		qaActions.saveCategoryClick();

	}
	
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
