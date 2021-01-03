package utilities;

import org.testng.Assert;
import frameworkGlobals.BrowserSelection;

public class Asserts extends BrowserSelection{
	
	public void assertEquals(String actual, String expected)
	{
		Assert.assertEquals(actual, expected);
	}
	
	public void assertEquals(int actual, int expected)
	{
		Assert.assertEquals(actual, expected);
	}
	
	public void assertEquals(boolean actual, boolean expected)
	{
		Assert.assertEquals(actual, expected);
	}
	
	public void assertEquals(char actual, char expected)
	{
		Assert.assertEquals(actual, expected);
	}

}
