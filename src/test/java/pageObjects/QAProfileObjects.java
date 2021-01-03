package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QAProfileObjects {

	@FindBy(xpath = "//a[contains(text(), 'Profile')]")
    public WebElement profileOptn;
	
	@FindBy(xpath = "//h1[contains(text(), 'Announcement Test#2')]")
    public WebElement announcementHeading;
	
	@FindBy(xpath = "//span[@class='hidden-xs displayTableCell user-profile-name verticalAlignMiddle ng-binding' and contains(text(), 'Test')]")
    public WebElement profileDropDown;
	
	@FindBy(xpath = "//span[contains(text(), 'EDIT')]")
    public WebElement editClick;
	
	@FindBy(xpath = "//div[@class='camera-container']")
    public WebElement cameraContainer;

	@FindBy(xpath = "//button[text() = 'Crop Image']")
    public WebElement cropImage;
	
	@FindBy(xpath = "//span[text() = 'SAVE ALL']")
    public WebElement saveAll;
	
	@FindBy(xpath = "//a[text()= ' Preferences']")
    public WebElement preferences;
	
	@FindBy(xpath = "//h1[text()= 'Rbac setting']")
    public WebElement rbacSetting;
	
	@FindBy(xpath = "(//div[@class='col-lg-3 col-md-3 col-xs-3 text-right pl-0'])[1]//div[@class='slider sliderCircle round']")
    public WebElement updateProfileImageButton;
	
	@FindBy(xpath = "//button[@ng-click='saveAll()']")
    public WebElement preferenceSaveAll;
	
	@FindBy(xpath = "//span[text() = 'CANCEL']")
    public WebElement cancel;

	@FindBy(xpath = "//div[@class='col-sm-6 hidden-xs contentEllipsis ng-binding'][contains(text(),'ATHLETICS')]/following-sibling::div/label/div")
    public WebElement athleticsInterests;
	
	@FindBy(xpath = "//div[@class='col-sm-6 hidden-xs contentEllipsis ng-binding'][contains(text(),'ACADEMICS')]/following-sibling::div/label/div")
    public WebElement academicsInterests;
	
	@FindBy(xpath = "//div[@class='col-sm-6 hidden-xs contentEllipsis ng-binding'][contains(text(),'CLUBS')]/following-sibling::div/label/div")
    public WebElement clubsInterests;
	
	@FindBy(xpath = "//section[@class='content clearfix']//div[3]//div[1]//div[2]")
    public WebElement manageCategories;

	@FindBy(xpath = "//div[@class='btn btn-primary-bordered createRight']")
    public WebElement createCategories;

	@FindBy(xpath = "//*[@id=\"appContent\"]/div/div[2]/form/input")
    public WebElement enterCategoryName;
	
	@FindBy(xpath = "//button[contains(text(), 'Save')]")
    public WebElement saveCategory;
	
	@FindBy(xpath = "//div[contains(text(),'Automation test')]")
    public WebElement categoryCheck;
	
	@FindBy(xpath = "//span[text()= 'WELCOME']")
    public WebElement ftuLoginPage;

	@FindBy(xpath = "(//div[@class= 'pull-left fontSize15 ng-binding'])[1]")
    public WebElement ftuCategorySelection;

	@FindBy(xpath = "//div[text() ='DONE ']")
    public WebElement selectionDone;
	
	@FindBy(xpath = "//div[@class='proximaFont manageCategory_main lg_webAppletContentPadding ng-scope']//div[@aria-label='ACADEMICS']//div[@aria-label='next icon']")
    public WebElement editAcademicsCategory;
	
	@FindBy(xpath = "//input[@id='audienceSearchText']")
    public WebElement connectAudiences;
	
	@FindBy(xpath = "//label[@class='control control--checkbox fontNormal ng-binding']//div[@class='control__indicator']")
    public WebElement selectAudiences;
	
	@FindBy(xpath = "//label[@class='pull-right switch switchCircle colPadding']//div[@class='slider sliderCircle round']")
    public WebElement optIn;
	
	@FindBy(xpath = "//input[@name='terms']")
    public WebElement termsCheckbox;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    public WebElement acceptTerms;
	
	@FindBy(xpath = "//div[@aria-label='ACADEMICS ']")
    public WebElement ftuAcademics;
	
	@FindBy(xpath = "//div[@aria-label='done button ']")
    public WebElement ftuDone;

	@FindBy(xpath = "//span[@class='pull-right fontSize18 fa fa-lock themeColor']")
    public WebElement unLock;
	
	@FindBy(xpath = "//span[@class='pull-right fontSize18 fa fa-lock unlock']")
    public WebElement lock;
	
	
}
