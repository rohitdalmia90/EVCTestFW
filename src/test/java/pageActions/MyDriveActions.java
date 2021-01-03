package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.MessageModuleObjects;
import pageObjects.MyDriveObjects;

public class MyDriveActions extends BrowserSelection{
	
//	MessageModuleObjects messageObjects= new MessageModuleObjects();
	MyDriveObjects myDriveObjects = new MyDriveObjects();
	
	public MyDriveActions()
	{
		  PageFactory.initElements(getDriver(), myDriveObjects);
	}
	
	public void clicksearchBox() throws InterruptedException
	{
		webActions.click(myDriveObjects.searchBox, "Click on search box");
		webActions.setText(myDriveObjects.searchBox, "My Drive", "Enter text in search box");
	}
	
	public void clickMyDrive() throws InterruptedException
	{
		webActions.click(myDriveObjects.myDrive, "Click on myDrive module");
	}
	
	public String assertMyDrive() throws InterruptedException
	{
		return webActions.getText(myDriveObjects.assertMyDrive, "Assert on My Drive");
	}
	
	public void clickMyLibrary() throws InterruptedException
	{
		webActions.click(myDriveObjects.assertMyLibrary, "Click on myDrive module");
	}
	
	public void clickSharedWithMe() throws InterruptedException
	{
		webActions.click(myDriveObjects.assertSharedWithMe, "Click on myDrive module");
	}
	
	public String assertMyLibrary() throws InterruptedException
	{
		return webActions.getText(myDriveObjects.assertMyLibrary, "Assert on My Library");
	}
	
	public String assertSharedWithMe() throws InterruptedException
	{
		return webActions.getText(myDriveObjects.assertSharedWithMe, "Assert on Shared With Me");
	}
	
	public void clickOnAdd() throws InterruptedException
	{
		webActions.click(myDriveObjects.add, "Click on Add");
	}
	
	public String assertNewFolder() throws InterruptedException
	{
		return webActions.getText(myDriveObjects.newFolder, "Assert new Folder");
	}
	
	public String assertUploadFile() throws InterruptedException
	{
		return webActions.getText(myDriveObjects.uploadFile, "Assert upload File");
	}
	
	public String assertTrailMenu() throws InterruptedException
	{
		return webActions.getText(myDriveObjects.trailMenu, "Assert trail Menu");
	}
	
	public void CreateFolderSharedWithMe() throws InterruptedException
	{
		webActions.click(myDriveObjects.newFolder, "Click on new folder");
		webActions.setText(myDriveObjects.addFolderName, "AutoSharedWithMe", "Folder name in shared with me");
		webActions.click(myDriveObjects.saveFolderName, "Click on saveFolderName");
	}
	
	public void CreateFolderMyDrive() throws InterruptedException
	{
		webActions.click(myDriveObjects.newFolder, "Click on new folder");
		webActions.setText(myDriveObjects.addFolderName, "AutoMyDrive", "Folder name in My Drive");
		webActions.click(myDriveObjects.saveFolderName, "Click on saveFolderName");
	}
	
	public void RenameFolderMyDrive() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoMyDrive, "Click on actionItems AutoMyDrive");
		webActions.click(myDriveObjects.renameAutoMyDrive, "Click on rename AutoMyDrive");
		webActions.clearThenSetText(myDriveObjects.renameTitle, "RenameAutoMyDrive","Rename AutoMyDrive");
		webActions.click(myDriveObjects.saveRenameTitle, "Click on save rename title");
	}
	
	public void MoveFolderMyDrive() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoMyDrive, "Click on actionItems AutoMyDrive");
		webActions.click(myDriveObjects.moveAutoMyDrive, "Click on move AutoMyDrive");
		webActions.click(myDriveObjects.moveDropdown, "Click on move Dropdown");
		webActions.click(myDriveObjects.selectMoveFolder, "Select move folder");
		webActions.click(myDriveObjects.moveFolder, "Click on move folder");
	}
	
	public void RemoveFolderMyDrive() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoMyDrive, "Click on actionItems AutoMyDrive");
		webActions.click(myDriveObjects.removeAutoMyDrive, "Click on remove AutoMyDrive");
		webActions.click(myDriveObjects.delete, "Click on delete AutoMyDrive");
//		return webActions.getText(myDriveObjects.assertDeleteDialogBox, "Click on remove AutoMyDrive");
		
	}
	
	public void CopyURLFolderMyDrive() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoMyDrive, "Click on actionItems AutoMyDrive");
		webActions.click(myDriveObjects.copyUrlAutoMyDrive, "Click on copyUrl AutoMyDrive");
	}
	
	public void ShareFolderMyDrive() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoMyDrive, "Click on actionItems AutoMyDrive");
		webActions.click(myDriveObjects.shareAutoMyDrive, "Click on copyUrl AutoMyDrive");
	}
	
	public void RenameFolderSharedWithMe() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoSharedWithMe, "Click on actionItems AutoSharedWithMe");
		webActions.click(myDriveObjects.renameAutoSharedWithMe, "Click on rename AutoMyDrive");
		webActions.clearThenSetText(myDriveObjects.renameTitle, "RenameAutoSharedWithMe","Rename AutoSharedWithMe");
		webActions.click(myDriveObjects.saveRenameTitle, "Click on save rename title");
	}
	
	
	public void RemoveFolderSharedWithMe() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoSharedWithMe, "Click on actionItems AutoSharedWithMe");
		webActions.click(myDriveObjects.removeAutoMyDrive, "Click on remove AutoSharedWithMe");
		webActions.click(myDriveObjects.delete, "Click on delete AutoSharedWithMe");
	}
	
	public void ShareFolderSharedWithMe() throws InterruptedException
	{
		webActions.click(myDriveObjects.actionItemsAutoSharedWithMe, "Click on actionItems AutoSharedWithMe");
		webActions.click(myDriveObjects.shareAutoSharedWithMe, "Click on share AutoMyDrive");
	}
	
}
