package frameworkGlobals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configurations {
	
	//Getting the project directory
	static String userDir = System.getProperty("user.dir");
	
	private static Properties properties;
	
	//Getting the file path of property file
	private final String propertyFilePath= userDir + "//src//main//resources//Files//config.properties";
	
	//Getting the file path of excel file
	static String filePath = userDir + "//src//main//resources//Files//AutomationControlSheet.xlsx";
	
	public Configurations() 
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}	
	}

	
	/*
	 * public static String getBrowserName() { String browserName =
	 * properties.getProperty("browserName"); if(browserName != null) return
	 * browserName; else throw new
	 * RuntimeException("implicitlyWait not specified in the Configuration.properties file."
	 * ); }
	 */
	
	public static String getBrowserName()
	{
		String browser = "Firefox";
		return browser;
	}
	
	//public static String getBrowserName()
	//{
	//	String browser = null;
	//	try
	//	{
	//		FileInputStream inputStream = new FileInputStream(filePath);
	//		
	//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	//		XSSFSheet sheet = workbook.getSheetAt(0);
	//		Cell cell = sheet.getRow(1).getCell(1); 
	//		String browserName = cell.getStringCellValue();
	//		browser = browserName; 
	//		//workbook.close();	
	//	}
	//	catch (Exception e) 
	//	{
	//		System.out.println(e.getMessage());
	//	}
	//	return browser;
	//}
	
	public static String getDriverPath(String browserDriverPath)
	{
		if (browserDriverPath.equalsIgnoreCase("internet explorer"))
		{
			String driverPath = "//src//main//resources//BrowserExecutables//iedriver.exe";
			return driverPath;
		}
		
		else if(browserDriverPath.equalsIgnoreCase("chrome")) 
		{
			String driverPath = "//src//main//resources//BrowserExecutables//chromedriver.exe";
			return driverPath;			
		}
		
		else if(browserDriverPath.equalsIgnoreCase("edge")) 
		{
			String driverPath = "//src//main//resources//BrowserExecutables//msedgedriver.exe";
			return driverPath;			
		}
		
		else if(browserDriverPath.equalsIgnoreCase("firefox")) 
		{
			String driverPath = "//src//main//resources//BrowserExecutables//geckodriver.exe";
			return driverPath;			
		}
		
		else if (browserDriverPath.equalsIgnoreCase("safari"))
		{
			String driverPath = "//src//main//resources//BrowserExecutables//safaridriver.exe";
			return driverPath;
		}
			
		else throw new RuntimeException("specified browser driver not exist in the Configuration.properties file."); 
	}
			 
	public static long getImplicitlyWait() 
	{ 
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	}
	
	public static long getExplicitlyWait() 
	{ 
		String explicitlyWait = properties.getProperty("explicitlyWait");
		if(explicitlyWait != null) return Long.parseLong(explicitlyWait);
		else throw new RuntimeException("explicitlyWait not specified in the Configuration.properties file."); 
	}
	
	public static long getPageLoadTimeout() 
	{ 
		String pageLoadTimeOut = properties.getProperty("pageLoadTimeOut");
		if(pageLoadTimeOut != null) return Long.parseLong(pageLoadTimeOut);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	}
			 
	public static String getApplicationUrl() 
	{
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
}
