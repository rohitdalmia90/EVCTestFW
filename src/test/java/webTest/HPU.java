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

public class HPU extends BrowserSelection implements OtherObjects{
	
	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	CommonActions commonActions;
	
	@Parameters({"userName", "password"})
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException
	{
		//Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	
	@Test(priority = 1, enabled = true)
	public void verifyLandingScrnHPU() throws InterruptedException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
		int headingText = homeActions.getSizeHomeHeading();
		Assert.assertTrue(headingText >= 1);
	}
	
	
	@Test(priority = 2, enabled = false)
	public void verifyProfileScrn() throws InterruptedException {
		homeActions.clickDropDown();
		homeActions.clickProfileOptn();
		int headingText = homeActions.getSizeProfileText();
		int editBtnSize = homeActions.getSizeEditBtn();
		Assert.assertEquals(headingText, 1);
		Assert.assertEquals(editBtnSize, 1);
	}
	
	
	@Test(priority = 3, enabled = false)
	public void verifyPreferenceScrn() throws InterruptedException {
		homeActions.clickDropDown();
		homeActions.clickPreferencesOptn();
		int connectText = homeActions.getSizeConnectText();
		int messagingText = homeActions.getSizeMessagingText();
		Assert.assertTrue(connectText >= 1);
		Assert.assertTrue(messagingText >= 1);
	}

	
	@Test(priority = 4, enabled = false)
	public void searchItem() throws InterruptedException {
		homeActions.clickHamburgerIcon();
		//homeActions.enterValueInSearchField("connect");
		int connectInResult = homeActions.searchResultConnectOption();
		//searchItemActions.clearValueOfSearchField();
		Assert.assertTrue(connectInResult >= 1);
	}
	
	
	@Test(priority = 5, enabled = false)
	public void verifyConnectPage() throws InterruptedException, IOException
	{
		homeActions.hoverSideBar();
		//homeActions.enterValueInSearchField("connect");
		homeActions.clickCnctOption();
		int size = homeActions.getSizeOfFilterDD();
		//homeActions.clearValueOfSearchField();
		Assert.assertEquals(size, 1);
	}
	
	
	@Test(priority = 6, enabled = false)
	public void verifyFbSocialMedia() throws InterruptedException, IOException
	{
		homeActions.clickHamburgerIcon();
		//homeActions.enterValueInSearchField("social media");
		String mainWindowHandle = commonActions.getDefaultWindowHandle();
		homeActions.clickSocialMediaOption();
		homeActions.clickFacebookChildOption();
		ArrayList<String> allWindowHandles = commonActions.getAllWindowHandles();
		commonActions.closeNewWindow(allWindowHandles);
		commonActions.switchToWindow(mainWindowHandle);
		boolean noOfWindows = commonActions.verifyNewTab(allWindowHandles);
		//verifyAppletActions.clearValueOfSearchField();
		Assert.assertEquals(noOfWindows, true);
	}
	
	
	@Test(priority = 7, enabled = false)
	public void verifyInstaSocialMedia() throws InterruptedException, IOException
	{
		homeActions.clickHamburgerIcon();
		//homeActions.enterValueInSearchField("social media");
		String mainWindowHandle = commonActions.getDefaultWindowHandle();
		homeActions.clickSocialMediaOption();
		homeActions.clickInstagramChildOption();
		ArrayList<String> allWindowHandles = commonActions.getAllWindowHandles();
		commonActions.closeNewWindow(allWindowHandles);
		commonActions.switchToWindow(mainWindowHandle);
		boolean noOfWindows = commonActions.verifyNewTab(allWindowHandles);
		//homeActions.clearValueOfSearchField();
		Assert.assertEquals(noOfWindows, true);
	}
		
	
	@Test(priority = 8, enabled = false)
	public void verifyTwitterSocialMedia() throws InterruptedException, IOException
	{
		homeActions.clickHamburgerIcon();
		//homeActions.enterValueInSearchField("social media");
		String mainWindowHandle = commonActions.getDefaultWindowHandle();
		homeActions.clickSocialMediaOption();
		homeActions.clickTwitterChildOption();
		ArrayList<String> allWindowHandles = commonActions.getAllWindowHandles();
		commonActions.closeNewWindow(allWindowHandles);
		commonActions.switchToWindow(mainWindowHandle);
		boolean noOfWindows = commonActions.verifyNewTab(allWindowHandles);
		//homeActions.clearValueOfSearchField();
		Assert.assertEquals(noOfWindows, true);
	}
	
	
	@Test(priority = 9, enabled = false)
	public void verifyLinkedInSocialMedia() throws InterruptedException, IOException
	{
		homeActions.clickHamburgerIcon();
		//homeActions.enterValueInSearchField("social media");
		String mainWindowHandle = commonActions.getDefaultWindowHandle();
		homeActions.clickSocialMediaOption();
		homeActions.clickLinkedInChildOption();
		ArrayList<String> allWindowHandles = commonActions.getAllWindowHandles();
		commonActions.closeNewWindow(allWindowHandles);
		commonActions.switchToWindow(mainWindowHandle);
		boolean noOfWindows = commonActions.verifyNewTab(allWindowHandles);
		//verifyAppletActions.clearValueOfSearchField();
		Assert.assertEquals(noOfWindows, true);
	}
	
	
	@Test(priority = 10, enabled = false)
	public void verifyVideoScreen() throws InterruptedException
	{
		homeActions.clickHamburgerIcon();
		//homeActions.enterValueInSearchField("video");
		homeActions.clickSocialMediaOption();
		homeActions.clickVideoChildOption();
		//homeActions.clickVideosOptn();
		int titleSize = homeActions.getSizeOfVideoHeadline();
		//homeActions.clearValueOfSearchField();
		Assert.assertEquals(titleSize, 1);
	}
	
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
}
