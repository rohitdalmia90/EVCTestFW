package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UTAObjects {
	
	@FindBy(xpath = "//input[@type = 'text']")
    public WebElement usrName1FieldUTA;

    @FindBy(xpath = "//input[@type = 'password']")
    public WebElement passwordFieldUTA;

    @FindBy(xpath = "//input[@type = 'submit']")
    public WebElement submitButtonUTA;
	
	@FindBy(xpath = "//nav[@id = 'sidebar']")
	public WebElement sideBar;
	
	@FindBy(xpath = "//input[@id='searchBox']")
	public WebElement searchField;
	
	@FindBy(xpath = "//input[@value='Authorize'and @name= 'commit']")
	public WebElement authorizeUserUTA ; 
	
	@FindBy(xpath = "//a[contains(text(), 'MyUT Portal 501')]")
	public WebElement myUTPortal101Optn;
	
	@FindBy(xpath = "//div[@class= 'overflowHidden']/span[contains(text(), 'Assignments')]")
	public WebElement assignmentMyUTPortal101;
	
	@FindBy(id = "assignments")
	public List<WebElement> assignmentSectionMyUTPortal101;
	
	@FindBy(xpath = "//div[@class= 'overflowHidden']/span[contains(text(), 'Discussion')]")
	public WebElement discussionMyUTPortal101;
	
	@FindBy(id = "discussions")
	public List<WebElement> discussionSectionMyUTPortal101;
	
	@FindBy(xpath = "//div[@class= 'overflowHidden']/span[contains(text(), 'Grades')]")
	public WebElement gradesMyUTPortal101;
	
	@FindBy(id = "grades")
	public List<WebElement> gradesSectionMyUTPortal101;
	
	@FindBy(xpath = "//div[@class= 'overflowHidden']/span[contains(text(), 'Files')]")
	public WebElement filesMyUTPortal101;
	
	@FindBy(id = "files")
	public List<WebElement> filesSectionMyUTPortal101;
	
	@FindBy(xpath = "//div[@class= 'overflowHidden']/span[contains(text(), 'Syllabus')]")
	public WebElement syllabusMyUTPortal101;
	
	@FindBy(id = "classroster")
	public List<WebElement> syllabusSectionMyUTPortal101;
	
	@FindBy(xpath = "//nav[@id='sidebar']/ul[1]/li[@class= 'panel ng-scope']")
	public List<WebElement> allLeftNavOptions ;
	
	@FindBy(xpath = "//nav[@id='sidebar']/ul[1]/li/ul/li")
	public WebElement leftNavSubOptions;
	
	@FindBy(xpath = "//nav[@id='sidebar']/ul[1]/li/a/span")
	public WebElement allLeftNavOptionsTitle;
	
	@FindBy(xpath = "//div[@id= 'dropdownMenu1' and @type= 'button']/span[contains(text(), 'Your Preferences')]")
	public WebElement yourPrefrencesFiltrOptn;
	
	@FindBy(xpath = "//nav[@id= 'sidebar']//ul/li/a/span[contains(text(), 'Videos')]")
	public WebElement videoInNavBarSpan;
	
	@FindBy(xpath = "//h1[contains(text(), 'Videos')]")
	public WebElement videosHeadline;
	
	@FindBy(xpath = "//video[contains(@class, 'video')]")
	public List<WebElement> videosOnPage;
	
	@FindBy(xpath = "//h1[contains(text(), 'MyUT Home')]")
	public List<WebElement> myHomeHeadingUTA;
	
	@FindBy(xpath = "//div[contains(text(), 'My Class Schedule')]")
	public List<WebElement> classScheduleTextUTA;

}
