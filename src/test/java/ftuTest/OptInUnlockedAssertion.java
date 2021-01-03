package ftuTest;

import java.awt.AWTException;

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

public class OptInUnlockedAssertion extends BrowserSelection implements OtherObjects {

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;

	@Parameters({ "userName", "password" })
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException {
		// Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		qaActions = new QAPageActions();

		// Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	@Test(priority = 2, enabled = true)
	
	public void verifyFTUAssertion() throws InterruptedException, AWTException {

		webActions.hardSleep();
		String ftuText = qaActions.assertftuLoginPage();
		System.out.println(ftuText);
		
		String ftuText1 = qaActions.ftuAcademicColor();
		System.out.println(ftuText1);
		Assert.assertEquals(ftuText1, "userPreferances ng-scope selectedPre");
		String ftuText2 = qaActions.ftuDone();
		System.out.println(ftuText2);
//		Assert.assertEquals(ftuText2, "btn borderRadius4 btn-block secondaryColorBackground");
//		qaActions.ftuDanceClick();
//		
//		System.out.println("after click");
//		
	
}
	
	@AfterClass
	public void logginOut() throws InterruptedException {
		commonFunctions.logOut();
	}
}
