package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import frameworkGlobals.WebActions;
import pageObjects.StudioObjects;

public class StudioActions extends BrowserSelection{

	StudioObjects studioObjects = new StudioObjects();

	public StudioActions()
	{
		  PageFactory.initElements(getDriver(), studioObjects);
	}
	
	public void clickStudio() throws InterruptedException
	{
		//webActions.waitForElement(qaObjects.profileOptn);
		webActions.click(studioObjects.studioOptn, "Clicking on Studio Option");
	}
	
	public void clickSetting() throws InterruptedException
	{
		//webActions.waitForElement(qaObjects.profileOptn);
		webActions.click(studioObjects.settingsOptn, "Clicking on Settings Option");
	}
	
	public void displaySiteSetting() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.siteSettings, "Display site setting");
	}

	public void displayrbacSettings() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.rbacSettings, "Display site setting");
	}
	
	public void displaynavigation() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.navigation, "Display site setting");
	}
	
	public void displaylandingPages() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.landingPages, "Display site setting");
	}
	
	public void displaystudioAccessControl() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.studioAccessControl, "Display site setting");
	}
	
	public void clickStudioAccessControl() throws InterruptedException
	{
	webActions.click(studioObjects.studioAccessControl, "Click on studio acces control");
	}

	public void clickAddStudioAdmin() throws InterruptedException
	{
	webActions.click(studioObjects.addStudioAdmin, "Click on add admin under studio");
	}
	
	public void displayworkflow() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.workflow, "Display site setting");
	}
	
	public void clickMenuBuilder() throws InterruptedException
	{
	webActions.click(studioObjects.navigation, "Click on Menu Builder");
	}
	
	public void clickaddMenuBuilder() throws InterruptedException
	{
	webActions.click(studioObjects.addMenuBuilder, "Click on add button in Menu Builder");
	}
	
	public void clickMenuItem() throws InterruptedException
	{
	webActions.click(studioObjects.addMenuItem, "Select Menu item from dropdown");
	}
	
	public void clickMenuItemApps() throws InterruptedException
	{
	webActions.click(studioObjects.menuItemApps, "Select Apps from menu item");
	}
	
	public void clickMenuItemPages() throws InterruptedException
	{
	webActions.click(studioObjects.menuItemPages, "Select Pages from menu item");
	}
	
	public void clickSelectedApps() throws InterruptedException
	{
	webActions.click(studioObjects.selectApps, "Select eigth App from menu item");
	}
	
	public String getTextSelectedApps() throws InterruptedException
	{
	return webActions.getText(studioObjects.selectApps, "Get text of selected eigth App from menu item");
	}
	
	public void clickAddSelectedApp() throws InterruptedException
	{
	webActions.click(studioObjects.addSelectedApp, "Click on add selected app");
	}
	
	public String getTextSelectedAppDisplay() throws InterruptedException
	{
	return webActions.getText(studioObjects.selectedAppDisplay, "Get text of selected eigth App from menu builder");
	}
	
	public String assertNotification() throws InterruptedException
	{
	return webActions.getText(studioObjects.assertNotification, "Assert notification page");
	}
	
	public void displaySelectedApp() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.selectedAppDisplay, "Display site setting");
	}
	
	public void clickSelectedAppNavigation() throws InterruptedException
	{
	webActions.click(studioObjects.selectedAppDisplay, "Click on selected app");
	}
	
	public void clickShowOnMobileApp() throws InterruptedException
	{
	webActions.click(studioObjects.showOnMobileApp, "Click on show On Mobile App Checkbox");
	}
	
	public void clickHideOnNavigation() throws InterruptedException
	{
	webActions.click(studioObjects.hideOnNavigation, "Click on Hide On Navigation Checkbox");
	}
	
	public void clickSaveMenuBuilder() throws InterruptedException
	{
	webActions.click(studioObjects.saveMenuBuilder, "Click on Save Menu Builder");
	}

	public void clickCancelMenuBuilder() throws InterruptedException
	{
	webActions.click(studioObjects.cancelMenuBuilder, "Click on Cancel Menu Builder");
	}
	
	public void clickokMenuStructure() throws InterruptedException
	{
	webActions.click(studioObjects.okMenuStructureDialogBox, "Click on Ok Menu Structure DialogBox");
	}
	
	public void clickAllUsers() throws InterruptedException
	{
	webActions.click(studioObjects.allUsers, "Click on All users under RBAC");
	}
	
	public void clickRbacSettings() throws InterruptedException
	{
	webActions.click(studioObjects.rbacSettings, "Click on RBAC setting");
	}
	
	public void automationTestRead() throws InterruptedException
	{
	webActions.click(studioObjects.automationTestRead, "Click on read assigning");
	}
	
	public void cancelRBAC() throws InterruptedException
	{
	webActions.click(studioObjects.cancelRBAC, "Click on cancel under RBAC");
	}
	
		public void searchAutomationTest() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.searchAutomationTest, "Automation test displayed");
	}
	
	public void clickExternalLink() throws InterruptedException
	{
	webActions.click(studioObjects.externalLink, "Click on external link menu");
	}
	
	public void clickNewLink() throws InterruptedException
	{
	webActions.click(studioObjects.newLink, "Click on new link menu");
	}
	
	public void enterNewLinkName() throws InterruptedException
	{
	webActions.clearThenSetText(studioObjects.enterNewLinkName, "Automation Link","Clear the link name");
	}
	
	public void enterPathLink() throws InterruptedException
	{
	webActions.clearThenSetText(studioObjects.enterPathLink, "https://www.google.com/","Enter the link name");
	}
	
	public void automationTestLink() throws InterruptedException
	{
	webActions.click(studioObjects.automationTestLink, "Click on read assigning");
	}
	
	public void searchAutomationLink() throws InterruptedException
	{
	webActions.click(studioObjects.searchAutomationLink, "Automation Link clicked");
	}
	
	public void clickGroup() throws InterruptedException
	{
	webActions.click(studioObjects.group, "Click on Group under menu builder");
	}

	public void clickNewGroup() throws InterruptedException
	{
	webActions.click(studioObjects.newGroup, "Click on Group under menu builder");
	}
	
	public void enterNewGroupName() throws InterruptedException
	{
	webActions.clearThenSetText(studioObjects.enterNewLinkName, "Automation Group","Clear the Group name");
	}
	
	public void clickAddInGroup() throws InterruptedException
	{
	webActions.click(studioObjects.addInGroup, "Click on add under new Group");
	}
	
	public void clickAddMenuItemInGroup() throws InterruptedException
	{
	webActions.click(studioObjects.addMenuItemInGroup, "Click on menu item under new Group");
	}
	
	public void clickSelectPages() throws InterruptedException
	{
	webActions.click(studioObjects.selectPages, "Click on pages under menu item");
	}
	
	public void selectOurTeamPage() throws InterruptedException
	{
	webActions.click(studioObjects.ourTeamPage, "Select our team page under pages");
	}

	public void selectColumnPage() throws InterruptedException
	{
	webActions.click(studioObjects.columnPage, "Select column page under pages");
	}

	public void clickArrowAutomationGroup() throws InterruptedException
	{
	webActions.click(studioObjects.arrowAutomationGroup, "Click on Arrow for Automation Group under RBAC");
	}
	
	public void selectReadColumn() throws InterruptedException
	{
	webActions.click(studioObjects.readColumn, "Select read checkbox for column page");
	}
	
	public void selectReadOurTeam() throws InterruptedException
	{
	webActions.click(studioObjects.readOurTeam, "Select read checkbox for our Team page");
	}
	
	public void mobileChkboxGroup() throws InterruptedException
	{
	webActions.click(studioObjects.mobileChkboxGroup, "Click on mobile chk box for new group");
	}
	
	public void hoverAndClickAddNewGroup() throws InterruptedException
	{
		WebActions.HoverAndClick(studioObjects.newGroup, studioObjects.addInNewGroup);
//	webActions.click(studioObjects.mobileChkboxGroup, "Click on mobile chk box for new group");
	}

	public void searchAutomationGroup() throws InterruptedException
	{
	webActions.click(studioObjects.searchAutomationGroup, "Search Automation Group on main page");
	}
	
	public void displayColumnGroup() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.displayColumnGroup, "Checking display of 3 column on main page");
	}
	
	public void displayOurTeamGroup() throws InterruptedException
	{
	webActions.isDisplayed(studioObjects.displayOurTeamGroup, "Checking display of our team on main page");
	}
	
	public void clickNotification() throws InterruptedException
	{
	webActions.click(studioObjects.notification, "Click on notification");
	}
	
	public void enterUserAdminEmail() throws InterruptedException
	{
	webActions.setText(studioObjects.enterUserAdminEmail,"ss@txstage.unifyed.com", "Entered admin mail id");
	}

	public void clickAddAdminEmail() throws InterruptedException
	{
	webActions.click(studioObjects.addAdminEmail, "Click on add for adding admin email");
	}
	
	public void clickSiteSettings() throws InterruptedException
	{
	webActions.click(studioObjects.siteSettings, "Click on site settings");
	}
	
	public void clickSiteFeatures() throws InterruptedException
	{
	webActions.click(studioObjects.siteFeatures, "Click on site features");
	}
	
	public void clickFavoriteSiteFeatures() throws InterruptedException
	{
	webActions.click(studioObjects.favoriteSiteFeatures, "Click on favorite Site Features");
	}
	
}
