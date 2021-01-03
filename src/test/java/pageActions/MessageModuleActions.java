package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.MessageModuleObjects;

public class MessageModuleActions extends BrowserSelection {

	MessageModuleObjects messageObjects = new MessageModuleObjects();
	
	public MessageModuleActions()
	{
		  PageFactory.initElements(getDriver(), messageObjects);
	}
	
	public void clicksearchBox() throws InterruptedException
	{
		webActions.click(messageObjects.searchBox, "Click on search box");
		webActions.setText(messageObjects.searchBox, "Mesaage Module", "Enter text in search box");
	}
	
	public void clickMessageModule() throws InterruptedException
	{
		webActions.click(messageObjects.messageModule, "Click on message module");
	}
	
	public String assertMessageModule() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertMessageModule, "Assert on message module");
	}
	
	public String assertCreateButton() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertCreateButton, "Display Create button");
	}
	
	public void clickCreateButton() throws InterruptedException
	{
		webActions.click(messageObjects.assertCreateButton, "Click on create button");
	}
	
	public void clickNextButton() throws InterruptedException
	{
		webActions.click(messageObjects.nextButton, "Click on next button");
	}
	
	public String assertNextPopup() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertNextPopup, "Assert Next Popup");
	}
	
	public void clickOKNextPopup() throws InterruptedException
	{
		webActions.click(messageObjects.okNextPopup, "Click OK next button");
	}
	
	public void clickMangeMessagePermission() throws InterruptedException
	{
		webActions.click(messageObjects.mangeMessagePermission, "Click OK next button");
	}
	
	public void clickAllUserUnderManage() throws InterruptedException
	{
		webActions.click(messageObjects.allUserUnderManage, "Click OK next button");
	}
	
	public void clickSaveManagePermissions() throws InterruptedException
	{
		webActions.click(messageObjects.saveManagePermissions, "Click OK next button");
	}
	
	public void clickPreferncesToggle() throws InterruptedException
	{
		webActions.click(messageObjects.preferncesToggle, "Click OK next button");
	}
	
	public String assertToggleSelectedCheck() throws InterruptedException
	{
		return webActions.getClass(messageObjects.toggleSelectedCheck, "Assert Next Popup");
	}
	
	public void clickSelectUserGroup() throws InterruptedException
	{
		webActions.click(messageObjects.selectUserGroup, "Click on select user group tab");
	}
	
	public String assertNoUserFound() throws InterruptedException
	{
		return webActions.getText(messageObjects.noUserFound, "Assert No User Found");
	}
	
	public void clickSelectAllUser() throws InterruptedException
	{
		webActions.click(messageObjects.selectAllUser, "Select All user");
	}
	
	public void clickconnectPostIcon() throws InterruptedException
	{
		webActions.click(messageObjects.connectPostIcon, "Click on select user group tab");
	}
	
	public String assertConnectPostPopup() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertConnectPostPopup, "Assert assertConnectPostPopup");
	}
	
	public void clickemailIcon() throws InterruptedException
	{
		webActions.click(messageObjects.emailIcon, "Click emailIcon");
	}
	
	public String assertassertEmailPostPopup() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertEmailPostPopup, "Assert assertEmailPostPopup");
	}
	
	public void clickpushNotificationIcon() throws InterruptedException
	{
		webActions.click(messageObjects.pushNotificationIcon, "Click on pushNotificationIcon");
	}
	
	public String assertPushNotificationPopup() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertPushNotificationPopup, "assertPushNotificationPopup");
	}
	
	public void clicksmsIcon() throws InterruptedException
	{
		webActions.click(messageObjects.smsIcon, "Click smsIcon");
	}
	
	public String assertSMSPopup() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertSMSPopup, "assertSMSPopup");
	}
	
	public void selectAllTag() throws InterruptedException
	{
		webActions.click(messageObjects.allTag, "Click allTag");
	}
	
	public String assertMsgConnectPost() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertMsgConnectPost, "assertMsgConnectPost");
	}
	
	public void enterMailTitle() throws InterruptedException
	{
		webActions.setText(messageObjects.enterMailTitle, "Auto Email", "Enter MailTitle");
	}

	public String assertMailMsgPost() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertMailMsgPost, "assertMailMsgPost");
	}
	
	public void composeMsgConnectPost() throws InterruptedException
	{
		webActions.setText(messageObjects.connectMsgPost, "Auto connect post", "Enter MailTitle");
	}
	
	public void clickEditMsgIcon() throws InterruptedException
	{
		webActions.click(messageObjects.editMsgIcon, "Click editMsg");
		webActions.setText(messageObjects.updateMsg, "Auto connect post Updated", "Update msg");
	}
	
	public String assertUpdatedMsg() throws InterruptedException
	{
		return webActions.getText(messageObjects.updateMsg, "assertUpdatedMsgConnectPost");
	}
	
	public void clicksaveMsg() throws InterruptedException
	{
		webActions.click(messageObjects.saveMsg, "Click saveMsg");
	}
	
	public void clickcancelMsg() throws InterruptedException
	{
		webActions.click(messageObjects.cancelMsg, "Click cancelMsg");
	}
	
	public void clicksaveAsTemplate() throws InterruptedException
	{
		webActions.click(messageObjects.saveAsTemplate, "Click saveAsTemplate");
	}

	public void clickPublish() throws InterruptedException
	{
		webActions.click(messageObjects.publish, "Click publish");
	}
	
	public void clickNotifications() throws InterruptedException
	{
		webActions.click(messageObjects.notifications, "Click notifications");
	}
	
	public String assertLowPriorityNoAcknowledgement() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertLowPriorityNoAcknowledgement, "assertLowPriorityNoAcknowledgement");
	}
	
	public void clickSkip() throws InterruptedException
	{
		webActions.click(messageObjects.skip, "Click skip");
	}
	
	public void clickAcknowledge() throws InterruptedException
	{
		webActions.click(messageObjects.acknowledge, "Click acknowledge");
	}
	
	public void clickYesacknowledge() throws InterruptedException
	{
		webActions.click(messageObjects.selectAcknowledge, "Click selectAcknowledge");
		webActions.click(messageObjects.setYesacknowledge, "Click setYesacknowledge");
	}

	public void clickSelectApp() throws InterruptedException
	{
		webActions.click(messageObjects.selectApp, "Click selectApp");
		webActions.click(messageObjects.selectUnifyedConnect, "Click selectUnifyedConnect");
	}
	
	public String assertSelectedApp() throws InterruptedException
	{
		return webActions.getText(messageObjects.assertSelectedApp, "assertLowPriorityNoAcknowledgement");
	}
	
	public void selectPriorityHigh() throws InterruptedException
	{
		webActions.click(messageObjects.priorityDropdown, "Click priorityDropdown");
		webActions.click(messageObjects.highPriority, "Click highPriority");
	}
	
	public void clickImageIcon() throws InterruptedException
	{
		webActions.click(messageObjects.imageIcon, "Click imageIcon");
	}
	
}
