package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utlis.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@title='Companies']")
	WebElement companies_menu;
	
	@FindBy(xpath ="//a[@title='Contacts']")
	WebElement contacts_menu;
	
	@FindBy(xpath = "//a[@title='Deals']")
	WebElement deals_menu;
	
	@FindBy(xpath = "//a[@title='Tasks']")
	WebElement tasks_menu;
	
	@FindBy(xpath = "//a[@title='New Company']")
	WebElement new_company;
	
	@FindBy(xpath = "//div[@id='navmenu']/ul/li[3]/ul/li[2]/a")
	WebElement company_combined_form;
	
	@FindBy(xpath = "//div[@id='navmenu']/ul/li[3]/ul/li[3]/a")
	WebElement company_full_search_form;
	
	
	@FindBy(xpath = "//a[@title='New Contact']")
	WebElement new_contact;
	
	@FindBy(xpath = "//div[@id='navmenu']/ul/li[4]/ul/li[2]/a")
	WebElement contact_combined_form;
	
	@FindBy(xpath = "//div[@id='navmenu']/ul/li[4]/ul/li[3]/a")
	WebElement contact_full_search_form;
	// Actions
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
	return	TestBase.getTitleOfPage();
	}
	
	public void moveToCompanyMenuTab(){
		driver.switchTo().frame("mainpanel");
		TestBase.mouseHoverOnElement(companies_menu);
	}
	
	public NewCompany clickNewCompanyMenuItem(){
		TestBase.clickOnElement(new_company);
		return new NewCompany();
		
	}
}