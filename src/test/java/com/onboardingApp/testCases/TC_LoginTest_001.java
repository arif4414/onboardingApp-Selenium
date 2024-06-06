package com.onboardingApp.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.onboardingApp.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL); //already created this in BaseClass: not needed here
		logger.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username entered");
		lp.setPassword(password);
		logger.info("password entered");
		lp.clickSubmit();
		
		if (driver.getTitle().equals("ABCD")) 
		{
			Assert.assertTrue(true);
			logger.info("Login test Passed");
		}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertFalse(false);
			logger.info("Login test failed");
		}
			
	}
	

}
