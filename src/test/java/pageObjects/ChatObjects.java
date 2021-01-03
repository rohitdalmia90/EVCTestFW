package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatObjects {

	@FindBy(xpath = "//div[@class='userImageIcon small positionRelative ng-scope']//img")
    public WebElement chatIcon;

	@FindBy(xpath = "//a[@id='resChat']")
    public WebElement resChat;
	
	@FindBy(xpath = "//a[contains(text(),'Chat Rooms')]")
    public WebElement chatRooms;
	
	@FindBy(xpath = "//input[@id='chatsearchinput']")
    public WebElement searchNewConnection;
	
	@FindBy(xpath = "//div[@class='input-group itemsearch marginTop10px']/span/button/img")
    public WebElement searchIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Steve Rogers')]")
    public WebElement assertSearch;
	
	@FindBy(xpath = "//chatuseritem[@class='ng-scope ng-isolate-scope']//span[@class='iconCircle ng-scope']")
    public WebElement addConnection;
	
	@FindBy(xpath = "//h4[contains(text(),'8 connection requests')]")
    public WebElement connectionRequest;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
    public WebElement confirmRequest;
	
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
    public WebElement rejectRequest;
	
	@FindBy(xpath = "//span[@class='iconCircle ng-scope']")
    public WebElement declineOwnRequest;
	
	@FindBy(xpath = "//div[@class='chatTilesDetail']//div[contains(text(),'Test User')]")
    public WebElement assertRequesterAdded;
	
	@FindBy(xpath = "//span[@class='whiteTextColor text-uppercase fontSize18 proximaSemiBoldFont ng-binding'and @title='Steve Rogers']")
    public WebElement acceptanceChatIcon;
	
	@FindBy(xpath = "//div[@class='firstName userName colorDark proximaSemiBoldFont ng-binding'][contains(text(),'Bruce Banner')]")
    public WebElement individualChat;
	
	@FindBy(xpath = "//div[@class='firstName userName colorDark proximaSemiBoldFont ng-binding'][contains(text(),'Steve Rogers')]")
    public WebElement blockIndividualChat;
	
	@FindBy(xpath = "//span[@class='diplayFlex closeChat']")
    public WebElement closeChat;
	
	@FindBy(xpath = "//div[@id='individalChatContainer']//span[2]")
    public WebElement minChat;
	
	@FindBy(xpath = "//span[@ng-click='blockUser();']")
    public WebElement blockUserPopup;
	
	@FindBy(xpath = "//button[@ng-click='submitBlockUser();']")
    public WebElement submitBlockUser;
	
	@FindBy(xpath = "//button[@ng-click='submitBlockAndReportUser();']")
    public WebElement submitBlockAndReportUser;
	
	@FindBy(xpath = "//button[@ng-click='cancelBlockUser();']")
    public WebElement cancelBlockUser;
	
	@FindBy(xpath = "//button[@class='btn btn-primary boxradius popBtns']")
    public WebElement okBlockUser;
	
	@FindBy(xpath = "//div[contains(text(),'Block Individual Users')]/following-sibling::div")
    public WebElement unblockUser;
	
	@FindBy(xpath = "//h4[contains(text(),'Manage blocked users')]")
    public WebElement manageBlockedUsers;
	
	@FindBy(xpath = "//div[contains(text(),'cap@txstage.unifyed.com')]/deletewaste-icon")
    public WebElement deleteBlockUser;
	
	@FindBy(xpath = "//button[@ng-click='saveAll()']")
    public WebElement saveAllUnblocked;
	
	@FindBy(xpath = "//input[@id='blockupsersearchinput']")
    public WebElement searchBlockUserfromPreferences;
	
	@FindBy(xpath = "//span[@ng-click='addBlockedUser(user);']")
    public WebElement addBlockUserPreferences;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
    public WebElement yesBlockUserPreferences;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
    public WebElement okBlockUserPreferences;
	
	@FindBy(xpath = "//div[contains(text(),'Loading...')]")
    public WebElement assertBlockconnection;
	
	@FindBy(xpath = "//span[@title='Create new chat group']")
    public WebElement editNewChatGroup;
	
	@FindBy(xpath = "//button[contains(text(),'Choose Image')]")
    public WebElement chooseImage;
	
	@FindBy(xpath = "//div[@id='mCSB_2_container']//div[@class='galleryIcon']//div[@id='appIcon2']")
    public WebElement chooseImageIcon;
	
	@FindBy(xpath = "//button[@class='btn pull-right primary-btn'][contains(text(),'Save')]")
    public WebElement saveChooseIcon;
	
	@FindBy(xpath = "//input[@ng-model='newgroup.name']")
    public WebElement enterGroupName;
	
	@FindBy(xpath = "//span[@class='iconCircle ng-scope']")
    public WebElement addConnectionGroupChat;
	
	@FindBy(xpath = "//button[@ng-click='createChatGroupSubmit();']")
    public WebElement submitNewChatGroup;
	
	@FindBy(xpath = "//div[contains(text(),'Chat Automation')]")
    public WebElement automationChatGroup;
	
	@FindBy(xpath = "//span[@ng-show='isParticipantAdded(connection.user);']")
    public WebElement assertAddConnectionGroupChat;
	
	//button[contains(text(),'Create')]
	
	
	
	
	
}
