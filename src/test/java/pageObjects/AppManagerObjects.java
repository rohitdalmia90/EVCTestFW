package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppManagerObjects {

	@FindBy(xpath = "//div[@class='pngIcon ng-scope appmanager-icon icon-app-manager']")
    public WebElement appManagerIcon;
	
	@FindBy(xpath = "//li[@class='content-menu-item']")
    public WebElement unifyedAppstore;

	@FindBy(xpath = "//div[@id='myapps']//div[2]//div[1]//div[3]//div[2]//button[1]")
    public WebElement saveSecondApp;
	
	@FindBy(xpath = "//button[@class='btn btn-primary boxradius popBtns']")
    public WebElement okAppSaved;

	@FindBy(xpath = "//div[@id='appStoreModal']//button[@class='btn btn-default'][contains(text(),'Cancel')]")
    public WebElement cancel;
	
	@FindBy(xpath = "//div[@class='btn-group btn-publish-group']//button[@class='btn primary-btn'][contains(text(),'Publish')]")
    public WebElement publish;
	
	@FindBy(xpath = "//span[text()='Global Publish']")
    public WebElement publishBox;
	
	@FindBy(xpath = "//button[@class='btn btn-cancel boxradius popBtns']")
    public WebElement noButton;
	
	@FindBy(xpath = "//a[contains(text(),'Custom')]")
    public WebElement customTab;
	
	@FindBy(xpath = "//button[@class='btn primary-btn ng-scope'][contains(text(),'Create New App')]")
    public WebElement createNewApp;
	
	@FindBy(xpath = "//div[@class='creatApp col-md-6 col-sm-12 ng-scope']//button[@class='btn primary-btn btnPrimaryBorder marginBottom10px'][contains(text(),'Choose Image')]")
    public WebElement chooseImage;
	
	@FindBy(xpath = "//div[@id='appIcon14']//img")
    public WebElement appIcon;
	
	@FindBy(xpath = "//button[@class='btn pull-right primary-btn']")
    public WebElement saveIcon;
	
	@FindBy(xpath = "//div[@class='creatApp col-md-6 col-sm-12 ng-scope']//div[@class='appForm']//div[1]//input")
    public WebElement enterAppName;
	
	//input[@class='form-control inputControll ng-pristine ng-valid ng-empty ng-touched']
	@FindBy(xpath = "//button[contains(text(),'Next')]")
    public WebElement nextButton;
	
	@FindBy(xpath = "//button[@class='btn primary-btn ng-scope'][contains(text(),'Add')]")
    public WebElement addButton;
	
}
