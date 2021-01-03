package pageActions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.AppManagerObjects;

public class AppManagerActions extends BrowserSelection{

	AppManagerObjects appManagerObjects = new AppManagerObjects();
	
	public AppManagerActions()
	{
		  PageFactory.initElements(getDriver(), appManagerObjects);
	}
	
	public void clickAppManagerIcon() throws InterruptedException
	{
		webActions.click(appManagerObjects.appManagerIcon, "Click on app manager icon");
	}
	
	public void clickUnifyedAppstore() throws InterruptedException
	{
		webActions.click(appManagerObjects.unifyedAppstore, "Click on unifyed App store");
	}
	
	public void clickSaveSecondApp() throws InterruptedException
	{
		webActions.click(appManagerObjects.saveSecondApp, "Click on save of second app");
	}
	
	public void clickOkAppSaved() throws InterruptedException
	{
		webActions.click(appManagerObjects.okAppSaved, "Click on OK dialogue box for app saved");
	}
	
	public void clickCancel() throws InterruptedException
	{
		webActions.click(appManagerObjects.cancel, "Click on cancel");
	}
	
	public void clickPublish() throws InterruptedException
	{
		webActions.click(appManagerObjects.publish, "Click on publish");
	}

	public String assertPublishBox() throws InterruptedException
	{
//		webActions.waitForElement(qaObjects.announcementHeading);
		return webActions.getText(appManagerObjects.publishBox, "Checking publish dialog box");
	}
	
	public void clickNoButton() throws InterruptedException
	{
		webActions.click(appManagerObjects.noButton, "Click on no button in publish box");
	}

	public void clickCustomTab() throws InterruptedException
	{
		webActions.click(appManagerObjects.customTab, "Click on custom tab");
	}
	
	public void clickCreateNewApp() throws InterruptedException
	{
		webActions.click(appManagerObjects.createNewApp, "Click on create new app");
	}
	
	public void clickChooseImage() throws InterruptedException
	{
		webActions.click(appManagerObjects.chooseImage, "Click on choose image");
		webActions.click(appManagerObjects.appIcon, "Click on app icon");
		webActions.click(appManagerObjects.saveIcon, "Click on save icon");
	}
	
	public void enterAppName() throws InterruptedException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
//	    System.out.println(formatter.format(date)); 
	    String a= "Auto"+formatter.format(date);
	    System.out.println(a);
	    webActions.click(appManagerObjects.enterAppName, "Click on save icon");
		webActions.setText(appManagerObjects.enterAppName,"Automation App", "Enter new app name");
	}
	
	public void clickNextButton() throws InterruptedException
	{
		webActions.click(appManagerObjects.nextButton, "Click on next button");
	}
	
	public void clickAddButton() throws InterruptedException
	{
		webActions.click(appManagerObjects.addButton, "Click on add button");
	}
	
}
