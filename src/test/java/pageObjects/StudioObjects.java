package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudioObjects {

	@FindBy(xpath = "//a[contains(text(), 'Studio')]")
    public WebElement studioOptn;
	
	@FindBy(xpath = "//div[@class='pngIcon ng-scope settings-icon icon-settings']")
    public WebElement settingsOptn;

	@FindBy(xpath = "//li[contains(text(),'Site Settings')]")
    public WebElement siteSettings;
	
	@FindBy(xpath = "//li[contains(text(),'Role Based Access Control (RBAC)')]")
    public WebElement rbacSettings;

	@FindBy(xpath = "//li[contains(text(),'Navigation')]")
    public WebElement navigation;
	
	@FindBy(xpath = "//li[contains(text(),'Landing Pages')]")
    public WebElement landingPages;
	
	@FindBy(xpath = "//li[contains(text(),'Workflow')]")
    public WebElement workflow;
	
	@FindBy(xpath = "//li[contains(text(),'Studio Access Control')]")
    public WebElement studioAccessControl;
	
	@FindBy(xpath = "//button[contains(text(),'Add Admin')]")
    public WebElement addStudioAdmin;
	
	@FindBy(xpath = "//div[@class='dropdown pull-right ng-scope']//button[@id='dropdownMenu1']")
    public WebElement addMenuBuilder;
	
	@FindBy(xpath = "//ul[contains(@class,'sepraterdropdown pageoption topArrow')]//a[contains(text(),'Menu Item')]")
    public WebElement addMenuItem;
	
	@FindBy(xpath = "//a[contains(text(),'Pages')]")
    public WebElement menuItemPages;
	
	
	@FindBy(xpath = "//a[contains(text(),'Apps')]")
    public WebElement menuItemApps;
	
	@FindBy(xpath = "//div[@class='font16 proximaSemiBoldFont menuTitle ng-binding'][contains(text(),'MessageModule')]")
    public WebElement selectApps;
	
	@FindBy(xpath = "//div[contains(@class,'modal-footer')]//button[contains(@class,'btn primary-btn')][contains(text(),'Add')]")
    public WebElement addSelectedApp;
	
	@FindBy(xpath = "//span[contains(text(),'MessageModule')]")
    public WebElement selectedAppDisplay;
	
	@FindBy(xpath = "//div[@class='col-md-12']//div[3]//div[1]//label[1]//div[1]")
    public WebElement showOnMobileApp;
	
	@FindBy(xpath = "//div[@class='col-md-6']//div[2]//div[1]//label[1]//div[1]")
    public WebElement hideOnNavigation;
	
	@FindBy(xpath = "//button[@class='btn primary-btn ng-scope']")
    public WebElement saveMenuBuilder;
	
	@FindBy(xpath = "//div[@id='newMenuBuilderModal']//button[@class='btn btn-default'][contains(text(),'Cancel')]")
    public WebElement cancelMenuBuilder;
	
	@FindBy(xpath = "//div[@class='modal-dialog modalLarge']//button[@class='btn btn-default'][contains(text(),'Cancel')]")
    public WebElement cancelRBAC;
	
	@FindBy(xpath = "//button[@class='btn btn-primary boxradius popBtns']")
    public WebElement okMenuStructureDialogBox;
	
	@FindBy(xpath = "//span[contains(text(),'AllUsers')]")
    public WebElement allUsers;
	
	@FindBy(xpath = "//span[contains(text(),'MessageModule')]/following-sibling::div/span[2]/div/label/input")
    public WebElement automationTestRead;
	
	@FindBy(xpath = "//a[@class='menu-item cursorPointer ng-scope highlightNav active']")
    public WebElement hoverOverElement;
	
	@FindBy(xpath = "//span[contains(text(),'MessageModule')]")
    public WebElement searchAutomationTest;
	
	@FindBy(xpath = "//a[contains(text(),'External Link')]")
    public WebElement externalLink;
	
	@FindBy(xpath = "//span[contains(text(),'New Link')]")
    public WebElement newLink;

	@FindBy(xpath = "//input[@id='menuItemName']")
    public WebElement enterNewLinkName;
	
	@FindBy(xpath = "//input[@id='menuItemUrl']")
    public WebElement enterPathLink;
	
	@FindBy(xpath = "//span[contains(text(),'Automation Link')]/following-sibling::div/span[2]/div/label/input")
    public WebElement automationTestLink;
	
	@FindBy(xpath = "//ul[@id='menu-block']//a[@title='Automation Link']")
    public WebElement searchAutomationLink;
	
	@FindBy(xpath = "//ul[contains(@class,'sepraterdropdown pageoption topArrow')]//a[contains(text(),'Group')]")
    public WebElement group;
	
	@FindBy(xpath = "//span[contains(text(),'New Group')]")
    public WebElement newGroup;
	
	@FindBy(xpath = "//div[@class='dropdown pull-right open']//button[@id='dropdownMenu1']")
    public WebElement addInGroup;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown pull-right open')]//a[contains(text(),'Menu Item')]")
    public WebElement addMenuItemInGroup;
	
	@FindBy(xpath = "//a[contains(text(),'Pages')]")
    public WebElement selectPages;
	
	@FindBy(xpath = "//div[@class='font16 proximaSemiBoldFont menuTitle ng-binding'][contains(text(),'Our Team')]")
    public WebElement ourTeamPage;
	
	@FindBy(xpath = "//div[@class='font16 proximaSemiBoldFont menuTitle ng-binding'][contains(text(),'3 Column')]")
    public WebElement columnPage;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-angle-right font20 fontBold')]")
    public WebElement arrowAutomationGroup;
	
	@FindBy(xpath = "//span[contains(text(),'3 Column')]/following-sibling::div/span[2]/div/label/input")
    public WebElement readColumn;
	
	@FindBy(xpath = "//span[contains(text(),'Our Team')]/following-sibling::div/span[2]/div/label/input")
    public WebElement readOurTeam;
	
	@FindBy(xpath = "//div[contains(@class,'col-md-6')]//div[2]//div[1]//label[1]//div[1]")
    public WebElement mobileChkboxGroup;
	
	@FindBy(xpath = "//div[@class='dropdown pull-right open']//button[@id='dropdownMenu1']")
    public WebElement addInNewGroup;

	@FindBy(xpath = "//ul[@id='menu-block']//a[@title='Automation Group']")
    public WebElement searchAutomationGroup;

	@FindBy(xpath = "//ul[@id='menu-block']//a[@title='3 Column']")
    public WebElement displayColumnGroup;
	
	@FindBy(xpath = "//ul[@id='menu-block']//a[@title='Our Team']")
    public WebElement displayOurTeamGroup;
	
//	@FindBy(xpath = "//body[@class='hold-transition sidebar-mini proximaFont ng-scope']/div[@class='bodywrapper']/div[@class='wrapper applicationpage']/div[@class='apppagecontainer']/div[@id='content']/div[@class='navbar navbar-default ng-scope']/div[@class='container-fluid']/div[@class='navbar-header']/ul[@class='pull-right topDcoicon']/li[3]/a[1]")
	@FindBy(xpath = "//img[@id='Notification']")
	public WebElement notification;
	
	@FindBy(xpath = "//div[@id= 'appContent']/h1[text()= 'Notification']")
    public WebElement assertNotification;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter user email')]")
    public WebElement enterUserAdminEmail;
	
	@FindBy(xpath = "//button[@id='srchbtn']")
    public WebElement addAdminEmail;
	
	@FindBy(xpath = "//a[contains(text(),'Site features')]")
    public WebElement siteFeatures;

	@FindBy(xpath = "//label[contains(text(),'Favorites Menu')]/following-sibling::label")
    public WebElement favoriteSiteFeatures;
	
}
