package com.salesforce.pages;

import com.framework.testng.api.base.TestBase;

public class InventoryPage extends TestBase {
	
	public InventoryPage validateInventoryPageUrl() {
		verifyUrl("https://www.saucedemo.com/inventory.html");		
		return this;
	}

}