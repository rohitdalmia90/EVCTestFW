package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageObjects {
	   	@FindBy(id = "username")
	    public WebElement usrNameField;
	   	
	   	@FindBy(id = "username1")
	    public WebElement usrName1Field;

	    @FindBy(id = "password")
	    public WebElement passwordField;

	    @FindBy(id = "submitButton")
	    public WebElement submitButton;
	    
	    @FindBy(xpath = "//input[@type = 'text']")
	    public WebElement usrName1FieldUTA;

	    @FindBy(xpath = "//input[@type = 'password']")
	    public WebElement passwordFieldUTA;

	    @FindBy(xpath = "//input[@type = 'submit']")
	    public WebElement submitButtonUTA;
	    
	    @FindBy(xpath = "//div[contains(@class, 'nameContainer')]")
	    public WebElement nameCntnrOnDshBoard;
	    
	    @FindBy(xpath = "//div[@id= 'userNameContent']/parent::div/parent::div/div[4]/div[1]")
	    public WebElement fstCtgryFstLogin;
	    
	    @FindBy(xpath = "//div[@id= 'userNameContent']/parent::div/parent::div/div[5]/div")
	    public WebElement fstLoginDoneBtn;
	    
	    @FindBy(xpath = "//div[@aria-label= 'profile dropdown']")
	    public WebElement optnsDropDown;
	 
	    @FindBy(xpath = "//a[@aria-label= 'logout']")
	    public WebElement logOutOptn;
	    
	    @FindBy(xpath = "//button[contains(text(),'YES')]")
	    public WebElement yesButton;
}
