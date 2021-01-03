package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetObjects {

	@FindBy(xpath = "//ul[@id='menu-block']//a[@title='test check']")
    public WebElement testCheck;

	@FindBy(xpath = "//div[@class='pngIcon ng-scope widgets-icon icon-widgets']")
    public WebElement widgetOptn;
	
	@FindBy(xpath = "//a[contains(text(),'Site Content')]")
    public WebElement siteContent;
	
	@FindBy(xpath = "//td[contains(text(),'Smart Article')]/ancestor::tr//td//button")
    public WebElement smartArticle;
	
	@FindBy(xpath = "//button[contains(text(),'Done')]")
    public WebElement done;
	
}
