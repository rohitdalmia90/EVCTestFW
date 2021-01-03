package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessageModuleObjects {


	@FindBy(xpath = "//input[@id='searchBox']")
    public WebElement searchBox;
	
	@FindBy(xpath = "//span[contains(text(),'MessageModule')]")
    public WebElement messageModule;
	
	@FindBy(xpath = "//h1[contains(text(),'MessageModule')]")
    public WebElement assertMessageModule;
	
	@FindBy(xpath = "//button[@class='btn btn-small btn-primary ng-scope' and contains(text(),'+ Create')]")
    public WebElement assertCreateButton;
	
	@FindBy(xpath = "//button[@class='btn btn-small btn-primary ng-binding ng-scope' and contains(text(),'Next')]")
    public WebElement nextButton;
	
	@FindBy(xpath = "//div[contains(text(),'Select at least one User Group or a user .')]")
    public WebElement assertNextPopup;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
    public WebElement okNextPopup;

	@FindBy(xpath = "//div[contains(text(),'Manage Message Permissions')]/following-sibling::div[contains(text(),'Manage')]")
    public WebElement mangeMessagePermission;
	
	@FindBy(xpath = "//h3[contains(text(),'AllUsers')]/following-sibling::button")
    public WebElement allUserUnderManage;
	
	@FindBy(xpath = "//div[@class='slider sliderCircle round']")
    public WebElement preferncesToggle;
	
	@FindBy(xpath = "//label[@class='switch switchCircle colPadding']//input[@type='checkbox']")
    public WebElement toggleSelectedCheck;
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right btm-btn']")
    public WebElement saveManagePermissions;
	
	@FindBy(xpath = "//div[@id='dropdownGroupLink']")
    public WebElement selectUserGroup;
	
	@FindBy(xpath = "//div[contains(text(),'Please Add a Group From Messaging Admin')]")
    public WebElement noUserFound;
	
	@FindBy(xpath = "//label[contains(text(),'AllUsers')]")
    public WebElement selectAllUser;
	
	@FindBy(xpath = "//li[@class='control control--checkbox deliverChannel ng-scope']//label/img[@alt='Connect Post icon']")
    public WebElement connectPostIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Select tags for connect post.')]")
    public WebElement assertConnectPostPopup;
	
	@FindBy(xpath = "//li[@class='control control--checkbox deliverChannel ng-scope']//label/img[@alt='Email icon']")
    public WebElement emailIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Enter subject for the post.')]")
    public WebElement assertEmailPostPopup;
	
	@FindBy(xpath = "//li[@class='control control--checkbox deliverChannel ng-scope']//label/img[@alt='Push Notification icon']")
    public WebElement pushNotificationIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Enter title for the post.')]")
    public WebElement assertPushNotificationPopup;
	
	@FindBy(xpath = "//li[@class='control control--checkbox deliverChannel ng-scope']//label/img[@alt='SMS icon']")
    public WebElement smsIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Enter message for the post.')]")
    public WebElement assertSMSPopup;
	
	@FindBy(xpath = "//li[@class='borderNone']//div[@class='control-group']//div[@class='control__indicator']")
    public WebElement allTag;
	
	@FindBy(xpath = "//div[contains(text(),'Enter message or upload media for the post.')]")
    public WebElement assertMsgConnectPost;
	
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
    public WebElement enterMailTitle;
	
	@FindBy(xpath = "//div[contains(text(),'Enter message for the post.')]")
    public WebElement assertMailMsgPost;

	@FindBy(xpath = "//textarea[@ng-change='descriptionChange()']")
    public WebElement connectMsgPost;
	
	@FindBy(xpath = "//span[@class='cursorPointer']")
    public WebElement editMsgIcon;
	
	@FindBy(xpath = "//textarea[@id='connectMessage']")
    public WebElement updateMsg;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveMsg;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
    public WebElement cancelMsg;
	
	@FindBy(xpath = "//button[contains(text(),'Save as template')]")
    public WebElement saveAsTemplate;
	
	@FindBy(xpath = "//button[@class='btn btn-small btn-primary ng-binding ng-scope' and contains(text(),'PUBLISH')]")
    public WebElement publish;
	
	@FindBy(xpath = "//a[@class='dockicons cursorPointer']//span[@class='dockiconsInner']//img[@class='dock-menu-icon']")
    public WebElement notifications;
	
	@FindBy(xpath = "//h4[contains(text(),'LowPriorityNoAcknowledgement')]")
    public WebElement assertLowPriorityNoAcknowledgement;
	
	@FindBy(xpath = "//button[@class='btn btn-primary ng-scope' and contains(text(),'Skip')]")
    public WebElement skip;
	
	@FindBy(xpath = "//button[@class='btn btn-primary' and contains(text(),'Acknowledge')]")
    public WebElement acknowledge;
	
	@FindBy(xpath = "//span[@class='pull-left ng-binding'][contains(text(),'No')]")
    public WebElement selectAcknowledge;
	
	@FindBy(xpath = "//a[contains(text(),'Yes')]")
    public WebElement setYesacknowledge;
	
	@FindBy(xpath = "//span[contains(text(),'Select app')]")
    public WebElement selectApp;
	
	@FindBy(xpath = "//div[contains(text(),'Unifyed Connect')]")
    public WebElement selectUnifyedConnect;
	
	@FindBy(xpath = "//h1[@class='hidden-xs-hidden-sm fontSize24 app-title padding20px15px ng-binding ng-scope']")
    public WebElement assertSelectedApp;
	
	@FindBy(xpath = "//div[@class='dropdown borderRadius4 open']//button[@id='dropdownMenu1']")
    public WebElement priorityDropdown;
	
	@FindBy(xpath = "//a[contains(text(),'High')]")
    public WebElement highPriority;
	
	@FindBy(xpath = "//img[@class='filledIcon24 pull-right focusTranspatent']")
    public WebElement imageIcon;
	
	
	
	
	
}
