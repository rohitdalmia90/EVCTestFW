package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyDriveObjects {

	@FindBy(xpath = "//img[@class='searchicon convertsvg pull-right']")
    public WebElement searchBox;
	
	@FindBy(xpath = "//span[contains(text(),'My Drive')]")
    public WebElement myDrive;
	
	@FindBy(xpath = "//h1[contains(text(),'My Drive')]")
    public WebElement assertMyDrive;
	
	@FindBy(xpath = "//div[contains(text(),'My Library')]")
    public WebElement assertMyLibrary;
	
	@FindBy(xpath = "//div[contains(text(),'Shared with Me')]")
    public WebElement assertSharedWithMe;
	
	@FindBy(xpath = "//div[@class='dropdown dropdownMenuSelect font16 text-right colorGrey cursorPointer']/span")
    public WebElement add;
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu multiCheckPadding addFolderDropdown']/li/a)[1]")
    public WebElement newFolder;
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu multiCheckPadding addFolderDropdown']/li/a)[2]")
    public WebElement uploadFile;
	
	@FindBy(xpath = "//ul[@class='font14 driveTrailmenu']")
    public WebElement trailMenu;
	
	@FindBy(xpath = "//input[@id='addFolder']")
    public WebElement addFolderName;

	@FindBy(xpath = "//div[@id='newFolder']//div[@class='modal-footer']//button[contains(text(),'Save')]")
    public WebElement saveFolderName;
	
	@FindBy(xpath = "//div[contains(text(),'AutoMyDrive')]/../following-sibling::div/span")
    public WebElement actionItemsAutoMyDrive;
	
	@FindBy(xpath = "//ul[@id='dropDownItems9']//span[@class='cursorPointer'][contains(text(),'Rename')]")
    public WebElement renameAutoMyDrive;
	
	@FindBy(xpath = "//ul[@id='dropDownItems9']//span[contains(text(),'Move')]")
    public WebElement moveAutoMyDrive;
	
	@FindBy(xpath = "//ul[@id='dropDownItems9']//span[contains(text(),'Remove')]")
    public WebElement removeAutoMyDrive;
	
	@FindBy(xpath = "//ul[@id='dropDownItems9']//span[contains(text(),'Share')]")
    public WebElement shareAutoMyDrive;
	
	@FindBy(xpath = "//ul[@id='dropDownItems9']//span[contains(text(),'Copy Url')]")
    public WebElement copyUrlAutoMyDrive;
	
	@FindBy(xpath = "//div[contains(text(),'AutoSharedWithMe')]/../following-sibling::div/span")
    public WebElement actionItemsAutoSharedWithMe;
	
	@FindBy(xpath = "//div[@class='dropdown dropdownMenuSelect font16 displayInlineBlock folderAction text-center colorGrey cursorPointer folderDropdown ng-scope open']//span[@class='cursorPointer'][contains(text(),'Rename')]")
    public WebElement renameAutoSharedWithMe;
	
	@FindBy(xpath = "//div[@class='dropdown dropdownMenuSelect font16 displayInlineBlock folderAction text-center colorGrey cursorPointer folderDropdown ng-scope open']//span[@class='cursorPointer'][contains(text(),'Remove')]")
    public WebElement removeAutoSharedWithMe;
	
	@FindBy(xpath = "//div[@class='dropdown dropdownMenuSelect font16 displayInlineBlock folderAction text-center colorGrey cursorPointer folderDropdown ng-scope open']//span[@class='cursorPointer'][contains(text(),'Share')]")
    public WebElement shareAutoSharedWithMe;
	
	@FindBy(xpath = "//input[@id='renameTitle']")
    public WebElement renameTitle;
	
	@FindBy(xpath = "//div[@id='renameModal']//button[@type='button'][contains(text(),'Save')]")
    public WebElement saveRenameTitle;
	
	@FindBy(xpath = "//p[contains(text(),'Deleted folders cannot be recovered')]")
    public WebElement assertDeleteDialogBox;
	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
    public WebElement delete;
	
	@FindBy(xpath = "//a[contains(@class,'jqtree-toggler jqtree_common jqtree-toggler-right jqtree-closed')]")
    public WebElement moveDropdown;
	
	@FindBy(xpath = "//span[contains(text(),'AutoSharedWithMe')]")
    public WebElement selectMoveFolder;
	
	@FindBy(xpath = "//button[contains(text(),'Move')]")
    public WebElement moveFolder;
	
	
	
	
	
	
	
}
