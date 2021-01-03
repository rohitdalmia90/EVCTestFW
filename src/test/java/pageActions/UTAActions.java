package pageActions;

import java.util.ArrayList;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import frameworkGlobals.BrowserSelection;
import pageObjects.UTAObjects;

public class UTAActions extends BrowserSelection{
	
	UTAObjects utaObjects = new UTAObjects();

	public UTAActions()
	{
		  PageFactory.initElements(getDriver(), utaObjects);
	}
	
	
	public void waitForPageLoad() throws InterruptedException
	{
		webActions.waitForElement(utaObjects.sideBar);
	}

	
	public void enterValueInSearchField(String searchFor){
		webActions.clearThenSetText(utaObjects.searchField, searchFor, "Entering the value into the search field");
	}
	
	
	public String getDefaultWindowHandle()
	{
		String currentWindowHandle = getDriver().getWindowHandle();
		return currentWindowHandle;
	}
	
	
	public void waitForAuthorizationWindow() throws InterruptedException
	{
		webActions.hardSleep();
		webActions.hardSleep();
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
	
	
	public void clickMyUTPortal101Optn() throws InterruptedException
	{
		webActions.click(utaObjects.myUTPortal101Optn, "Clicking on Connect option");
		Thread.sleep(1000);
	}
	
	
	public void clickAssignmentMyUTPortal101Optn(String mainWindowHandle) throws InterruptedException
	{
		boolean flag = webActions.isDisplayed(utaObjects.assignmentMyUTPortal101, "Verifying the assignment option");
		if(flag)
		{
			webActions.click(utaObjects.assignmentMyUTPortal101, "Clicking on Connect option");
			Thread.sleep(1000);
		}
		else
		{
			webActions.click(utaObjects.myUTPortal101Optn, "Clicking on Connect option");
			Thread.sleep(1000);
			ArrayList<String> allWindowHandles = getAllWindowHandles();
			closeNewWindow(allWindowHandles);
			switchToWindow(mainWindowHandle);
			webActions.click(utaObjects.assignmentMyUTPortal101, "Clicking on Connect option");
		}
	}
	
	
	public int getSizeOfAssignmentSection() throws InterruptedException
	{
		int returnable = utaObjects.assignmentSectionMyUTPortal101.size();
		return returnable;
	}
	
	
	public void clickDiscussionMyUTPortal101Optn(String mainWindowHandle) throws InterruptedException
	{
		boolean flag = webActions.isDisplayed(utaObjects.discussionMyUTPortal101, "Verifying the assignment option");
		if(flag)
		{
			webActions.click(utaObjects.discussionMyUTPortal101, "Clicking on Connect option");
			Thread.sleep(1000);
		}
		else
		{
			webActions.click(utaObjects.myUTPortal101Optn, "Clicking on Connect option");
			Thread.sleep(1000);
			ArrayList<String> allWindowHandles = getAllWindowHandles();
			closeNewWindow(allWindowHandles);
			switchToWindow(mainWindowHandle);
			webActions.click(utaObjects.discussionMyUTPortal101, "Clicking on Connect option");
		}
	}
	
	
	public int getSizeOfDiscussionSection() throws InterruptedException
	{
		int returnable = utaObjects.discussionSectionMyUTPortal101.size();
		return returnable;
	}
	
	
	public void clickGradesMyUTPortal101Optn(String mainWindowHandle) throws InterruptedException
	{
		boolean flag = webActions.isDisplayed(utaObjects.gradesMyUTPortal101, "Verifying the assignment option");
		if(flag)
		{
			webActions.click(utaObjects.gradesMyUTPortal101, "Clicking on Connect option");
			Thread.sleep(1000);
		}
		else
		{
			webActions.click(utaObjects.myUTPortal101Optn, "Clicking on Connect option");
			Thread.sleep(1000);
			ArrayList<String> allWindowHandles = getAllWindowHandles();
			closeNewWindow(allWindowHandles);
			switchToWindow(mainWindowHandle);
			webActions.click(utaObjects.gradesMyUTPortal101, "Clicking on Connect option");
		}
	}
	
	
	public int getSizeOfGradesSection() throws InterruptedException
	{
		int returnable = utaObjects.gradesSectionMyUTPortal101.size();
		return returnable;
	}
	
	
	public void clickFilesMyUTPortal101Optn(String mainWindowHandle) throws InterruptedException
	{
		boolean flag = webActions.isDisplayed(utaObjects.filesMyUTPortal101, "Verifying the assignment option");
		if(flag)
		{
			webActions.click(utaObjects.filesMyUTPortal101, "Clicking on Connect option");
			Thread.sleep(1000);
		}
		else
		{
			webActions.click(utaObjects.myUTPortal101Optn, "Clicking on Connect option");
			Thread.sleep(1000);
			ArrayList<String> allWindowHandles = getAllWindowHandles();
			closeNewWindow(allWindowHandles);
			switchToWindow(mainWindowHandle);
			webActions.click(utaObjects.filesMyUTPortal101, "Clicking on Connect option");
		}
	}
	
	
	public int getSizeOfFilesSection() throws InterruptedException
	{
		int returnable = utaObjects.filesSectionMyUTPortal101.size();
		return returnable;
	}
	
	
	public void clickSyllabusMyUTPortal101Optn(String mainWindowHandle) throws InterruptedException
	{
		boolean flag = webActions.isDisplayed(utaObjects.syllabusMyUTPortal101, "Verifying the assignment option");
		if(flag)
		{
			webActions.click(utaObjects.syllabusMyUTPortal101, "Clicking on Connect option");
			Thread.sleep(1000);
		}
		else
		{
			webActions.click(utaObjects.myUTPortal101Optn, "Clicking on Connect option");
			Thread.sleep(1000);
			ArrayList<String> allWindowHandles = getAllWindowHandles();
			closeNewWindow(allWindowHandles);
			switchToWindow(mainWindowHandle);
			webActions.click(utaObjects.syllabusMyUTPortal101, "Clicking on Connect option");
		}
	}
	
	
	public int getSizeOfSyllabusSection() throws InterruptedException
	{
		int returnable = utaObjects.syllabusSectionMyUTPortal101.size();
		return returnable;
	}
	
	
	public void switchIfUsrLoginFstTymUTA(boolean flag, ArrayList<String> handleToSwitch, String parentWindow) throws InterruptedException
	{
		if(flag)
		{
			String handleToClose = handleToSwitch.get(handleToSwitch.size() - 1);
			getDriver().switchTo().window(handleToClose);
			webActions.click(utaObjects.authorizeUserUTA, "Clicked on authorize button");
			Thread.sleep(5000);
			switchToWindow(parentWindow);
			int titleSize = getSizeHomeHeadingUTA();
			Assert.assertEquals(titleSize, 1);
		}
		else {
			System.out.println("User has already accepted authorization popup");
		}
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
	
	
	public String getTitleOfNewTabAndClose(ArrayList<String> allTabHandles, String parentWindowHandle) throws InterruptedException
	{
		String pageTitle = null;
		//Switch focus to New tab
		String tabToSwitch = allTabHandles.get(allTabHandles.size() - 1);
		getDriver().switchTo().window(tabToSwitch);   
		webActions.hardSleep();
		pageTitle =getDriver().getTitle();
		System.out.println("New page title is: " + pageTitle);
		getDriver().close();
		getDriver().switchTo().window(parentWindowHandle);
		return pageTitle;

	}
	
	
	public boolean verifyTitleOfNewTab(String newPageTitle, ArrayList<String> tabHandles, String currentPageHandle)
	{
		String pageTitle = newPageTitle;
		boolean myNewTabFound = false;
		for(String eachHandle : tabHandles)
		{
		    getDriver().switchTo().window(eachHandle);
		    // Check Your Page Title 
		    if(getDriver().getTitle().equalsIgnoreCase(pageTitle))
		    {
		        //Switch focus to Old tab
		    	getDriver().switchTo().window(currentPageHandle);
		        myNewTabFound = true;           
		    }
		}
		return myNewTabFound;
	}
	
	public int getSizeOfFilterDD()
	{
		int filterSize = webActions.getSize(utaObjects.yourPrefrencesFiltrOptn, "Getting size of filter DD");
		return filterSize;
	}
	
	public void clearValueOfSearchField(){
		webActions.clear(utaObjects.searchField, "Entering the value into the search field");
	}
	
	public void clickVideosOptnSpan()
	{
		webActions.click(utaObjects.videoInNavBarSpan, "Clicking on video button");
	}
	
	public int getSizeOfVideoHeadline()
	{
		int size = webActions.getSize(utaObjects.videosHeadline, "Getting size of video headline");
		return size;
	}
	
	public int getSizeOfVideoOnPage()
	{
		int size = utaObjects.videosOnPage.size();
		return size;
	}
	
	public int getSizeHomeHeadingUTA()
	{
		int textSize = utaObjects.myHomeHeadingUTA.size();
		return textSize;
	}
	
	public int getSizeClassScheduleUTA()
	{
		int textSize = utaObjects.classScheduleTextUTA.size();
		return textSize;
	}

	
}
