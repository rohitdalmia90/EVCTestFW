package frameworkGlobals;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import interfaces.ClassObject;

public class BrowserSelection extends TestNG implements ClassObject {
	
	public static boolean driverFlag= true;
	/*private static */ WebDriver driver;
	public static WebDriverWait wait;
	public static FluentWait<WebDriver> waitFluent;
	public static Actions action;
	public static JavascriptExecutor jsExecutor;
	public static String imgeHtmlPath;
	public static ExtentTest extentTest;
	public static ExtentTest extentClass;
	public static ExtentReports extentReports;
	public static ExtentHtmlReporter extentReporter;
	public static ThreadLocal<WebDriver> driverLocal = new ThreadLocal<>();
	
	public static String userDir = System.getProperty("user.dir");
	
	String testReport;
	

	@BeforeSuite(alwaysRun = true, enabled = true)
	public void extentSetup(ITestContext testContext)
	{
		String browser = Configurations.getBrowserName();
		testReport = userDir + "\\LogsAndReports\\Reports_"+extentDate+"\\Reports_"+extentDate + ".html";
		extentReporter = new ExtentHtmlReporter(testReport);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentReporter);
		
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Browser", browser);
		
		extentReporter.config().setTheme(Theme.DARK);
		extentReporter.config().setChartVisibilityOnOpen(true);
		extentReporter.config().setDocumentTitle("Extent Report Demo");
		extentReporter.config().setReportName("Test Report");
		extentReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		extentReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
		File file = new File(userDir + "\\LogsAndReports\\Reports_"+extentDate);
		if(!file.exists())
	      {
	        file.mkdir();
	      }
	}


	@Parameters({"browserName", "url"})
	@BeforeClass(alwaysRun = true, enabled = true)
	public  WebDriver initDriver(String browserName, String url) throws IOException, InterruptedException {
		driverFlag = true;		
		extentClass = extentReports.createTest(getClass().getName());

		String browser = browserName.toLowerCase();
		System.out.println("Browser select : "+browser);
		extentClass.log(Status.INFO, "Browser select : "+browser);
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", userDir+Configurations.getDriverPath(browser));
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"false");
			System.out.println("Mozilla firefox selected");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Configurations.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Configurations.getPageLoadTimeout(), TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentClass.log(Status.PASS, "Mozilla firefox open sucessfully");
			wait = new WebDriverWait(driver, Configurations.getExplicitlyWait());
			driver.get(url);
			jsExecutor = (JavascriptExecutor)driver;
			break;

		case "chrome":
			System.setProperty("webdriver.chrome.driver", userDir + Configurations.getDriverPath(browser));
			System.out.println("Google chrome selected");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Configurations.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Configurations.getPageLoadTimeout(), TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentClass.log(Status.PASS, "Google chrome open sucessfully");
			wait = new WebDriverWait(driver, Configurations.getExplicitlyWait());
			driver.get(url);
			jsExecutor = (JavascriptExecutor)driver;
			break;

		case "internet explorer":
			System.setProperty("webdriver.ie.driver", userDir + Configurations.getDriverPath(browser));
			System.out.println("Internet explorer selected");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(Configurations.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Configurations.getPageLoadTimeout(), TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentClass.log(Status.PASS, "Internet explorer open sucessfully");
			wait = new WebDriverWait(driver, Configurations.getExplicitlyWait());
			driver.get(Configurations.getApplicationUrl());
			jsExecutor = (JavascriptExecutor)driver;
			break;

		case "safari":
			System.setProperty("webdriver.safari.driver", userDir + Configurations.getDriverPath(browser));
			System.out.println("Apple safari selected");
			driver = new SafariDriver();
			driver.manage().timeouts().implicitlyWait(Configurations.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Configurations.getPageLoadTimeout(), TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentClass.log(Status.PASS, "Apple safari opened sucessfully");
			wait = new WebDriverWait(driver, Configurations.getExplicitlyWait());
			driver.get(Configurations.getApplicationUrl());
			jsExecutor = (JavascriptExecutor)driver;
			break;

		default:
			System.setProperty("webdriver.gecko.driver", userDir + Configurations.getDriverPath(browser));
			System.out.println("Mozilla Firefox selected");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Configurations.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Configurations.getPageLoadTimeout(), TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			extentClass.log(Status.PASS, "Mozilla Firefox opened sucessfully");
			wait = new WebDriverWait(driver, Configurations.getExplicitlyWait());
			driver.get(Configurations.getApplicationUrl());
			jsExecutor = (JavascriptExecutor)driver;
			break;
		}

		//extentReports.removeTest(extentTest);
		setLocalDriver(driver);
		return driver;
	}

	@BeforeMethod(alwaysRun = true)
	public void test(Method name)
	{
		extentTest = extentClass.createNode(name.getName());
	}

	@AfterMethod(alwaysRun = true, enabled = true)
	public void afterMethod(ITestResult result) throws IOException {
		switch (result.getStatus()) {
	         case 1://Pass
	        	 extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        	 extentTest.log(Status.PASS, "Test passed sucessfully");
				break;
				
			case 2://Fail
				String get_ErrorMessg = result.getThrowable().toString();
				String errorMSg = result.getThrowable().getMessage();
				String actionInfo=result.getName();
				
				if (get_ErrorMessg.contains("AssertionError")) {
					System.out.println("In aftermethod if");
					extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
					extentTest.log(Status.FAIL, "BUGGG >> " + errorMSg);
					utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
					//extentTest.addScreenCaptureFromPath(imgeHtmlPath);
					break;
				}
				
				else if (get_ErrorMessg.contains("RUNTIME_ERROR")) {
					System.out.println("In aftermethod else if");
					extentTest.log(Status.INFO, "Class : " + result.getInstanceName());
					extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
					extentTest.log(Status.ERROR, "" + errorMSg);
					utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
					//extentTest.log(Status.ERROR, "Screenshort of Error :"+ imgeHtmlPath);
					break;
				}
				
				else{
					System.out.println("In aftermethod else");
					if(get_ErrorMessg.contains("Unable to locate element") || get_ErrorMessg.contains("no_such_element")){
						System.out.println("In aftermethod else - if");
						extentTest.log(Status.INFO, "Class : "+  result.getInstanceName());
						extentTest.log(Status.ERROR, "RUNTIME ERROR >> " + errorMSg);
						utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
						extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
						break;
					}
					else{
						System.out.println("In aftermethod else - else");
						extentTest.log(Status.INFO, "Class : " +  result.getInstanceName());
						extentTest.log(Status.ERROR, "RUNTIME ERROR >> " + errorMSg);
						utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
						extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
						break;
					}
				}
			case 3://Skip
				//extentTest = extentReports.createTest(result.getName(), "Class : "+ result.getInstanceName());
				//extentTest.log(Status.INFO, "Class : " + result.getInstanceName());
				extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
				extentTest.log(Status.SKIP, "Test skipped " + result.getThrowable());
				break;
				
			default:
				extentReports.removeTest(extentTest);
				extentClass.log(Status.ERROR, MarkupHelper.createLabel(getClass().getName()+" ERROR ", ExtentColor.PINK));
	    }	   
	    extentReports.flush();
	}


	@AfterClass(alwaysRun = true, enabled = true)
	public void exit()
	{
		System.out.println("Quiting the driver");
		// Quitting browsers after class run
		driver.close();		
	}
	
	
	@Parameters("browserName")
	@AfterSuite(alwaysRun = true, enabled = true)
	public void aftersuite(String browserName) 
	{
		WebDriver driverResult;
			
		String browser = browserName.toLowerCase();
		System.out.println("Browser select : "+browser);
		extentTest.log(Status.INFO, "Browser selected : "+browser);
		
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", userDir+Configurations.getDriverPath(browser));
			driverResult = new FirefoxDriver();
			driverResult.manage().window().maximize();
			driverResult.get("file://" + testReport);
			System.out.println("Report generated successfully :)");
		}
				
		else if(browser.equals("chrome"))
		{		
			System.setProperty("webdriver.chrome.driver", userDir + Configurations.getDriverPath(browser));
			driverResult = new ChromeDriver();
			driverResult.manage().window().maximize();
			driverResult.get("file://" + testReport);
			System.out.println("Report generated successfully :)");
		}	

		else if(browser.equals("internet explorer"))
		{
			System.setProperty("webdriver.ie.driver", userDir + Configurations.getDriverPath(browser));
			driverResult = new InternetExplorerDriver();
			driverResult.manage().window().maximize();
			driverResult.get("file://" + testReport);
			System.out.println("Report generated successfully :)");
		}	
		else if(browser.equals("safari"))
		{
			System.setProperty("webdriver.safari.driver", userDir + Configurations.getDriverPath(browser));
			driverResult = new SafariDriver();
			driverResult.manage().window().maximize();
			driverResult.get("file://" + testReport);
			System.out.println("Report generated successfully :)");
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", userDir+Configurations.getDriverPath(browser));
			driverResult = new FirefoxDriver();
			driverResult.manage().window().maximize();
			driverResult.get("file://" + testReport);
			System.out.println("Report generated successfully :)");
		}
	}
	
	
	public static WebDriver getDriver()
	{
		if (driverFlag) {
			return getLocalDriver();
		} 
			else {
				return getLocalDriver();
		}
	}
	
	public static WebDriver getLocalDriver()
	{
		return driverLocal.get();
	}
	
	public static void setLocalDriver(WebDriver driver)
	{
		driverLocal.set(driver);
	}

}