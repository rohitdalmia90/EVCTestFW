package pageActions;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import frameworkGlobals.BrowserSelection;
import pageObjects.QAProfileObjects;

public class QAPageActions extends BrowserSelection {

	QAProfileObjects qaObjects = new QAProfileObjects();

	public QAPageActions()
	{
		  PageFactory.initElements(getDriver(), qaObjects);
	}
	
	public void clickProfileOptn() throws InterruptedException
	{
		webActions.waitForElement(qaObjects.profileOptn);
		webActions.click(qaObjects.profileOptn, "Clicking on Profile Option in DD");
	}
	
	public String assertAnoncementHeading() throws InterruptedException
	{
		webActions.waitForElement(qaObjects.announcementHeading);
		return webActions.getText(qaObjects.announcementHeading, "Checking page display title anouncement Heading");
	}
	
	public void clickProfileDropDown() throws InterruptedException
	{
		//webActions.waitForElement(qaObjects.profileOptn);
		webActions.click(qaObjects.profileDropDown, "Clicking on Profile Option");
	}
	
	public void clickEdit() throws InterruptedException
	{
		//webActions.waitForElement(qaObjects.profileOptn);
		webActions.click(qaObjects.editClick, "Clicking on Edit Option");
	}
	
	public void cameraContainerDisplay() throws InterruptedException
	{
		//webActions.waitForElement(qaObjects.profileOptn);
		webActions.isDisplayed(qaObjects.cameraContainer, "Camera is visible");
	}
	
	public void cameraContainerClick() throws InterruptedException
	{
		//webActions.waitForElement(qaObjects.profileOptn);
		webActions.click(qaObjects.cameraContainer, "Camera is visible");
	}
	
	public void cameraContainerupload() throws InterruptedException, AWTException
	{
		webActions.inputValueInField("C:\\Users\\alisha.baweja\\Pictures\\screenshoot.png");
		//webActions.waitForElement(qaObjects.profileOptn);
		//webActions.click(qaObjects.cameraContainer, "Camera is visible");
	}
	
	public void cameraContainerEditUpload() throws InterruptedException, AWTException
	{
		webActions.inputValueInField("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		//webActions.waitForElement(qaObjects.profileOptn);
		//webActions.click(qaObjects.cameraContainer, "Camera is visible");
	}
	
	public void cropImageClick() throws InterruptedException
	{
		webActions.click(qaObjects.cropImage, "Click on Crop image button");
	}
	
	public void saveAllClick() throws InterruptedException
	{
		webActions.click(qaObjects.saveAll, "Click on save all button");
	}
	
	public void preferencesClick() throws InterruptedException
	{
		webActions.click(qaObjects.preferences, "Click on Preferences button");
	}
	
	public String assertRbacSetting() throws InterruptedException
	{
		webActions.waitForElement(qaObjects.rbacSetting);
		return webActions.getText(qaObjects.rbacSetting, "Checking page display title Rbac Setting");
	}
	
	public void updateProfileImageButtonClick() throws InterruptedException
	{
		webActions.click(qaObjects.updateProfileImageButton, "Click on Update ProfileImage button");
	}
	
	public void preferenceSaveAllClick() throws InterruptedException
	{
		webActions.click(qaObjects.preferenceSaveAll, "Click on Preference SaveAll button");
	}
	
	public void cancelClick() throws InterruptedException
	{
		webActions.click(qaObjects.cancel, "Click on Cancel button");
	}
	
	public void athleticsInterestsClick() throws InterruptedException
	{
		webActions.click(qaObjects.athleticsInterests, "Select Interest");
	}
	
	public void academicsInterestsClick() throws InterruptedException
	{
		webActions.click(qaObjects.academicsInterests, "Select Interest");
	}
	
	public void clubsInterestsClick() throws InterruptedException
	{
		webActions.click(qaObjects.clubsInterests, "Select Interest");
	}
	
	public void manageCategoriesClick() throws InterruptedException
	{
		webActions.click(qaObjects.manageCategories, "Select manage under Manage Categories");
	}
	
	public void createCategoriesClick() throws InterruptedException
	{
		webActions.click(qaObjects.createCategories, "Click on create category");
	}
	
	public void saveCategoryClick() throws InterruptedException
	{
		webActions.click(qaObjects.saveCategory, "Click save category");
		webActions.isDisplayed(qaObjects.categoryCheck, "Check category created");
	}
	
	public void enterCategoryClick() throws InterruptedException
	{
		webActions.click(qaObjects.enterCategoryName, "Click on category");
	}
	
	public void enterCategoryName() throws InterruptedException, AWTException
	{
		webActions.setText(qaObjects.enterCategoryName, "Automation test", "Enter text to create category name");
	}
	
	public void categoryCheck() throws InterruptedException, AWTException
	{
		webActions.isDisplayed(qaObjects.categoryCheck, "Enter text to create category name");
	}

	public String assertftuLoginPage() throws InterruptedException
	{
		webActions.waitForElement(qaObjects.ftuLoginPage);
		return webActions.getText(qaObjects.ftuLoginPage, "To receive the latest updates please select at least one or more than one categories that applies to you.");
	}
	
	public void ftuCategorySelection() throws InterruptedException
	{
		webActions.click(qaObjects.ftuCategorySelection, "Click on FTU category");
	}
	
	public void ftuCategorySelectionDone() throws InterruptedException
	{
		webActions.click(qaObjects.selectionDone, "Click on FTU Done button");
	}
	
	public void editAcademicsCategoryClick() throws InterruptedException
	{
		webActions.click(qaObjects.editAcademicsCategory, "Click on edit category button");
	}
	
	public void connectAudiencesClick() throws InterruptedException
	{
		webActions.click(qaObjects.connectAudiences, "Click on connect audience box");
	}
	
	public void connectAudiencesEnterText() throws InterruptedException
	{
		webActions.setText(qaObjects.connectAudiences, "ftuGroup", "Enter text to create category name");
	}
	
	public void selectAudiencesClick() throws InterruptedException
	{
		webActions.click(qaObjects.selectAudiences,"select entered category");
	}
	
	public void optInClick() throws InterruptedException
	{
		webActions.click(qaObjects.optIn,"Click on optIn option");
	}
	
	public void termsCheckboxClick() throws InterruptedException
	{
		webActions.click(qaObjects.termsCheckbox,"Click on term condition checkbox");
	}

	public void acceptTermsClick() throws InterruptedException
	{
		webActions.click(qaObjects.acceptTerms,"Click on accept terms");
	}

	public String ftuAcademicColor() throws InterruptedException
	{
		return webActions.getCsscolor(qaObjects.ftuAcademics,"Get class name of academic category");
	}
	
	public void ftuAcademicClick() throws InterruptedException
	{
		webActions.click(qaObjects.ftuAcademics,"Click on term condition checkbox");
	}
	
	public String ftuDone() throws InterruptedException
	{
		return webActions.getCsscolor(qaObjects.ftuDone,"Get class name of done");
	}
	
	public void ftuDoneClick() throws InterruptedException
	{
		webActions.click(qaObjects.ftuDone,"Click on done");
	}

	public void lockClick() throws InterruptedException
	{
		webActions.click(qaObjects.lock,"To lock");
	}
	
	public void unLockClick() throws InterruptedException
	{
		webActions.click(qaObjects.unLock,"To Unlock");
	}
}
