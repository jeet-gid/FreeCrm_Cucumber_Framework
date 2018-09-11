package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utlis.TestBase;
import com.freecrm.utlis.TestUtils;

public class NewCompany extends TestBase{

	@FindBy(xpath = "//input[@id='company_name']")
	WebElement company_name;
	
	@FindBy(name="industry")
	WebElement industry_name;
	
	@FindBy(xpath = "//[@name='status']")
	WebElement status_drop_down;
	
	@FindBy(xpath="//select[@name='category']")
	WebElement category_drop_down;
	
	@FindBy(xpath = "//form[@id='companyForm']/table/tbody/tr[1]/td/input")
	WebElement save_btn;
	
	public NewCompany(){
		PageFactory.initElements(driver, this);
	}
	
	public void createCompany(){
		TestBase.enterData(company_name,TestUtils.COMPANY_NAME);
		TestBase.enterData(industry_name, TestUtils.INDUSTRY_NAME);
		TestBase.selectItemInDropDown(status_drop_down, TestUtils.COMPANY_STATUS);
		TestBase.selectItemInDropDown(category_drop_down, TestUtils.COMPANY_CATEGORY);
		TestBase.clickOnElement(save_btn);
		System.out.println("Company added successfully");
	}
}
