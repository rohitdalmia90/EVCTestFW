package pageActions;

import java.util.ArrayList;

import frameworkGlobals.BrowserSelection;

public class CommonActions extends BrowserSelection{
	
	public String getDefaultWindowHandle()
	{
		String currentWindowHandle = getDriver().getWindowHandle();
		return currentWindowHandle;
	}
	
	public ArrayList<String> getAllWindowHandles()
	{
		ArrayList<String> tabHandles = new ArrayList<String>(getDriver().getWindowHandles());
		return tabHandles;
	}

	public boolean verifyNewTab(ArrayList<String> tabHandles)
	{
		boolean tabStatus = false;
		int size = tabHandles.size();
		if(size > 1)
		{
			tabStatus = true;
		}
		return tabStatus;
	}
	
	
	public void closeNewWindow(ArrayList<String> handleToSwitch)
	{
		String handleToClose = handleToSwitch.get(handleToSwitch.size() - 1);
		getDriver().switchTo().window(handleToClose);
		getDriver().close();
	}
	
	
	public void switchToWindow(String windowHandle)
	{
		getDriver().switchTo().window(windowHandle);
	}
	
	

	public void refreshPage()
	{
		getDriver().navigate().refresh();
	}
}
