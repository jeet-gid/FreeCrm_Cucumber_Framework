package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.freecrm.utlis.TestBase;
import com.freecrm.utlis.TestUtils;

public class SearchCompanyPage extends TestBase {

	@FindBy(id= "cs_name")
	WebElement search_company_name;
	
	@FindBy(name = "cs_industry")
	WebElement search_industry;
	
	@FindBy(xpath = "//form[@id='compForm']/table/tbody/tr[1]/td/input[@value='Search Companies']")
	WebElement search_company_btn;
	
	
	public void verifyCompanyAdded(){
		TestBase.enterData(search_company_name, TestUtils.COMPANY_NAME);
		TestBase.enterData(search_industry, TestUtils.INDUSTRY_NAME);
		TestBase.clickByJavaScriptExecutor(driver, search_company_btn);
	}
}
