package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserGroupObjects {

	@FindBy(xpath = "//div[@class='pngIcon ng-scope usergroup-icon icon-UsersGroups_icon']")
    public WebElement userGroupIcon;
	
	@FindBy(xpath = "//li[@class='content-menu-item']")
    public WebElement groups;
	
	@FindBy(xpath = "//button[@class='btn primary-btn btnPrimaryBorder pull-right ng-scope']")
    public WebElement addGroup;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement enterGroupName;
	
	@FindBy(xpath = "//span[contains(text(),'Search Users/Groups')]")
    public WebElement searchUserGroup;

	@FindBy(xpath = "//input[@id='userAndGroupSearch']")
    public WebElement searchUserID;
	
	@FindBy(xpath = "//input[@id='userAndGroupSearch']/following-sibling::span")
    public WebElement searchButton;
	
	@FindBy(xpath = "//span[@class='searchaddUserList pull-right cmsColor cursorPointer marginLeft5px marginRight5px ng-scope']")
    public WebElement addUserID;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']")
    public WebElement enterDescription;
	
	@FindBy(xpath = "//span[@class='font18 paddingTop10px cursorPointer displayInline ng-scope primary-text']")
    public WebElement done;
	
	@FindBy(xpath = "//div[@id='groupsManagementModal']//button[@class='btn btn-default'][contains(text(),'Cancel')]")
    public WebElement cancel;
	
	@FindBy(xpath = "//div[contains(text(),'Automation User Group')]/following-sibling::div[@class='cmsdisplayTableCell col-md-1 text-center']//span")
    public WebElement settings;
	
	@FindBy(xpath = "//div[contains(@class,'cmsdisplayTableCell col-md-1 text-center open')]//a[contains(text(),'View')]")
    public WebElement view;
	
	@FindBy(xpath = "//span[contains(text(),'Steve Rogers')]")
    public WebElement displayView;
	
	@FindBy(xpath = "//li[@class='ng-scope']//a[contains(text(),'Edit')]")
    public WebElement edit;
	
	@FindBy(xpath = "//span[@class='font18 paddingTop10px cursorPointer displayInline ng-scope primary-text']")
    public WebElement update;

	@FindBy(xpath = "//div[contains(text(),'Group Updated.')]")
    public WebElement groupUpdate;
	
	@FindBy(xpath = "//li[@class='ng-scope']//a[contains(text(),'Delete')]")
    public WebElement delete;
	
	@FindBy(xpath = "//div[contains(text(),'This group will be deleted and will no longer be a')]")
    public WebElement deleteDialog;
	
	@FindBy(xpath = "//button[contains(@class,'btn primary-btn btn-success boxradius marginleft30px popBtns')]")
    public WebElement deleteDeleteDialog;
	
	
	
	
	
}
