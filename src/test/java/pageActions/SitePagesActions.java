package pageActions;

import org.openqa.selenium.support.PageFactory;

import frameworkGlobals.BrowserSelection;
import pageObjects.SitePagesObjects;

public class SitePagesActions extends BrowserSelection{
	
	SitePagesObjects sitePagesObjects = new SitePagesObjects();
	
	public SitePagesActions()
	{
		  PageFactory.initElements(getDriver(), sitePagesObjects);
	}

	public void clickSitesAndPages() throws InterruptedException
	{
		webActions.click(sitePagesObjects.sitesAndPages, "Click on sites and pages icon");
	}

	public void clickCreateNew() throws InterruptedException
	{
		webActions.click(sitePagesObjects.createNew, "Click on create new");
	}
	
	public void clickCreatePage() throws InterruptedException
	{
		webActions.click(sitePagesObjects.createPage, "Click on create page");
	}
	
	public void selectPageLayout() throws InterruptedException
	{
		webActions.click(sitePagesObjects.pageLayout, "Select 2 column page layout");
	}
	
	public void clickAddPage() throws InterruptedException
	{
		webActions.click(sitePagesObjects.addPage, "Click on add page");
	}
	
	public void clickSetting() throws InterruptedException
	{
		webActions.click(sitePagesObjects.setting, "Click on setting of 2 column");
	}
	
	public void clickEditIcon() throws InterruptedException
	{
		webActions.click(sitePagesObjects.editIcon, "Click on edit icon of 2 column");
	}
	
	public void selectIcon() throws InterruptedException
	{
		webActions.click(sitePagesObjects.icon, "Select third icon");
	}
	
	public void clickSaveEditIcon() throws InterruptedException
	{
		webActions.click(sitePagesObjects.saveEditIcon, "Click on save after editing icon");
	}
	
	public void clickmanagePage() throws InterruptedException
	{
		webActions.click(sitePagesObjects.managePage, "Click on manage page icon of 2 column");
	}
	
	public void editPageName() throws InterruptedException
	{
	webActions.setText(sitePagesObjects.pageName,"Auto page","Enter the page name");
	}
	
	public void editPageTitle() throws InterruptedException
	{
	webActions.setText(sitePagesObjects.pageTitle,"Auto page title","Enter the page title");
	}
	
	public void selectCategory() throws InterruptedException
	{
		webActions.click(sitePagesObjects.searchCategory, "Click on search category");
		webActions.click(sitePagesObjects.selectCategory, "Select category as academic");
	}
	
	public void selectTag() throws InterruptedException
	{
		webActions.click(sitePagesObjects.clickSelectTag, "Click on select tag");
		webActions.click(sitePagesObjects.selectTag, "Select abc tag");
	}
	
	public void clickSaveManagePage() throws InterruptedException
	{
		webActions.click(sitePagesObjects.saveManagePage, "Click on save after manage page details");
	}
	
	public void clickOkPopUpManage() throws InterruptedException
	{
		webActions.click(sitePagesObjects.okPopUpManage, "Click on ok for manage popup");
	}

	public void clickCloseManagePage() throws InterruptedException
	{
		webActions.click(sitePagesObjects.closeManagePage, "Click on close manage page");
	}
	
	public void clickSaveAsTemplate() throws InterruptedException
	{
		webActions.click(sitePagesObjects.saveAsTemplate, "Click on save as template");
	}
	
	public void entertTemplateName() throws InterruptedException
	{
	webActions.setText(sitePagesObjects.templateName,"Auto template56","Enter the template name");
	}
	
	public void clickSaveTemplateName() throws InterruptedException
	{
		webActions.click(sitePagesObjects.saveTemplateName, "Click on save as template name");
	}
	
	public void clickDelete() throws InterruptedException
	{
		webActions.click(sitePagesObjects.delete, "Click on delete");
	}

	public void clickDeleteDialogBox() throws InterruptedException
	{
		webActions.click(sitePagesObjects.deleteDialogBox, "Click on delete of dialog box");
	}
	
}
