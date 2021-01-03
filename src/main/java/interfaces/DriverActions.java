package interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface DriverActions {
   
		
	public void click(WebElement selector, String actionInfo);
	
	public  void selectByIndex(WebElement element, int index, String actionInfo);
	
	public void selectByValue(WebElement element, String value, String actionInfo);
	
	public void selectByVisibleText(WebElement element, String text, String actionInfo);
	
	public String getClass(WebElement element, String actionInfo);
	
	public String getFirstSelectedOption(WebElement element, String actionInfo);
	
	public List<String> getOptions(WebElement element, String actionInfo);
	
	//public int getSize(WebElement element, String actionInfo);
	
	public String getAttribute(WebElement element, String attribute, String actionInfo);
	
	public String getText(WebElement element, String actionInfo);
	
	public void setText(WebElement element, String inputText, String actionInfo);
	
	public void clearThenSetText(WebElement element, String inputText, String actionInfo);
	
	public String getTagName(WebElement element, String actionInfo);
	
	public boolean isDisplayed(WebElement element, String actionInfo);
	
	public boolean isEnabled(WebElement element, String actionInfo);
	
	public boolean isSelected(WebElement element, String actionInfo);
	
	public boolean isClickable(WebElement element, String actionInfo);
	
	public void clear(WebElement element, String actionInfo);
	
	//public void setMultipleText(By urlPath, String[] selectorArray, String[] textArray, String actionInfo);
	
	public  WebElement getElement(WebElement element, String actionInfo);

	public  List<WebElement> getElements(WebElement element, String actionInfo);

	public int getSize(WebElement element, String actionInfo);

	//public <WebElements> List<WebElement> getElements(WebElements element, String actionInfo);
	
}