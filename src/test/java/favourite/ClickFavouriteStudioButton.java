package favourite;

import java.awt.AWTException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.CommonActions;
import pageActions.FavouriteActions;
import pageActions.HomePageActions;
import pageActions.QAPageActions;
import pageActions.StudioActions;
import webTest.CommonTestFunctions;

public class ClickFavouriteStudioButton extends BrowserSelection implements OtherObjects{

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;
	StudioActions studioActions;
	FavouriteActions favouriteActions;
	
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
		favouriteActions = new FavouriteActions();
		
		//Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	@Test(priority = 2, enabled = true)
	public void verifyClickFavouriteStudioButton() throws InterruptedException, AWTException 
	{
		homeActions.waitForPageLoad();
		webActions.hardSleep();
			
		qaActions.clickProfileDropDown();
		studioActions.clickStudio();
		studioActions.clickSetting();
		studioActions.clickSiteSettings();
		studioActions.clickSiteFeatures();
		studioActions.clickFavoriteSiteFeatures();
		studioActions.clickSaveMenuBuilder();
		
		favouriteActions.clickfavouriteMenu();
//		favouriteActions.clickfavouriteMenuWelcome();
		
	}
	
	@AfterClass
	public void logginOut() throws InterruptedException
	{
		commonFunctions.logOut();
	}
	
}
