package ftuTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import frameworkGlobals.BrowserSelection;
import objectRepositoty.OtherObjects;
import pageActions.CommonActions;
import pageActions.HomePageActions;
import pageActions.QAPageActions;
import webTest.CommonTestFunctions;
import io.restassured.RestAssured;

public class FTUCreation extends BrowserSelection implements OtherObjects {

	CommonTestFunctions commonFunctions;
	HomePageActions homeActions;
	QAPageActions qaActions;
	CommonActions commonActions;

	@Parameters({ "userName", "password" })
	@BeforeClass
	public void loggingIn(String userName, String password) throws InterruptedException {
		// Calling Objects
		commonFunctions = new CommonTestFunctions();
		homeActions = new HomePageActions();
		commonActions = new CommonActions();
		qaActions = new QAPageActions();

		// Logging Into the App
		commonFunctions.logIn(userName, password);
	}
	
	@Test(priority = 1, enabled = true)
	public void verifyCreationProfile() throws InterruptedException, AWTException {

		homeActions.waitForPageLoad();
		webActions.hardSleep();

//		String headingText = qaActions.assertAnoncementHeading();
//		AssertJUnit.assertEquals(headingText, "Announcement Test#2");
		String cookievalue = null;
		for (Cookie cookie : BrowserSelection.getDriver().manage().getCookies()) {
			if ("connect.sid".equalsIgnoreCase(cookie.getName())) {
				cookievalue = cookie.getValue();
				System.out.println("cookie value is" + cookievalue);
			}
		}
		
		if (cookievalue != null) {
			// fetch an access token
			String access_token = RestAssured.given().cookie("connect.sid", cookievalue).when()
					.get("https://txstage.unifyed.com/userinfo").then().statusCode(200).extract().jsonPath()
					.get("accessToken");
			System.out.println("access token is" + access_token);
			Map<String, Object> headerMap = new HashMap<String, Object>();
			headerMap.put("Authorization", "Bearer " + access_token);
			headerMap.put("X-TENANT-DOMAIN", "txstage.unifyed.com");
			headerMap.put("X-TENANT-ID", "txstage");
			String id = RestAssured.given().cookie("connect.sid", cookievalue).headers(headerMap).when().get(
					"https://txstage.unifyed.com/unifyd-gateway-preprod/api/unifydidentity/user/search/findOneByEmail?email=nf@txstage.unifyed.com")
					.then().statusCode(200).extract().jsonPath().get("id");
			System.out.println("id is :" + id);
			RestAssured.given().cookie("connect.sid", cookievalue).headers(headerMap).when()
					.delete("https://txstage.unifyed.com/unifyd-gateway-stage-verify/api/unifydidentity/user/" + id);

		} else {
			System.out.println("test failed");
		}
	}

	@AfterClass
	public void logginOut() throws InterruptedException {
		commonFunctions.logOut();
	}

}
