package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import frameworkGlobals.WebActions;
import pageObjects.UserGroupObjects;

public class UserGroupActions extends BrowserSelection{

	UserGroupObjects userGroupObjects = new UserGroupObjects();
	
	public UserGroupActions()
	{
		  PageFactory.initElements(getDriver(), userGroupObjects);
	}
	
	public void clickUserGroupIcon() throws InterruptedException
	{
		webActions.click(userGroupObjects.userGroupIcon, "Click on user group icon");
	}
	
	public void clickGroups() throws InterruptedException
	{
		webActions.click(userGroupObjects.groups, "Click on groups");
	}
	
	public void clickAddGroup() throws InterruptedException
	{
		webActions.click(userGroupObjects.addGroup, "Click on add Group");
	}
	
	public void enterGroupName() throws InterruptedException
	{
	webActions.setText(userGroupObjects.enterGroupName, "Automation User Group","Clear the group name");
	}
	
	public void clickSearchUserGroup() throws InterruptedException
	{
		webActions.click(userGroupObjects.searchUserGroup, "Click on Search User Group");
	}
	
	public void enterUserID() throws InterruptedException
	{
	webActions.click(userGroupObjects.searchUserGroup, "Click on enter user id1");
	webActions.setText(userGroupObjects.searchUserID, "cap@txstage.unifyed.com","enter user id2");
	WebActions.EnterKey(userGroupObjects.searchUserID);
//	webActions.click(userGroupObjects.searchButton, "Click on Search User button3");
//	webActions.hardSleep();
//	webActions.click(userGroupObjects.searchUserGroup, "Click on Search User Group4");
//	webActions.click(userGroupObjects.searchButton, "Click on Search User button3");
	webActions.click(userGroupObjects.addUserID, "Click on add UserID5");
	
	}
	
	public void enterDescription() throws InterruptedException
	{
		webActions.click(userGroupObjects.enterDescription, "Click on Description");
		webActions.setText(userGroupObjects.enterDescription, "automation","enter Description");
	}
	
	public void clickDone() throws InterruptedException
	{
		webActions.click(userGroupObjects.done, "Click on Done");
	}
	
	public void clickCancel() throws InterruptedException
	{
		webActions.click(userGroupObjects.cancel, "Click on Cancel");
	}
	
	public void clickSettings() throws InterruptedException
	{
		webActions.click(userGroupObjects.settings, "Click on Settings");
	}
	
	public void clickView() throws InterruptedException
	{
		webActions.click(userGroupObjects.view, "Click on View");
	}
	
	public void displayView() throws InterruptedException
	{
		webActions.isDisplayed(userGroupObjects.displayView, "View is displayed");
	}
	
	public void clickEdit() throws InterruptedException
	{
		webActions.click(userGroupObjects.edit, "Click on Edit");
	}
	
	public void clickUpdate() throws InterruptedException
	{
		webActions.click(userGroupObjects.update, "Click on Update");
	}
	
	public void displayGroupUpdate() throws InterruptedException
	{
		webActions.isDisplayed(userGroupObjects.groupUpdate, "Group Update box is displayed");
	}
	
	public void clickDelete() throws InterruptedException
	{
		webActions.click(userGroupObjects.delete, "Click on Delete");
	}
	
	public void displayDeleteDialog() throws InterruptedException
	{
		webActions.isDisplayed(userGroupObjects.deleteDialog, "Delete dialog box diaplyed");
	}
	
	public void clickCancelDeleteDialog() throws InterruptedException
	{
		webActions.click(userGroupObjects.deleteDeleteDialog, "Click on Delete in Delete Dialog Box");
	}
	
}
