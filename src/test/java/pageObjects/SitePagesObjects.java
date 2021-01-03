package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SitePagesObjects {

	@FindBy(xpath = "//div[@class='cmssidbuttonlabel ng-binding'][contains(text(),'Sites & Pages')]")
    public WebElement sitesAndPages;

	@FindBy(xpath = "//button[@class='btn primary-btn studioPrimaryBorder ng-scope']")
    public WebElement createNew;
	
	@FindBy(xpath = "//a[@class='anchor-style']")
    public WebElement createPage;
	
	@FindBy(xpath = "//span[@class='page-component-label fontSize12 ng-binding ng-scope'][contains(text(),'Page URL')]")
    public WebElement pageLayout;
	
	@FindBy(xpath = "//div[text()='Add Page']")
    public WebElement addPage;
	
	@FindBy(xpath = "//div[@id='tree1']//span[text()='Page URL']/following-sibling::div")
    public WebElement setting;
	
	@FindBy(xpath = "//div[@id='tree1']//span[text()='Page URL']/following-sibling::div//li//a[text()='Edit Icon']")
    public WebElement editIcon;
	
	@FindBy(xpath = "//div[@id='editIconModal']//div[@class='modal-body']//div//div[3]")
    public WebElement icon;
	
	@FindBy(xpath = "//div[@id='editIconModal']//button[@class='btn primary-btn'][contains(text(),'Save')]")
    public WebElement saveEditIcon;
	
	@FindBy(xpath = "//div[@id='tree1']//span[text()='Page URL']/following-sibling::div//li//a[text()='Manage Page']")
    public WebElement managePage;
	
	@FindBy(xpath = "//div[@class='form-group']//input[@id='pagename']")
    public WebElement pageName;
	
	@FindBy(xpath = "//div[@id='openManagePageModal']//button[contains(@class,'primary-btn')][contains(text(),'Save')]")
    public WebElement saveManagePage;
	
	@FindBy(xpath = "//input[@id='pagehtmltitle']")
    public WebElement pageTitle;
	
	@FindBy(xpath = "//div[@class='dropdown dropdownMenuSelect borderNone dropdownTagList dropup open']//button[@class='btn btn-default dropdown-toggle']")
    public WebElement searchCategory;
	
	@FindBy(xpath = "//div[@id='openManagePageModal']//li[3]//div[@class='control__indicator']")
    public WebElement selectCategory;
	
	@FindBy(xpath = "//span[contains(text(),'Select or Create Tag')]")
    public WebElement clickSelectTag;
	
	@FindBy(xpath = "//div[@class='dropdown dropdownMenuSelect borderNone dropdownTagList searchPositionTop dropup open']//label[1]//div")
    public WebElement selectTag;
	
	@FindBy(xpath = "//button[@class='btn btn-primary boxradius popBtns']")
    public WebElement okPopUpManage;

	@FindBy(xpath = "//div[@id='openManagePageModal']//button[contains(@class,'btn-default')][contains(text(),'Close')]")
    public WebElement closeManagePage;
	
	@FindBy(xpath = "//div[@id='tree1']//span[text()='Page URL']/following-sibling::div//li//a[text()='Save As Template']")
    public WebElement saveAsTemplate;
	
	@FindBy(xpath = "//div[@id='saveAsTemplatePageModal']//input[@id='pagename']")
    public WebElement templateName;

	@FindBy(xpath = "//button[contains(text(),'Save As Template')]")
    public WebElement saveTemplateName;
	
	@FindBy(xpath = "//div[@id='tree1']//span[text()='Page URL']/following-sibling::div//li//a[text()='Delete']")
    public WebElement delete;
	
	@FindBy(xpath = "//div[@id='deletePageModal']//button[@class='btn primary-btn'][contains(text(),'Delete')]")
    public WebElement deleteDialogBox;
	
}
