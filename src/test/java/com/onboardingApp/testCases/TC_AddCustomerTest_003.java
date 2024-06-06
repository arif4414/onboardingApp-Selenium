package com.onboardingApp.testCases;

import org.testng.annotations.Test;

import com.onboardingApp.pageObjects.AddCustomerPage;
import com.onboardingApp.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		AddCustomerPage addCust = new AddCustomerPage(driver);
		addCust.clickAddCustomerLink();
		addCust.custName("Muaaz");
		addCust.selectGender();
		addCust.selectDOB("10", "10", "2010");
		
		
	}
}
