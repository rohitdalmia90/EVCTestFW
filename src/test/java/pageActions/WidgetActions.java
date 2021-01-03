package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.WidgetObjects;

public class WidgetActions extends BrowserSelection{

	WidgetObjects widgetObjects = new WidgetObjects();
	
	public WidgetActions()
	{
		  PageFactory.initElements(getDriver(), widgetObjects);
	}
	
	public void clickTestCheck() throws InterruptedException
	{
		webActions.click(widgetObjects.testCheck, "Click on test check page");
	}
	
	public void clickWidgetOptn() throws InterruptedException
	{
		webActions.click(widgetObjects.widgetOptn, "Click on widget");
	}
	
	public void clickSiteContent() throws InterruptedException
	{
		webActions.click(widgetObjects.siteContent, "Click on site content");
	}
	
	public void selectSmartArticle() throws InterruptedException
	{
		webActions.click(widgetObjects.smartArticle, "Select on smart article");
	}
	
	public void clickDone() throws InterruptedException
	{
		webActions.click(widgetObjects.done, "Click on done");
	}
	
}
