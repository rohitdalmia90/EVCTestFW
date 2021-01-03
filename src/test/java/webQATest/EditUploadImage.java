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

public class EditUploadImage extends BrowserSelection implements OtherObjects{
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
	public void verifyEditUploadImage() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
//	    String headingText = qaActions.assertAnoncementHeading();
//	    Assert.assertEquals(headingText, "Announcement Test#2");
	    qaActions.clickProfileDropDown();
		qaActions.clickProfileOptn();
		qaActions.clickEdit();
		qaActions.cameraContainerDisplay();
		qaActions.cameraContainerClick();
		qaActions.cameraContainerEditUpload();
		qaActions.cropImageClick();
		qaActions.saveAllClick();
	}
	
	
	/*@Test(priority = 2, enabled = true)
	public void verifyProfileScrn() throws InterruptedException {
		qaActions.clickProfileDropDown();
		qaActions.clickProfileOptn();
	}
	
	
	@Test(priority = 3, enabled = true)
	public void verifyCameraDisplay() throws InterruptedException, AWTException {
		qaActions.clickEdit();
		qaActions.cameraContainerDisplay();
		qaActions.cameraContainerClick();
		qaActions.cameraContainerEditUpload();
	}

	
	@Test(priority = 4, enabled = true)
	public void verifyEditUploadImage() throws InterruptedException {
		qaActions.cropImageClick();
	}
	
	
	@Test(priority = 5, enabled = true)
	public void verifySaveProfile() throws InterruptedException, IOException
	{
		qaActions.saveAllClick();
	}*/
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
