package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.FavouriteObjects;

public class FavouriteActions extends BrowserSelection{

	FavouriteObjects favouriteObjects = new FavouriteObjects();
	
	public FavouriteActions()
	{
		  PageFactory.initElements(getDriver(), favouriteObjects);
	}
	
	public void clickManageFavourite() throws InterruptedException
	{
		webActions.click(favouriteObjects.manageFavourite, "Clicking on manage for manage favourites");
	}
	
	public void clickFavouriteWelcome() throws InterruptedException
	{
		webActions.click(favouriteObjects.favouriteWelcome, "Clicking on welcome option under favourites");
	}
	
	public void clickFavouritePhotos() throws InterruptedException
	{
		webActions.click(favouriteObjects.favouritePhotos, "Clicking on photos option under favourites");
	}
	
	public void clickFavouriteAnnouncement() throws InterruptedException
	{
		webActions.click(favouriteObjects.favouriteAnnouncement, "Clicking on announcement option under favourites");
	}
	
	public void clickFavouriteSaveAll() throws InterruptedException
	{
		webActions.click(favouriteObjects.favouriteSaveAll, "Clicking on save all under favourites");
	}
	
	public void clickOkDialogBox() throws InterruptedException
	{
		webActions.click(favouriteObjects.okDialogBox, "Click on Ok dialog box");
	}

	public void clickfavouriteMenu() throws InterruptedException
	{
		webActions.click(favouriteObjects.favouriteMenu, "Click on favorite menu");
		webActions.isDisplayed(favouriteObjects.favouriteMenuWelcome, "Display welcome under favorite menu");
//		webActions.isDisplayed(favouriteObjects.favouriteMenuWelcome, "Display welcome under favorite menu");
//		webActions.isDisplayed(favouriteObjects.favouriteMenuWelcome, "Display welcome under favorite menu");
	}
	
	
	
	
	
}
