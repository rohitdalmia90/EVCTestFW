package pageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.HomePageObjects;

public class HomePageActions extends BrowserSelection{
	
	HomePageObjects homeObjects = new HomePageObjects();

	public HomePageActions()
	{
		  PageFactory.initElements(getDriver(), homeObjects);
	}

	public void waitForPageLoad() throws InterruptedException
	{
		webActions.waitForElement(homeObjects.sideBar);
	}

	public void hoverSideBar() throws InterruptedException {
		webActions.waitForElement(homeObjects.sideBar);
		action = new Actions(getDriver());
		WebElement sideBar = webActions.getElement(homeObjects.sideBar, "Saving Sidebar into an var to hover.");
		action.moveToElement(sideBar).build().perform();
		webActions.hardSleep();
		}
	
	public void clickHamburgerIcon() throws InterruptedException{
		webActions.waitForElement(homeObjects.sideBar);
		Thread.sleep(2000);
		webActions.click(homeObjects.hamburgerIcon, "Clicking on harmburger icon");
		
		boolean navAreaOpened = webActions.isDisplayed(homeObjects.tenantBigLogo, "Verifying if tenant logo is visible");
		if(!navAreaOpened)
		{
			webActions.click(homeObjects.hamburgerIcon, "Clicking on harmburger icon when closed");
		}
	}
	
	public String getPageTitle()
	{
		String pageHeadline = webActions.getText(homeObjects.pageHeading, "Getting page headline");
		return pageHeadline;
	}
	
	public void clickDropDown() throws InterruptedException
	{
		webActions.waitForElement(homeObjects.sideBar);
		webActions.hardSleep();
		webActions.click(homeObjects.profileOtnsDropDown, "Clicking on Options DD");
	}
	
	public void clickProfileOptn() throws InterruptedException
	{
		webActions.waitForElement(homeObjects.yurProfileOptn);
		webActions.click(homeObjects.yurProfileOptn, "Clicking on Profile Option in DD");
	}
	
	public void clickStudioOptn() throws InterruptedException
	{
		webActions.waitForElement(homeObjects.studioOptn);
		webActions.click(homeObjects.studioOptn, "Clicking on Studio Option in DD");
	}
	
	public void clickPreferencesOptn() throws InterruptedException
	{
		webActions.waitForElement(homeObjects.preferencesOptn);
		webActions.click(homeObjects.preferencesOptn, "Clicking on Preferences option in DD");
	}
	
	
	//Profile page related options
	public int getSizeProfileText()
	{
		int textSize = homeObjects.profileText.size();
		return textSize;
	}
	
	public int getSizeEditBtn()
	{
		int btnSize = homeObjects.editBtn.size();
		return btnSize;
	}
	
	
	//Preferences page related actions
	public int getSizeConnectText()
	{
		int textSize = homeObjects.connectText.size();
		return textSize;
	}
	
	public int getSizeMessagingText()
	{
		int textSize = homeObjects.messagingText.size();
		return textSize;
	}
	
	
	
	//Left Nav related actions
	public void clearValueOfSearchField(){
		webActions.clear(homeObjects.searchField, "Entering the value into the search field");
	}
	
	public void enterValueInSearchField(String searchFor){
		webActions.clearThenSetText(homeObjects.searchField, searchFor, "Entering the value into the search field");
	}
	
	public void clickPswrdOption() throws InterruptedException {
		webActions.click(homeObjects.pswrdInSrchReslt, "Clicking on Password option in search results");
		Thread.sleep(3000);
	}
	
	public void clickCnctOption() throws InterruptedException
	{
		webActions.click(homeObjects.connectInSearchResult, "Clicking on Connect option");
		Thread.sleep(1500);
	}
	
	public void clickCnctChildOption()
	{
		webActions.click(homeObjects.connectInSearchResultChild, "Clicking on Connect option");
	}
	
	public void clickMsgOption() {
		webActions.click(homeObjects.msgInSearchResult, "Clicking on Message option in search results");
	}
	
	public void clickMsgOption_UVI() {
		webActions.click(homeObjects.msgInSearchResult_UVI, "Clicking on Message option in search results");
	}
	
	public void clickSocialNetwrkingOption()
	{
		webActions.click(homeObjects.socialNetworkingInSrchReslt, "Clicking on Social Networking option");
	}
	
	public void clickSocialMediaOption() throws InterruptedException
	{
		webActions.click(homeObjects.socialMediaInSrchReslt, "Clicking on Social Media option");
		Thread.sleep(1000);
		boolean socialMediaChildSize = homeObjects.socialMediaChildReslt.isDisplayed();
		if(socialMediaChildSize == false)
		{
			webActions.click(homeObjects.socialMediaInSrchReslt, "Clicking on Social Media option");
		}
	}
	
	public void clickFacebookOption() throws InterruptedException
	{
		webActions.click(homeObjects.facebookInNavBar, "Clicking on Facebook option");
		Thread.sleep(1000);
	}
	
	public void clickFacebookChildOption() throws InterruptedException
	{
		webActions.click(homeObjects.facebookInNavBarChild, "Clicking on Facebook option");
		Thread.sleep(1000);
	}
	
	public void clickInstagramOption() throws InterruptedException
	{
		webActions.click(homeObjects.instagramInNavBar, "Clicking on Instagram option");
		Thread.sleep(1000);
	}
	
	public void clickInstagramChildOption() throws InterruptedException
	{
		webActions.click(homeObjects.instagramInNavBarChild, "Clicking on Instagram option");
		Thread.sleep(1000);
	}
	
	public void clickTwitterOption() throws InterruptedException
	{
		webActions.click(homeObjects.twitterInNavBar, "Clicking on Twitter option");
		Thread.sleep(1000);
	}
	
	public void clickTwitterChildOption() throws InterruptedException
	{
		webActions.click(homeObjects.twitterInNavBarChild, "Clicking on Twitter option");
		Thread.sleep(1000);
	}
	
	public void clickYoutubeOption() throws InterruptedException
	{
		webActions.click(homeObjects.youtubeInNavBar, "Clicking on Youtube option");
		Thread.sleep(1000);
	}
	
	public void clickYoutubeChildOption() throws InterruptedException
	{
		webActions.click(homeObjects.youtubeInNavBarChild, "Clicking on Youtube option");
		Thread.sleep(1000);
	}
	
	public void clickLinkedInChildOption() throws InterruptedException
	{
		webActions.click(homeObjects.linkedInInNavBarChild, "Clicking on LinkedIn option");
		Thread.sleep(1000);
	}
	

	public int getSizeOfFilterDD()
	{
		int filterSize = webActions.getSize(homeObjects.yourPrefrencesFiltrOptn, "Getting size of filter DD");
		return filterSize;
	}
	
	public int getSizeOfCreateMsgBtn() throws InterruptedException
	{
		int btnSize = homeObjects.createMessageBtn.size();
		return btnSize;
	}
		
	public void clickVideosOptn()
	{
		webActions.click(homeObjects.videoInNavBar, "Clicking on video button");
	}
	
	public void clickVideosOptnSpan()
	{
		webActions.click(homeObjects.videoInNavBarSpan, "Clicking on video button");
	}
	
	public void clickVideoChildOption() throws InterruptedException
	{
		webActions.click(homeObjects.videoInInNavBarChild, "Clicking on Video option");
		Thread.sleep(1000);
	}
	
	public int getSizeOfVideoHeadline()
	{
		int size = webActions.getSize(homeObjects.videosHeadline, "Getting size of video headline");
		return size;
	}
	
	public int getSizeOfVideoOnPage()
	{
		int size = homeObjects.videosOnPage.size();
		return size;
	}
	
	public int getSizeHomeHeading()
	{
		int textSize = homeObjects.homeHeading.size();
		return textSize;
	}
	
	public int getSizeWelcomeHeading()
	{
		int textSize = homeObjects.welcomeHeading.size();
		return textSize;
	}
	
	public int getSizeDashboardHeading()
	{
		int textSize = homeObjects.dashboardHeading.size();
		return textSize;
	}
	
	public int getSizeConnectHeading()
	{
		int textSize = homeObjects.connectHeading.size();
		return textSize;
	}
	
	public int searchResultConnectOption() {
		int searchResult = 0;
		int listSize = 0;
		listSize = homeObjects.optnConnect.size();
		if(listSize >= 1)
		{
			searchResult = searchResult + 1;
		}
		
		return searchResult;
	}
	
	public int searchResultConnectSubOption() {
		int searchResult = 0;
		int listSize = 0;
		listSize = homeObjects.subOptnConnect.size();
		if(listSize >= 1)
		{
			searchResult = searchResult + 1;
		}
		
		return searchResult;
	}
	
	public int searchResultSocialOption() {
		int searchResult = 0;
		int listSize = 0;
		listSize = homeObjects.optnSocialNetworking.size();
		if(listSize >= 1)
		{
			searchResult = searchResult + 1;
		}
		
		return searchResult;
	}
	
	public int searchResultMapsOption() {
		int searchResult = 0;
		int listSize = 0;
		listSize = homeObjects.optnMaps.size();
		if(listSize >= 1)
		{
			searchResult = searchResult + 1;
		}
		
		return searchResult;
	}
}
