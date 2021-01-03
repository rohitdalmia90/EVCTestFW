package webTest;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.CommonActions;
import pageActions.HomePageActions;
import pageActions.UTAActions;

public class UTA extends BrowserSelection implements OtherObjects{
	
	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	CommonActions commonActions;
	UTAActions utaActions;
	
	@Parameters({"userName", "password"})
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException
	{
		//Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		utaActions = new UTAActions();
		
		//Logging Into the App
		commonFunctions.logInUTA(userName, password);
	}
	
	
	@Test(priority = 1, enabled = false)
	public void verifyAuthorizeOnFstLogIn() throws InterruptedException
	{
		utaActions.waitForPageLoad();
		String parentWindowHandle = utaActions.getDefaultWindowHandle();
		utaActions.waitForAuthorizationWindow();
		ArrayList<String> allWindowHandles = utaActions.getAllWindowHandles();
		boolean newWindwoFlag = utaActions.verifyNewTab(allWindowHandles);
		utaActions.switchIfUsrLoginFstTymUTA(newWindwoFlag, allWindowHandles, parentWindowHandle);
	}
	
	
	@Test(priority = 2, enabled = true)
	public void verifyLandingScrnUTA() throws InterruptedException 
	{
		utaActions.waitForPageLoad();
		webActions.hardSleep();
		int headingText = utaActions.getSizeHomeHeadingUTA();
		Assert.assertTrue(headingText >= 1);
	}
	
	
	@Test(priority = 3, enabled = false)
	public void verifyMyUTPortal501() throws InterruptedException, IOException
	{
		utaActions.waitForPageLoad();
		String mainWindowHandle = utaActions.getDefaultWindowHandle();
		utaActions.clickMyUTPortal101Optn();
		ArrayList<String> allWindowHandles = utaActions.getAllWindowHandles();
		utaActions.closeNewWindow(allWindowHandles);
		utaActions.switchToWindow(mainWindowHandle);
		boolean noOfWindows = utaActions.verifyNewTab(allWindowHandles);
		Assert.assertEquals(noOfWindows, true);
	}
	
	
	//@Test(priority = 4, enabled = false)
	public void verifyAssignmentMyUTPortal101() throws InterruptedException, IOException
	{
		utaActions.waitForPageLoad();
		String mainWindowHandle = utaActions.getDefaultWindowHandle();
		utaActions.clickAssignmentMyUTPortal101Optn(mainWindowHandle);
		int assignmentSize = utaActions.getSizeOfAssignmentSection();
		Assert.assertTrue(assignmentSize > 0);
	}
	
	@Test(priority = 5, enabled = false)
	public void verifyDiscussionMyUTPortal501() throws InterruptedException, IOException
	{
		utaActions.waitForPageLoad();
		String mainWindowHandle = utaActions.getDefaultWindowHandle();
		utaActions.clickDiscussionMyUTPortal101Optn(mainWindowHandle);
		int assignmentSize = utaActions.getSizeOfDiscussionSection();
		Assert.assertTrue(assignmentSize > 0);
	}
	
	
	@Test(priority = 6, enabled = false)
	public void verifyGradesMyUTPortal501() throws InterruptedException, IOException
	{
		utaActions.waitForPageLoad();
		String mainWindowHandle = utaActions.getDefaultWindowHandle();
		utaActions.clickGradesMyUTPortal101Optn(mainWindowHandle);
		int assignmentSize = utaActions.getSizeOfGradesSection();
		Assert.assertTrue(assignmentSize > 0);
	}
	
	
	//@Test(priority = 7, enabled = false)
	public void verifyFilesMyUTPortal501() throws InterruptedException, IOException
	{
		utaActions.waitForPageLoad();
		String mainWindowHandle = utaActions.getDefaultWindowHandle();
		utaActions.clickFilesMyUTPortal101Optn(mainWindowHandle);
		int assignmentSize = utaActions.getSizeOfFilesSection();
		Assert.assertTrue(assignmentSize > 0);
	}
	
	
	@Test(priority = 8, enabled = false)
	public void verifySyllabusMyUTPortal501() throws InterruptedException, IOException
	{
		utaActions.waitForPageLoad();
		String mainWindowHandle = utaActions.getDefaultWindowHandle();
		utaActions.clickSyllabusMyUTPortal101Optn(mainWindowHandle);
		int assignmentSize = utaActions.getSizeOfSyllabusSection();
		Assert.assertTrue(assignmentSize > 0);
	}
	
	
	@Test(priority = 9, enabled = false)
	public void verifyProfileScrn() throws InterruptedException 
	{
		homeActions.clickDropDown();
		homeActions.clickProfileOptn();
		int headingText = homeActions.getSizeProfileText();
		int editBtnSize = homeActions.getSizeEditBtn();
		Assert.assertEquals(headingText, 1);
		Assert.assertEquals(editBtnSize, 1);
	}
	
	
	@Test(priority = 10, enabled = false)
	public void verifyPreferenceScrn() throws InterruptedException 
	{
		homeActions.clickDropDown();
		homeActions.clickPreferencesOptn();
		int connectText = homeActions.getSizeConnectText();
		int messagingText = homeActions.getSizeMessagingText();
		Assert.assertTrue(connectText >= 1);
		Assert.assertTrue(messagingText >= 1);
	}

	
	@Test(priority = 11, enabled = false)
	public void searchItem() throws InterruptedException 
	{
		homeActions.enterValueInSearchField("maps");
		int connectInResult = homeActions.searchResultMapsOption();
		homeActions.clearValueOfSearchField();
		Assert.assertTrue(connectInResult >= 1);
	}
	
	
	@Test(priority = 12, enabled = false)
	public void verifyVideoScreen() throws InterruptedException
	{
		utaActions.enterValueInSearchField("video");
		utaActions.clickVideosOptnSpan();
		int titleSize = utaActions.getSizeOfVideoHeadline();
		utaActions.clearValueOfSearchField();
		Assert.assertEquals(titleSize, 1);
	}
	
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
