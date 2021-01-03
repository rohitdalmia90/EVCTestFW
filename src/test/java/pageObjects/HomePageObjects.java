package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageObjects {
	
		//Homepage elements objects
		@FindBy(id= "toggleCollapse")
		public WebElement hamburgerIcon;
		
		@FindBy(xpath= "//img[@class= 'logo tenantbig']")
		public WebElement tenantBigLogo;
		
		@FindBy(xpath = "//a[@type= 'button' and @data-toggle= 'dropdown']")
	    public WebElement profileOtnsDropDown;
		
		@FindBy(xpath = "//a[contains(text(), ' Preferences')]")
	    public WebElement preferencesOptn;
	    
		@FindBy(xpath = "//a[contains(text(), ' Your Profile')]")
	    public WebElement yurProfileOptn;
	    
		@FindBy(xpath = "//a[contains(text(), ' Studio')]")
	    public WebElement studioOptn;
		
		@FindBy(xpath = "//a[@href= '/logout']")
	    public WebElement logOutOptn;
		
		
		
		//Profile page elements objects
		@FindBy(xpath = "//h1[contains(text(), 'Profile')]")
	    public List<WebElement> profileText;
	    
	    @FindBy(xpath = "//span[contains(text(), 'EDIT')]")
	    public List<WebElement> editBtn;
	    
	    
	    
	    //Preferences page elements objects
	    @FindBy(xpath = "//div[contains(text(), 'Connect')]")
	    public List<WebElement> connectText;
	    
	    @FindBy(xpath = "//div[contains(text(), 'Messaging')]")
	    public List<WebElement> messagingText;
		
	    
	    
		//Left navigation bar elements objects
		@FindBy(id = "sidebar")
		public WebElement sideBar;
		
		@FindBy(id = "searchBox")
		public WebElement searchField;
		
		@FindBy(xpath = "//nav[@id='sidebar']/ul[1]/li[@class= 'panel ng-scope']")
		public List<WebElement> allLeftNavOptions ; 
		
		@FindBy(how = How.XPATH, xpath = "//div[contains(@class, 'jconfirm-box-container')]//button[contains(text(), 'OK')]")
		public List<WebElement> jsDialogueOkBtnList;
		
		@FindBy(how = How.XPATH, xpath = "//div[contains(@class, 'jconfirm-box-container')]//button[contains(text(), 'OK')]")
		public WebElement jsDialogueOkBtn;
		
		@FindBy(xpath = "//nav[@id='sidebar']/ul[1]/li/ul/li")
		public WebElement leftNavSubOptions;
		
		@FindBy(xpath = "//nav[@id='sidebar']/ul[1]/li/a/span")
		public WebElement allLeftNavOptionsTitle;
		
		@FindBy(xpath = "//div[@id= 'appContent']/h1")
		public WebElement pageHeading;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'Password')]")
		public WebElement pswrdInSrchReslt;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'Connect')]")
		public WebElement connectInSearchResult;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/ul[1]/li/a[contains(text(), 'Connect')]")
		public WebElement connectInSearchResultChild;
		
		@FindBy(xpath = "//div[@id= 'dropdownMenu1' and @type= 'button']/span[contains(text(), 'Your Preferences')]")
		public WebElement yourPrefrencesFiltrOptn;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'MessageModule')]")
		public List<WebElement> msgInSearchToVerify;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'MessageModule')]")
		public WebElement msgInSearchResult;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'Messaging')]")
		public WebElement msgInSearchResult_UVI;
		
		@FindBy (xpath = "//button[contains(text(),'+ Create')]")
		public List<WebElement> createMessageBtn;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'Social Networking')]")
		public WebElement socialNetworkingInSrchReslt;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'Social Media')]")
		public WebElement socialMediaInSrchReslt;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//li/a/span[contains(text(), 'Social Media')]/parent:: a/following-sibling::ul/li")
		public WebElement socialMediaChildReslt;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a[contains(text(), 'Facebook')]")
		public WebElement facebookInNavBar;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/ul[1]/li/a[contains(text(), 'Facebook')]")
		public WebElement facebookInNavBarChild;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a[contains(text(), 'Instagram')]")
		public WebElement instagramInNavBar;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/ul[1]/li/a[contains(text(), 'Instagram')]")
		public WebElement instagramInNavBarChild;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a[contains(text(), 'Twitter')]")
		public WebElement twitterInNavBar;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/ul[1]/li/a[contains(text(), 'Twitter')]")
		public WebElement twitterInNavBarChild;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a[contains(text(), 'YouTube')]")
		public WebElement youtubeInNavBar;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/ul[1]/li/a[contains(text(), 'YouTube')]")
		public WebElement youtubeInNavBarChild;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a[contains(text(), 'LinkedIn')]")
		public WebElement linkedInInNavBar;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/ul[1]/li/a[contains(text(), 'LinkedIn')]")
		public WebElement linkedInInNavBarChild;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a[contains(text(), 'Videos')]")
		public WebElement videoInNavBar;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a/span[contains(text(), 'Videos')]")
		public WebElement videoInNavBarSpan;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/ul[1]/li/a[contains(text(), 'Videos')]")
		public WebElement videoInInNavBarChild;
		
		@FindBy(xpath = "//h1[contains(text(), 'Videos')]")
		public WebElement videosHeadline;
		
		@FindBy(xpath = "//video[contains(@class, 'video')]")
		public List<WebElement> videosOnPage;
		
		@FindBy(xpath = "//h1[contains(text(), 'Home')]")
		public List<WebElement> homeHeading;
		
		@FindBy(xpath = "//h1[contains(text(), 'Welcome')]")
		public List<WebElement> welcomeHeading;
		
		@FindBy(xpath = "//h1[contains(text(), 'Dashboard')]")
		public List<WebElement> dashboardHeading;
		
		@FindBy(xpath = "//h1[contains(text(), 'Connect')]")
		public List<WebElement> connectHeading;
		
		@FindBy(xpath = "//h1[contains(text(), '403 - Permission Denied')]")
		public List<WebElement> error403 ; 
		
		@FindBy(xpath = "//p[contains(text(), 'You do not have permission to retrieve the URL or link you requested')]")
		public List<WebElement> permissionError ; 
		
		@FindBy(xpath = "//nav[@id= 'sidebar']/ul[1]/li/a/span[contains(text(), 'Social Networking')]")
		public List<WebElement> optnSocialNetworking;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']/ul[1]/li/a/span[contains(text(), 'Maps')]")
		public List<WebElement> optnMaps;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']/ul[1]/li/ul[1]/li/a[contains(text(), 'Connect')]")
		public List<WebElement> subOptnConnect;
		
		@FindBy(xpath = "//nav[@id= 'sidebar']/ul[1]/li/a/span[contains(text(), 'Connect')]")
		public List<WebElement> optnConnect;

}
