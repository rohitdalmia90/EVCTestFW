package pageActions;

import org.openqa.selenium.support.PageFactory;
import frameworkGlobals.BrowserSelection;
import pageObjects.LogInPageObjects;

public class LogInPageActions extends BrowserSelection{

	LogInPageObjects loginObjects = new LogInPageObjects();
	
	public LogInPageActions()
	{
		  PageFactory.initElements(getDriver(),loginObjects);
	}
	
    public void setUserName(String username) 
    {
    	try {
    		loginObjects.usrNameField.sendKeys(username);
        	extentClass.info("Sending username");
		} catch (Exception e) {
			loginObjects.usrName1Field.sendKeys(username);
        	extentClass.info("Sending username");
		}
    	
    }


	public void setPassword(String password)
	{
		loginObjects.passwordField.sendKeys(password);
		extentClass.info("Sending password");
	}
	
	
	public void clickSubmit() throws InterruptedException{
		jsExecutor.executeScript("arguments[0].click();", loginObjects.submitButton);
		extentClass.info("Clicking submit");
	}	
	
	
	public void setUserNameUTA(String username) 
    {
			loginObjects.usrName1FieldUTA.sendKeys(username);
        	extentClass.info("Sending username");    	
    }


	public void setPasswordUTA(String password)
	{
		loginObjects.passwordFieldUTA.sendKeys(password);
		extentClass.info("Sending password");
	}
	
	public void clickSubmitUTA() throws InterruptedException{
		loginObjects.submitButtonUTA.click();
		//jsExecutor.executeScript("arguments[0].click();", loginObjects.submitButtonUTA);
		extentClass.info("Clicking submit");
	}
	
	public void verifyIfLoginForFstTym() throws InterruptedException
	{
		//webActions.waitForElement(loginObjects.nameCntnrOnDshBoard);
		//int categorySize = webActions.getSize(loginObjects.fstCtgryFstLogin, "Getting size of first time login screen");
		//if(categorySize == 1)
		//{
			//webActions.click(loginObjects.fstCtgryFstLogin, "Clicking on first category");
			//webActions.click(loginObjects.fstLoginDoneBtn, "Clicking on Done button");
			//Thread.sleep(3000);
		//}
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_nameContainerDshBord)));
		//Thread.sleep(3000);
		//List<WebElement> categorySize = driver.findElements(By.xpath(xpath_fstCtgryFstLogin));
		//if(categorySize.size() == 1)
		//{
		//	getElement(By.xpath(xpath_fstCtgryFstLogin)).click();
		//	getElement(By.xpath(xpath_fstLoginDoneBtn)).click();
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_unifyedConnectBtn)));
		//	Thread.sleep(3000);
		//}
	}
	
	public void clickOptnDropDown() throws InterruptedException{
//		webActions.waitForElement(loginObjects.optnsDropDown);
		loginObjects.optnsDropDown.click();
	}

	public void clickLogoutOptn() throws InterruptedException {
//		webActions.waitForElement(loginObjects.logOutOptn);
		loginObjects.logOutOptn.click();
	}
	
	public void clickYes() throws InterruptedException {
//		webActions.waitForElement(loginObjects.logOutOptn);
		loginObjects.yesButton.click();
	}
}
