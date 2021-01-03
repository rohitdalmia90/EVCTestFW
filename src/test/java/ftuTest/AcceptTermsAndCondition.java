package ftuTest;

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

public class AcceptTermsAndCondition extends BrowserSelection implements OtherObjects{

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
	
	@Test
	public void verifyAcceptTerm() throws InterruptedException, AWTException {
		qaActions.termsCheckboxClick();
		qaActions.acceptTermsClick();
		webActions.hardSleep();
		String ftuText = qaActions.assertftuLoginPage();
		System.out.println(ftuText);
}
	
	@AfterClass
	public void logginOut() throws InterruptedException {
		commonFunctions.logOut();
	}
	
}
