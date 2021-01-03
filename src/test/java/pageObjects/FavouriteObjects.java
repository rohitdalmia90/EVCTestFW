package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavouriteObjects {

	@FindBy(xpath = "//div[contains(text(),'Manage Favorites')]/following-sibling::div")
    public WebElement manageFavourite;
	
	@FindBy(xpath = "//span[contains(@class,'innertitle focusTransparent ng-binding')][contains(text(),'Welcome')]/following-sibling::label")
    public WebElement favouriteWelcome;
	
	@FindBy(xpath = "//span[contains(@class,'innertitle focusTransparent ng-binding')][contains(text(),'Photos')]/following-sibling::label")
    public WebElement favouritePhotos;
	
	@FindBy(xpath = "//span[contains(@class,'innertitle focusTransparent ng-binding')][contains(text(),'Announcement')]/following-sibling::label")
    public WebElement favouriteAnnouncement;
	
	@FindBy(xpath = "//div[contains(@class,'marginBottom15px focusTransparent')]")
    public WebElement favouriteSaveAll;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary boxradius popBtns')]")
    public WebElement okDialogBox;
	
	@FindBy(xpath = "//ul[@id='menu-block']//a[@title='Favorites']")
    public WebElement favouriteMenu;

	@FindBy(xpath = "//span[contains(text(),'Welcome')]")
    public WebElement favouriteMenuWelcome;
	
}
