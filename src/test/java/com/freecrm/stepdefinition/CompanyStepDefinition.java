package com.freecrm.stepdefinition;

import com.freecrm.pages.HomePage;
import com.freecrm.pages.NewCompany;
import com.freecrm.utlis.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CompanyStepDefinition extends TestBase{

	static HomePage homePage;
	NewCompany newcompany;
	@Then("^User Create a New Company$")
	public void user_Create_a_New_Company() {
	    homePage= LogInStepDefintion.homepage;
		homePage.moveToCompanyMenuTab();
		newcompany=homePage.clickNewCompanyMenuItem();
	    newcompany.createCompany();
	    
	}

}
