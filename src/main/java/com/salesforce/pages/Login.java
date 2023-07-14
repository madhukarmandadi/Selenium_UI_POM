package com.salesforce.pages;

import org.openqa.selenium.By;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.TestBase;

public class Login extends TestBase{
	
	public static final String LoginRegisterButton="header:nth-child(1) > div:nth-child(1) > nav:nth-child(1) > div:nth-child(3) > ul:nth-child(2) > li:nth-child(3)";
	
	public static final String linkLogin="Login";
	
	public static final String textEmail="email";
	
	public static final String textPassword="password";
	
	public static final String btnLogin="//button[@type='submit']";
	
	public static final String close="//*[@class='dice-icon icon-delete-1  dismiss-icon-spacing']";
	
	
	
	
	
	public Login closebutton() {
		click(locateElement(Locators.XPATH,close));
		return this;
	}
	
	public Login hoverOnLoginRegisterButton() {
		moveToElement(locateElement(Locators.CSS,LoginRegisterButton));
		return this;
	}
	
	public Login clickLoginLink() {
		click(locateElement(Locators.LINK_TEXT,linkLogin));
		return this;
	}
	
	public Login enterUsername(String username) {
		type(locateElement(Locators.ID,textEmail), username);
		return this;
	}
	
	public Login enterPassword(String password) {
		type(locateElement(Locators.ID, textPassword), password);
		return this;
	}
	
	public InventoryPage clickLoginBtn() {
		click(locateElement(Locators.XPATH, btnLogin));
		return new InventoryPage();
	}

}
