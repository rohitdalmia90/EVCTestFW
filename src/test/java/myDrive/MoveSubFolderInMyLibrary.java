package myDrive;

import java.awt.AWTException;

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
import pageActions.MessageModuleActions;
import pageActions.MyDriveActions;
import pageActions.QAPageActions;
import pageActions.SitePagesActions;
import pageActions.StudioActions;
import webTest.CommonTestFunctions;

public class MoveSubFolderInMyLibrary extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	MessageModuleActions messageActions;
	MyDriveActions myDriveActions;
	
	@Parameters({"userName", "password"})
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException
	{
		//Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		messageActions = new MessageModuleActions();
		myDriveActions = new MyDriveActions();
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}

	@Test
	public void verifyMoveFolderInMyLibrary() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
//		myDriveActions.clicksearchBox();
		myDriveActions.clickMyDrive();
		String msgmodule=myDriveActions.assertMyDrive();
		Assert.assertEquals(msgmodule, "My Drive");
		BrowserSelection.getDriver().navigate().refresh();
		String myLibrary=myDriveActions.assertMyLibrary();
		Assert.assertEquals(myLibrary, "My Library");
		myDriveActions.clickMyLibrary();
		myDriveActions.MoveFolderMyDrive();
		
		
	}
	
//	AssertNewConnectionAdded();
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
