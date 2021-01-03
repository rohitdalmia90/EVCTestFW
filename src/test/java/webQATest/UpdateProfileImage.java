package webQATest;

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
import webTest.CommonTestFunctions;

public class UpdateProfileImage extends BrowserSelection implements OtherObjects{
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
	public void verifyUpdateProfileImage() throws InterruptedException 
	{
		homeActions.waitForPageLoad();
//	    String headingText = qaActions.assertAnoncementHeading();
//	    Assert.assertEquals(headingText, "Announcement Test#2");
		qaActions.clickProfileDropDown();
		qaActions.preferencesClick();
		String headingText1 = qaActions.assertRbacSetting();
	    Assert.assertEquals(headingText1, "Rbac setting");
	    qaActions.updateProfileImageButtonClick();
		qaActions.preferenceSaveAllClick();
		qaActions.clickProfileDropDown();
		qaActions.clickProfileOptn();
		qaActions.clickEdit();
		qaActions.cancelClick();
	}
	
	
	/*@Test(priority = 2, enabled = true)
	public void verifyPreferenceScrn() throws InterruptedException {
		qaActions.clickProfileDropDown();
		qaActions.preferencesClick();
		String headingText = qaActions.assertRbacSetting();
	    Assert.assertEquals(headingText, "Rbac Setting");
	}
	
	
	@Test(priority = 3, enabled = true)
	public void verifyoffUpdateProfileImage() throws InterruptedException, AWTException {
		qaActions.updateProfileImageButtonClick();
		qaActions.preferenceSaveAllClick();
		qaActions.clickProfileDropDown();
		qaActions.clickProfileOptn();
		qaActions.clickEdit();
//		qaActions.cameraContainerDisplay();
	}
	
	@Test(priority = 4, enabled = true)
	public void verifyCancelClick() throws InterruptedException {
	qaActions.cancelClick();	
	}	*/
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}


