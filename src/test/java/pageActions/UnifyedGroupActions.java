package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.UnifyedGroupObjects;

public class UnifyedGroupActions extends BrowserSelection{
	
	UnifyedGroupObjects unifyedGroupObjects = new UnifyedGroupObjects();
	
	public UnifyedGroupActions()
	{
		  PageFactory.initElements(getDriver(), unifyedGroupObjects);
	}
	
	public void clickUnifyedGroup() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.unifyedGroupIcon, "Clicking on Unifyed Group");
	}
	
	public void clickCreateNewGroup() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.createNewGroup, "Clicking on create new group");
	}
	
	public void selectGroupAthletics() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.athletics, "Select group athletics");
	}
	
	public void clickNextButton() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.nextButton, "Clicking on next Button");
	}
	
	public void selectPublicPrivacy() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.publicPrivacy, "Select privacy as public");
	}

	public void enterGroupName() throws InterruptedException
	{
		webActions.clearThenSetText(unifyedGroupObjects.groupName,"AutoGroup", "Enter group name");
	}
	
	public void enterGroupDescription() throws InterruptedException
	{
		webActions.clearThenSetText(unifyedGroupObjects.groupDescription,"Description", "Enter group description");
	}
	
	
	public void clickCreateButton() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.createButton, "Click on create button");
	}
	
	public void selectPrivatePrivacy() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.privatePrivacy, "Select privacy as private");
	}
	
	public void selectRestrictedPrivacy() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.restrictedPrivacy, "Select privacy as restricted");
	}
	
	public void clickDropdownGroup() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.selectGroup,"Click on dropdown to select group");
	}
	
	public void clickSelectAllUsers() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.selectAllUsers,"Click all user from dropdown");
	}
	
	public void enterGroupNameRestricted() throws InterruptedException
	{
		webActions.clearThenSetText(unifyedGroupObjects.groupName,"AutoGroupRestricted", "Enter group name restricted");
	}
	
	public void enterGroupNamePrivate() throws InterruptedException
	{
		webActions.clearThenSetText(unifyedGroupObjects.groupName,"AutoGroupPrivate", "Enter group name private");

	}
	
	public void clickGroupabcIcon() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.groupabcIcon,"Click on abc group icon");
	}
	
	public void clickViewGroupInfo() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.viewGroupInfo,"Click on view Group Info");
	}
	
	public String assertGroupInformation() throws InterruptedException
	{
		webActions.waitForElement(unifyedGroupObjects.groupInformation);
		return webActions.getText(unifyedGroupObjects.groupInformation, "Checking page display Group Information");
	}
	
	public void clickCloseBtn() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.closeBtn,"Click on close button");
	}
	
	public void clickExploreGroup() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.exploreGroup,"Click on explore group");
	}
	
	public String assertExplorePublicGroup() throws InterruptedException
	{
		webActions.waitForElement(unifyedGroupObjects.explorePublicGroup);
		return webActions.getText(unifyedGroupObjects.explorePublicGroup, "Checking page display Public Group");
	}
	
	public String assertExploreGroupName() throws InterruptedException
	{
		webActions.waitForElement(unifyedGroupObjects.exploreGroupName);
		return webActions.getText(unifyedGroupObjects.exploreGroupName, "Checking page display Public Group Name");
	}

	public void clickLeaveGroup() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.leaveGroup,"Click on leave group");
	}
	
	public String assertLeaveGroupDialogueBox() throws InterruptedException
	{
		webActions.waitForElement(unifyedGroupObjects.leaveGroupDialogueBox);
		return webActions.getText(unifyedGroupObjects.leaveGroupDialogueBox, "Display leave group dialogue box");
	}
	
	public void clickNoDialogueBox() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.noDialogueBox,"Click on NO for leave group dailogue box");
	}
	
	public void clickEditGroup() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.editGroup,"Click on edit Group");
	}
	
	public void clickUpdateButton() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.updateButton,"Click on update button");
	}
	
	public void clickHideGroupInfo() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.hideGroupInfo,"Click on hide group info.");
	}
	
	public String assertHideGroup() throws InterruptedException
	{
		webActions.waitForElement(unifyedGroupObjects.assertHideGroup);
		return webActions.getText(unifyedGroupObjects.assertHideGroup, "assert for hide group");
	}
	
	public void clickShowGroupInfo() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.showGroupInfo,"Click on show group info.");
	}
	
	public void clickGroupABC() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.groupABC,"Click on groupABC");
	}
	
	public void clicktx() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.tx,"Click on groupABC");
	}
	
	public void clickRestrictedDropdown() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.restrictedDropdown,"Click on restricted Dropdown");
	}
	
	public void clickViewInviteRequest() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.viewInviteRequest,"Click on view Invite Request");
	}
	
	public String assertGroupInvites() throws InterruptedException
	{
		webActions.waitForElement(unifyedGroupObjects.assertGroupInvites);
		return webActions.getText(unifyedGroupObjects.assertGroupInvites, "assert for Group Invites");
	}
	
	public void clickCloseGroupInvite() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.closeGroupInvite,"Click on close GroupInvite");
	}
	
	public void clickPrivateDropdown() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.privateDropdown,"Click on private group Dropdown");
	}
	
	public void clickAddMember() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.addMember,"Click on private group add member");
	}
	
	public String assertAddMember() throws InterruptedException
	{
		webActions.waitForElement(unifyedGroupObjects.assertAddMember);
		return webActions.getText(unifyedGroupObjects.assertAddMember, "assert for add member dialogue box");
	}
	
	public void searchAddMember() throws InterruptedException
	{
		webActions.clearThenSetText(unifyedGroupObjects.searchAddMember,"cap@txstage.unifyed.com", "Enter search id");
	}

	public void clickSearchIcon() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.searchIcon,"Click on search icon");
	}
	
	public void clickSearchAdd() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.searchAdd,"Click on add member");
	}
	
	public void clickSendInvite() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.sendInvite,"Click on send invite");
	}
	
	public void clickCloseAddMember() throws InterruptedException
	{
		webActions.click(unifyedGroupObjects.closeAddMember,"Click on close add member dialogue box");
	}
	
}
