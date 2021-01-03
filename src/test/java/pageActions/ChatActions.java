package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import frameworkGlobals.WebActions;
import pageObjects.ChatObjects;

public class ChatActions extends BrowserSelection{

	ChatObjects chatObjects = new ChatObjects();
	
	public ChatActions()
	{
		  PageFactory.initElements(getDriver(), chatObjects);
	}
	
	public void clickChatIcon() throws InterruptedException
	{
		webActions.click(chatObjects.chatIcon, "Click on chat icon");
	}
	
	public String assertRecentChat() throws InterruptedException
	{
		return webActions.getText(chatObjects.resChat, "Assert recent chat");
	}
	
	public String assertChatRooms() throws InterruptedException
	{
		return webActions.getText(chatObjects.chatRooms, "Assert chat rooms");
	}
	
	public void clickChatRooms() throws InterruptedException
	{
		webActions.click(chatObjects.chatRooms, "Click on chat icon");
	}
	
	public String assertSearch() throws InterruptedException
	{
		return webActions.getText(chatObjects.assertSearch, "Assert user search successful");
	}
	
	public void EnterNewConnection() throws InterruptedException
	{
		webActions.setText(chatObjects.searchNewConnection,"cap@txstage.unifyed.com", "Click on Search New Connection");
	}
	
	public void clickSearchIcon() throws InterruptedException
	{
		webActions.click(chatObjects.searchIcon, "Click on search icon");
	}
	
	public void clickAddConnection() throws InterruptedException
	{
		webActions.click(chatObjects.addConnection, "Click on Add icon");
	}
	
	public String verifyConnectionRequest() throws InterruptedException
	{
		return webActions.getText(chatObjects.connectionRequest, "Accept connection request");
	}
	
	public void clickConnectionRequest() throws InterruptedException
	{
		webActions.click(chatObjects.connectionRequest, "Accept connection request");
	}
	
	public void clickConfirmRequest() throws InterruptedException
	{
		webActions.click(chatObjects.confirmRequest, "Confirm acceptance");
	}
	
	public void clickRejectRequest() throws InterruptedException
	{
		webActions.click(chatObjects.rejectRequest, "Reject acceptance");
	}
	
	public void clickDeclineOwnRequest() throws InterruptedException
	{
		webActions.click(chatObjects.declineOwnRequest, "Decline own connection request");
	}
	
	public void SearchBlockUserfromPreferences() throws InterruptedException
	{
		webActions.setText(chatObjects.searchBlockUserfromPreferences,"cap@txstage.unifyed.com", "Search to block user");
		WebActions.EnterKey(chatObjects.searchBlockUserfromPreferences);
	}
	
	public String assertConnectionAdded() throws InterruptedException
	{
		return webActions.getText(chatObjects.assertRequesterAdded, "Assert new connection added");
	}
	
	public void clickAcceptanceChatIcon() throws InterruptedException
	{
		webActions.click(chatObjects.acceptanceChatIcon, "Click acceptance chat icon");
	}
	
	public void clickIndividualChatUser() throws InterruptedException
	{
		webActions.click(chatObjects.individualChat, "Click on individual chat user");
	}
	
	public void clickBlockIndividualChatUser() throws InterruptedException
	{
		webActions.click(chatObjects.blockIndividualChat, "Click on block individual chat user");
	}
	
	public void clickCloseChat() throws InterruptedException
	{
		webActions.click(chatObjects.closeChat, "Click on close chat");
	}
	
	public void clickMinimizeChat() throws InterruptedException
	{
		webActions.click(chatObjects.minChat, "Click minimize chat button");
	}
	
	public void clickBlockPopup() throws InterruptedException
	{
		webActions.click(chatObjects.blockUserPopup, "Click block");
	}
	
	public void clickSubmitBlockUser() throws InterruptedException
	{
		webActions.click(chatObjects.submitBlockUser, "Click submit block user");
	}

	public void clickCancelBlockUser() throws InterruptedException
	{
		webActions.click(chatObjects.cancelBlockUser, "Click cancel block user");
	}
		
	public void clickOKBlockUser() throws InterruptedException
	{
		webActions.click(chatObjects.okBlockUser, "Click cancel block user");
	}
	
	public void clickManageUnblockUser() throws InterruptedException
	{
		webActions.click(chatObjects.unblockUser, "Click cancel block user");
	}
	
	public String assertManageBlockUserPopup() throws InterruptedException
	{
		return webActions.getText(chatObjects.manageBlockedUsers, "Assert manage block user popup");
	}
	
	public void clickDeleteBlockUser() throws InterruptedException
	{
		webActions.click(chatObjects.deleteBlockUser, "Click delete block user");
	}

	public void clickSaveAll() throws InterruptedException
	{
		webActions.click(chatObjects.saveAllUnblocked, "Click save all user");
	}

	public void clickAddBlockUserPreferences() throws InterruptedException
	{
		webActions.click(chatObjects.addBlockUserPreferences, "Click on add to block user");
	}
	
	public void clickYesBlockUserPreferences() throws InterruptedException
	{
		webActions.click(chatObjects.yesBlockUserPreferences, "Click on yes to block user");
	}
	
	public void clickokBlockUserPreferences() throws InterruptedException
	{
		webActions.click(chatObjects.okBlockUserPreferences, "Click on OK to block user");
	}

	public String assertBlockconnection() throws InterruptedException
	{
		return webActions.getText(chatObjects.assertBlockconnection, "Assert block connection");
	}
	
	public void clickCreateNewChatGroup() throws InterruptedException
	{
		webActions.click(chatObjects.editNewChatGroup, "Click to create new chat group");
	}
	
	public void enterGroupName() throws InterruptedException
	{
		webActions.setText(chatObjects.enterGroupName,"Chat Automation", "Click to create new chat group");
	}
	
	public void clickChooseImage() throws InterruptedException
	{
		webActions.click(chatObjects.chooseImage, "Click choose image");
	}
	
	public void clickChooseImageIcon() throws InterruptedException
	{
		webActions.click(chatObjects.chooseImageIcon, "Choose iamge icon");
	}
	
	public void clickSaveChooseIcon() throws InterruptedException
	{
		webActions.click(chatObjects.saveChooseIcon, "Click on save choose icon");
	}
	
	public void clickAddConnectionGroupChat() throws InterruptedException
	{
		webActions.click(chatObjects.addConnectionGroupChat, "Add connection in chat group");
	}
	
	public String assertAddConnectionGroupChat() throws InterruptedException
	{
		return webActions.getClass(chatObjects.assertAddConnectionGroupChat, "Add connection in chat group");
	}
	
	public void clickSubmitNewChatGroup() throws InterruptedException
	{
		webActions.click(chatObjects.submitNewChatGroup, "Click to submit new chat group");
	}
	
	public void clickAutomationChatGroup() throws InterruptedException
	{
		webActions.click(chatObjects.automationChatGroup, "Click created automation chat group");
	}
	
	public String assertAutomationChatGroup() throws InterruptedException
	{
		return webActions.getText(chatObjects.automationChatGroup, "Click created automation chat group");
	}
	
	
	
	
	
	
	
	
}
