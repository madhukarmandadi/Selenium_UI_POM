package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.TestBase;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyLogin extends TestBase {
	
	@BeforeTest
	public void beforeTest() {
		testcaseName = "VerifyLogin";
		testDescription = "Verify Login functionality with positive data";
		authors = "Karthikeyan";
		category = "Smoke";
	}
	
	@Test
	public void runLogin() {
		new LoginPage()
		.enterUsername("standard_user")
		.enterPassword("secret_sauce")
		.clickLoginBtn()
		.validateInventoryPageUrl();
	}	

}