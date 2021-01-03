package frameworkGlobals;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

/*import com.relevantcodes.extentreports.Status;*/

import interfaces.DriverActions;
import utilities.JSExecutor;

public class WebActions extends BrowserSelection implements DriverActions {


	
	  private static List<WebElement> getElements(WebElement element) { if (wait == null)
	  wait = new WebDriverWait(getDriver(), Configurations.getExplicitlyWait());
	  wait.until(ExpectedConditions.visibilityOf(element));
	  
	  wait.until(ExpectedConditions.elementToBeClickable(element)); 
	  return (List<WebElement>) wait.until(ExpectedConditions.visibilityOfAllElements(element)); 
	  }
	 

	
	public void hardSleep() throws InterruptedException{
		Thread.sleep(7000);
	}
	
	public WebElement waitForElement(WebElement element) throws InterruptedException{
		if (wait == null) 
			{
				wait = new WebDriverWait(getDriver(), Configurations.getExplicitlyWait());
			}
		wait.until(ExpectedConditions.visibilityOf(element));
		
		Thread.sleep(2000);
		waitFluent = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		return element;
	}
	
	//public static WebElement getDelayedElement(WebElement element) 
	//{ 
	//	if (wait == null) wait = new WebDriverWait(getDriver(), 30);
	//		wait.until(ExpectedConditions.visibilityOf(element)); 
	//		
	//	wait = new WebDriverWait(getDriver(), 30);
	//	wait.until(ExpectedConditions.elementToBeClickable(element)); 
	//	return element;
	//}
	/**
	 * <h1>click</h1>
	 * {@code public void click(WebElement element, String actionInfo)}<br>
	 * This method performs click on the 'element' element. locator of elements
	 * should be pass as argument 'element'. Information of action should be pass as
	 * argument 'actionInfo'
	 * 
	 * @param element    locator of element to Click.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public void click(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			Thread.sleep(1500);
			jsExecutor.executeScript("arguments[0].click();", element);
			//element.click();
			System.out.println("Clicked Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Clicked Successfully: " + actionInfo);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not able to Click: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Click : " + actionInfo + " locator: " + element + ")");
		}
	}

	/***
	 * <h1>selectByIndex</h1>
	 * {@code public void selectByIndex(WebElement element, int index, String actionInfo)}<br>
	 * This method select the option from element dropdown element by index value of
	 * dropdown option. locator of elements should be pass as argument element.
	 * Information of action should be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element to Click.
	 * @param index:      index value of selected dropdown option.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public void selectByIndex(WebElement element, int index, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			select.selectByIndex(index);
			System.out.println("Selected Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Selected Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Select : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>selectByValue</h1>
	 * {@code public void selectByValue(WebElement element, String value, String actionInfo)}<br>
	 * This method select the option from element dropdown element by value of
	 * dropdown option. locator of elements should be pass as argument element.
	 * Information of action should be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element to Click.
	 * @param value:      value of selected dropdown option.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public void selectByValue(WebElement element, String value, String actionInfo) {
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			select.selectByValue(value);
			System.out.println("Selected Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Selected Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Select : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>selectByVisibleText</h1>
	 * {@code public void selectByVisibleText(WebElement element, String text, String actionInfo)}<br>
	 * This method select the option from element dropdown element by visible text
	 * of dropdown option. locator of elements should be pass as argument element.
	 * Information of action should be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element to Click.
	 * @param text:       visible text of selected dropdown option.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public void selectByVisibleText(WebElement element, String text, String actionInfo) {
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			select.selectByVisibleText(text);
			System.out.println("Selected Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Selected Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Select : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>getClass</h1>
	 * {@code public String getClass(WebElement element, String actionInfo)}<br>
	 * This method returns the class name of 'element' element. locator of elements
	 * should be pass as argument 'element'. Information of action should be pass as
	 * argument 'actionInfo'
	 * 
	 * @param element    locator of element to Get Class.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return String clasNname of 'element'.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public String getClass(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		String className = null;
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			className = element.getAttribute("class");
			System.out.println("Got Class Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Got Class Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get Class: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Class : " + actionInfo + " locator: " + element + ")");
		}
		return className;
	}

	/**
	 * <h1>getFirstSelectedOption</h1>
	 * {@code public String getFirstSelectedOption(WebElement element, String actionInfo)}<br>
	 * This method get selected option name of the dropdown element element. locator
	 * of elements should be pass as argument element. Information of action should
	 * be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element for which class need to get.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @return It will return name of selected option of dropdown element element.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public String getFirstSelectedOption(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		String firstSelectedoption = null;
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			Select select = new Select(element);
			WebElement option = select.getFirstSelectedOption();
			firstSelectedoption = option.getText();
			System.out.println("Getting Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Getting Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get : " + actionInfo + " locator: " + element + ")");
		}

		return firstSelectedoption;
	}

	/**
	 * <h1>getOptions</h1>
	 * {@code public List<String> getOptions(WebElement element, String actionInfo)}<br>
	 * This method get list of all options names of the dropdown element element.
	 * locator of elements should be pass as argument element. Information of action
	 * should be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element for which class need to get.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @return It will return list of all options names of dropdown element element.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public List<String> getOptions(WebElement element, String actionInfo) {
		List<String> allOptions = new ArrayList<>();
		try {
			alerts.acceptAlert();
			Select select = new Select(element);
			new JSExecutor().highlightElement(element);
			List<WebElement> options = select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				allOptions.add(options.get(i).getText());
			}
			System.out.println("Getting Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Getting Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get : " + actionInfo + " locator: " + element + ")");
		}

		return allOptions;
	}

	/**
	 * <h1>getSize</h1>
	 * {@code public int getSize(WebElement element, String actionInfo)}<br>
	 * This method get size of element element. locator of elements should be pass
	 * as argument element. Information of action should be pass as argument
	 * actionInfo.
	 * 
	 * @param element:    locator of element for which class need to get.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @return It will return size value of element element.
	 * @throws RuntimeException if any exception is occur
	 */
	
	  @Override public int getSize(WebElement element, String actionInfo) { 
		  int listSize; 
		  try { 
			  alerts.acceptAlert();
	  
			  WebElement element1 = getElement(element, "Getting element"); 
			  new JSExecutor().highlightElement(element1);
	  
			  int options = getElements(element1).size(); 
			  listSize = options;
			  System.out.println("Getting Successfully: " + actionInfo);
			  extentTest.log(Status.INFO, "Getting Successfully: " + actionInfo); 
		  } catch(Exception e) { 
			  System.out.println("Not able to Get: " + actionInfo + " locator: " + element + ")");
			  //utility.takeScreenshot(actionInfo.replaceAll(" ", "_")); 
			  throw new java.lang.RuntimeException( "RUNTIME_ERROR : : Not able to Get Size : " +
					  actionInfo + " locator: " + element + ")"); } return listSize; }
	 

	/**
	 * <h1>getAttribute</h1>
	 * {@code public String getAttribute(WebElement element, String attribute, String actionInfo)}<br>
	 * This method get attribute value of element element's attribute. locator of
	 * elements should be pass as argument element. attribute name should be pass as
	 * attribute Information of action should be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element for which class need to get.
	 * @param attribute:  name of the attribute whose value need to get
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @return It will return value of given attribute of element element.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public String getAttribute(WebElement element, String attribute, String actionInfo) {
		String attributeValue;
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			attributeValue = element.getAttribute(attribute);
			System.out.println("Getting Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Getting Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Attribute : " + actionInfo + " locator: " + element + ")");
		}

		return attributeValue;
	}

	/**
	 * <h1>getText</h1>
	 * {@code public String getText(WebElement element, String actionInfo)}<br>
	 * This method get text of element element. locator of elements should be pass
	 * as argument element. Information of action should be pass as argument
	 * actionInfo.
	 * 
	 * @param element:    locator of element for which class need to get.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @return It will return text element element.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public String getText(WebElement element, String actionInfo) {
		String textValue;
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			textValue = element.getText();
			System.out.println("Getting Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Getting Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Text : " + actionInfo + " locator: " + element + ")");
		}
		return textValue;
	}

	/**
	 * <h1>setText</h1>
	 * {@code public void setText(WebElement element, String inputText, String actionInfo)}<br>
	 * This method enter text for element element. locator of elements should be
	 * pass as argument element. Input text of element should be pass as argument
	 * inputText. Information of action should be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element for which class need to get.
	 * @param inputText:  text that needs to enter into the element element.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 */
	@Override
	public void setText(WebElement element, String inputText, String actionInfo) {
		
		  //alerts.acceptAlert(); 
		  //System.out.println("After accepting alert");
		  //new JSExecutor().highlightElement(element);
		  //System.out.println("After element highlighter");
		  //element.sendKeys(inputText); 
		  //System.out.println("After sending keys");
		  //System.out.println("Text entered Successfully: " + actionInfo); 
		  //extentTest.log(Status.INFO, "Text entered Successfully: " + actionInfo);
		 
		
		  try { 
			  alerts.acceptAlert();
			  new JSExecutor().highlightElement(element);
			  Thread.sleep(1500);
			  element.sendKeys(inputText); 
			  System.out.println("Text entered Successfully: " + actionInfo); 
			  extentTest.log(Status.INFO, "Text entered Successfully: " + actionInfo); 
		  	} 
		  	catch (Exception e) {
		  		System.out.println("Not able to enter text: " + actionInfo + " locator: " + element + ")"); 
		  		utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
		  		throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to enter text : " + actionInfo + " locator: " + element + ")");
		  	}
		 
	}

	/**
	 * <h1>clearThenSetText</h1>
	 * {@code public void clearThenSetText(WebElement element, String inputText, String actionInfo)}<br>
	 * This method will first clear the entered text then enter the passes text for
	 * element element. locator of elements should be pass as argument element.
	 * Input text of element should be pass as argument inputText. Information of
	 * action should be pass as argument actionInfo.
	 * 
	 * @param element:    locator of element for which class need to get.
	 * @param inputText:  text that needs to enter into the element element.
	 * @param actionInfo: This parameter is information of action will show in
	 *                    Console/ScreenShot name/Logs
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public void clearThenSetText(WebElement element, String inputText, String actionInfo) {
		try {
			alerts.acceptAlert();

			new JSExecutor().highlightElement(element);
			element.clear();
			element.sendKeys(inputText);
			System.out.println("Text entered Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Text entered Successfully: " + actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to enter text: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to enter text : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>getTagName</h1>
	 * {@code public String getTagName(WebElement element, String actionInfo)}<br>
	 * This method returns the tag name of 'element' element. locator of elements
	 * should be pass as argument 'element'. Information of action should be pass as
	 * argument 'actionInfo'
	 * 
	 * @param element    locator of element to Get tag name.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return String tagName of the 'element'.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public String getTagName(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Tag Name Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Tag Name Successfully: " + actionInfo);
			return element.getTagName();

		} catch (Exception e) {
			System.out.println("Not able to Get Tag Name Successfully: " + actionInfo);
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Tag Name : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>isDisplayed</h1>
	 * {@code public boolean isDisplayed(WebElement element, String actionInfo)}<br>
	 * This method returns whether the 'element' element is displayed or not.
	 * locator of elements should be pass as argument 'element'. Information of
	 * action should be pass as argument 'actionInfo'
	 * 
	 * @param element    locator of element.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return True if 'element' element is displayed otherwise False.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public boolean isDisplayed(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Displayed State Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Displayed State Successfully: " + actionInfo);
			return element.isDisplayed();

		} catch (Exception e) {
//			return element.isDisplayed();
			System.out.println("Not able to Get Displayed State: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Displayed State : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>isEnabled</h1>
	 * {@code public boolean isEnabled(WebElement element, String actionInfo)}<br>
	 * This method returns whether the 'element' element is displayed or not.
	 * locator of elements should be pass as argument 'element'. Information of
	 * action should be pass as argument 'actionInfo'
	 * 
	 * @param element    locator of element.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return True if 'element' element is Enabled otherwise False.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public boolean isEnabled(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Enabled State Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Enabled State Successfully: " + actionInfo);
			return element.isEnabled();

		} catch (Exception e) {
			System.out.println("Not able to Get Enabled State: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Enabled State : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>isSelected</h1>
	 * {@code public boolean isSelected(WebElement element, String actionInfo)}<br>
	 * This method returns whether the 'element' element is Selected or not. locator
	 * of elements should be pass as argument 'element'. Information of action
	 * should be pass as argument 'actionInfo'
	 * 
	 * @param element    locator of element.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return True if 'element' element is Selected otherwise False.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public boolean isSelected(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Selected State Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Selected State Successfully: " + actionInfo);
			return element.isSelected();

		} catch (Exception e) {
			System.out.println("Not able to Get Selected State: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Selected State : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>isClickable</h1>
	 * {@code public boolean isClickable(WebElement element, String actionInfo)}<br>
	 * This method returns whether the 'element' element is Clickable or not.
	 * locator of elements should be pass as argument 'element'. Information of
	 * action should be pass as argument 'actionInfo'
	 * 
	 * @param element    locator of element.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return True if 'element' element is Clickable otherwise False.
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public boolean isClickable(WebElement element, String actionInfo) {
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Clickable State Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Clickable State Successfully: " + actionInfo);
			WebDriverWait waitFoElement = new WebDriverWait(getDriver(), 6);
			waitFoElement.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			System.out.println("Not able to Get Clickable State: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Selected State : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>clear</h1>
	 * {@code public void clear(WebElement element, String actionInfo)}<br>
	 * This method clear the 'element' textBox. locator of elements should be pass
	 * as argument 'element'. Information of action should be pass as argument
	 * 'actionInfo'
	 * 
	 * @param element    locator of element.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public void clear(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			element.clear();
			System.out.println("Cleared Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Cleared Successfully: " + actionInfo);

		} catch (Exception e) {
			System.out.println("Not able to Clear: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Clear : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>setMultibleText</h1> {@code public void setMultibleText(String urlPath,
	 *  String[] elementArray, String[] textArray, String actionInfo)}<br>
	 * This method enters texts in multiple TextBoxes. URl of page where elements
	 * textboxes are present should be passed as argument urlPath Array of elements
	 * should be pass as argument '[]elementArray'. Array of texts should be pass as
	 * argument '[]textArray'. Information of action should be pass as argument
	 * 'actionInfo'
	 * 
	 * @param urlPath      URl of Page. Could be null.
	 * @param elementArray locator Array of elements.
	 * @param textArray    Texts Array to enter.
	 * @param actionInfo   This parameter is information of action will show in
	 *                     Console/ScreenShot name/Logs
	 * @throws RuntimeException if any exception is occur
	 */
	/*
	 * @Override public void setMultipleText(String urlPath, String[] elementArray,
	 * String[] textArray, String actionInfo) { // TODO Auto-generated method stub
	 *//**
		 * Make Sure The Text Values are same order as locator values. Also the data
		 * Type should accurate
		 *//*
			 * if (!(urlPath == null)) getDriver().get(urlPath); if (elementArray.length ==
			 * textArray.length) { byte i = 0; try { for (String st : elementArray) {
			 * Thread.sleep(100); clearThenSetText(st, textArray[i], actionInfo); i++; }
			 * Thread.sleep(500); } catch (InterruptedException e) { // TODO: handle
			 * exception } } else {
			 * System.out.println("Size of elementArray is not equal to textArray"); throw
			 * new java.lang.
			 * RuntimeException("RUNTIME_ERROR : : Size of 'elementArray' is not equal to 'textArray' : "
			 * +actionInfo); } }
			 */

	/**
	 * <h1>getElement</h1>
	 * {@code public WebElement getElement(WebElement element, String actionInfo)}<br>
	 * This method returns WebElement of 'element'. locator of elements should be
	 * pass as argument 'element'. Information of action should be pass as argument
	 * 'actionInfo'
	 * 
	 * @param element    locator of element.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return WebElement object.
	 * @throws RuntimeException if any exception is occur
	 */

	@Override
	public WebElement getElement(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Element Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Element Successfully: " + actionInfo);
			return element;

			// log1.info("");
		} catch (Exception e) {
			System.out.println("Not able to Get Element: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Element : " + actionInfo + " locator: " + element + ")");
		}
	}

	/**
	 * <h1>getElements</h1>
	 * {@code public List<WebElement> getElements(WebElement element, String actionInfo)}<br>
	 * This method returns List of WebElement of 'element'. locator of elements
	 * should be pass as argument 'element'. Information of action should be pass as
	 * argument 'actionInfo'
	 * @param <WebElements>
	 * 
	 * @param element    locator of element.
	 * @param actionInfo This parameter is information of action will show in
	 *                   Console/ScreenShot name/Logs
	 * @return List<WebElement> (list of WebElement objects).
	 * @throws RuntimeException if any exception is occur
	 */
	@Override
	public List<WebElement> getElements(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		List<WebElement> elementList = null;
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Elements Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Element Successfully: " + actionInfo);

		} catch (Exception e) {
			System.out.println("Not able to Get Elements: " + actionInfo + " locator: " + element + ")");
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get Elements : " + actionInfo + " locator: " + element + ")");
		}
		return elementList;
	}

	public void inputValueInField(String inputValue) throws AWTException, InterruptedException {
		// Specify the file location with extension
		StringSelection filePath = new StringSelection(inputValue);
		//locator.sendKeys(inputValue);
		// Copy to clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		
			Robot robCtrl = new Robot();
			Thread.sleep(5000);
			robCtrl.keyPress(KeyEvent.VK_CONTROL);
			robCtrl.keyPress(KeyEvent.VK_V);
			robCtrl.keyRelease(KeyEvent.VK_V);
			robCtrl.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			robCtrl.keyPress(KeyEvent.VK_ENTER);
			robCtrl.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		} 

	
	public String getCsscolor(WebElement element, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			alerts.acceptAlert();
			new JSExecutor().highlightElement(element);
			System.out.println("Get Tag Name Successfully: " + actionInfo);
			extentTest.log(Status.INFO, "Get Tag Name Successfully: " + actionInfo);
			return element.getAttribute("class");
//			return element.getCssValue("outline-color");

		} catch (Exception e) {
			System.out.println("Not able to Get CSS color Successfully: " + actionInfo);
			// utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException(
					"RUNTIME_ERROR : : Not able to Get CSS color : " + actionInfo + " locator: " + element + ")");
		}
	}
	
	
	public static void HoverAndClick(WebElement elementToHover,WebElement elementToClick) {
		Actions action = new Actions(getDriver());
		action.moveToElement(elementToHover).moveToElement(elementToClick).click().build().perform();
	}
	
	
	public static void EnterKey(WebElement textbox) {
		textbox.sendKeys(Keys.ENTER);
	}
	
	

}
	

