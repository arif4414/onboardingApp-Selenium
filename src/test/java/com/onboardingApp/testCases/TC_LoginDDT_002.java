package com.onboardingApp.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.onboardingApp.pageObjects.LoginPage;
import com.onboardingApp.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickSubmit();
		
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException {
		String xlpath = System.getProperty("user.dir")+"/src/test/java/com/onboardingApp/testData/testCase.xlsx";
		int rowcount = XLUtils.getRowCount(xlpath,"Sheet1");
		int colcount = XLUtils.getCellCount(xlpath, "Sheet1", 1);
		
		String loginData[][] = new String [rowcount][colcount];
		for (int i=1; i<=rowcount; i++) {
			for (int j=0;j<colcount;j++) {
				loginData[i-1][j] = XLUtils.getCellData(xlpath,"Sheet1",i,j);
			}
		}
		return loginData;
		
	}

}
