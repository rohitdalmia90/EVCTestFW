package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnifyedGroupObjects {

	@FindBy(xpath = "//span[contains(text(),'Unifyed Groups')]")
    public WebElement unifyedGroupIcon;
	
	@FindBy(xpath = "//div[@class='textEclips themeColor']")
    public WebElement createNewGroup;
	
	@FindBy(xpath = "//div[contains(text(),'Athletics / Recreational')]")
    public WebElement athletics;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
    public WebElement nextButton;
	
	@FindBy(xpath = "//div[@id='privacyU']//div[@class='selectePrivacyType innerGap']//span[1]")
    public WebElement publicPrivacy;
	
	@FindBy(xpath = "//input[@id='groupName']")
    public WebElement groupName;

	@FindBy(xpath = "//textarea[@id='groupDescription']")
    public WebElement groupDescription;
	
	@FindBy(xpath = "//span[@class='ng-binding ng-scope'][contains(text(),'Create')]")
    public WebElement createButton;
	
	@FindBy(xpath = "//div[@id='privacyP']//div[@class='selectePrivacyType innerGap']//span[1]")
    public WebElement privatePrivacy;
	
	@FindBy(xpath = "//div[@id='privacyR']//div[@class='selectePrivacyType innerGap']//span[1]")
    public WebElement restrictedPrivacy;

	@FindBy(xpath = "//button[@id='shortData']")
    public WebElement selectGroup;

	@FindBy(xpath = "//label[contains(text(),'AllUsers')]")
    public WebElement selectAllUsers;

	@FindBy(xpath = "//span[@id='dropdownGroupManage0']")
    public WebElement groupabcIcon;

	@FindBy(xpath = "//div[@class='groupCardInner open']//a[contains(text(),'View Group Info')]")
    public WebElement viewGroupInfo;
	
	@FindBy(xpath = "//h4[contains(text(),'group Information - abc')]")
    public WebElement groupInformation;

	@FindBy(xpath = "//div[@class='modal-dialog modal-lg']//button[@class='btn btn-default'][contains(text(),'Close')]")
    public WebElement closeBtn;
	
	@FindBy(xpath = "//div[@class='groupCardInner open']//a[contains(text(),'Explore Group')]")
    public WebElement exploreGroup;
	
	@FindBy(xpath = "//div[@class='row ng-scope']//li[2]//span")
    public WebElement explorePublicGroup;
	
	@FindBy(xpath = "//h2[@class='ng-binding']")
    public WebElement exploreGroupName;
	
	@FindBy(xpath = "//div[@class='groupCardInner open']//a[contains(text(),'Leave Group')]")
    public WebElement leaveGroup;
	
	@FindBy(xpath = "//div[contains(text(),\"Are you sure you want to leave abc group\")]")
    public WebElement leaveGroupDialogueBox;
	
	@FindBy(xpath = "//button[@class='btn btn-cancel boxradius popBtns']")
    public WebElement noDialogueBox;
	
	@FindBy(xpath = "//div[@class='groupCardInner open']//a[contains(text(),'Edit Group')]")
    public WebElement editGroup;
	
	@FindBy(xpath = "//span[contains(text(),'Update')]")
    public WebElement updateButton;
	
	@FindBy(xpath = "//div[@class='groupCardInner open']//a[@class='ng-binding'][contains(text(),'Hide Group Info')]")
    public WebElement hideGroupInfo;
	
	@FindBy(xpath = "//h2[@class='ng-binding']")
    public WebElement assertHideGroup;
	
	@FindBy(xpath = "//div[@class='groupCardInner open']//a[@class='ng-binding'][contains(text(),'Show Group Info')]")
    public WebElement showGroupInfo;
	
	@FindBy(xpath = "//a[contains(text(),'abc')]")
    public WebElement groupABC;
	
	@FindBy(xpath = "//div[@class='sidebar-header text-center active tabFocusHighlighter cursorPointer']")
    public WebElement tx;

	@FindBy(xpath = "//span[@id='dropdownGroupManage2']")
    public WebElement restrictedDropdown;
	
	@FindBy(xpath = "//a[contains(text(),'View Invite Requests')]")
    public WebElement viewInviteRequest;
	
	@FindBy(xpath = "//h4[contains(text(),'Group Invites- AutoGroupRestricted')]")
    public WebElement assertGroupInvites;
	
	@FindBy(xpath = "//div[@id='inviteRequestModal']//button[@class='btn btn-default'][contains(text(),'Close')]")
    public WebElement closeGroupInvite;
	
	@FindBy(xpath = "//span[@id='dropdownGroupManage1']")
    public WebElement privateDropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Add Member(s)')]")
    public WebElement addMember;
	
	@FindBy(xpath = "//h4[contains(text(),'AutoGroupPrivate - Add Member(s)')]")
    public WebElement assertAddMember;
	
	@FindBy(xpath = "//div[contains(@class,'formGroup')]//input[@placeholder='Search']")
    public WebElement searchAddMember;
	
	@FindBy(xpath = "//div[contains(@class,'formGroup')]//img")
    public WebElement searchIcon;
	
	@FindBy(xpath = "//span[@class='pull-right']")
    public WebElement searchAdd;
	
	@FindBy(xpath = "//button[@id='sendInviteBtn']")
    public WebElement sendInvite;
	
	@FindBy(xpath = "//button[@class='btn']")
    public WebElement closeAddMember;
	
}
