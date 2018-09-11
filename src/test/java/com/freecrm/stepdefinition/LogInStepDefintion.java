package com.freecrm.stepdefinition;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.LogInPage;
import com.freecrm.utlis.TestBase;
import com.freecrm.utlis.TestUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public  class LogInStepDefintion extends TestBase{
	
	static	LogInPage loginpage;
	static	HomePage homepage;
	
	@Given("^user is on FreeCrm login page$")
	public void user_is_on_FreeCrm_login_page() {
		TestBase.browserInitilise();
		loginpage=new LogInPage();
		System.out.println("loginpage=---------"+loginpage);
	    String page_title=loginpage.verifyLogInPageTitle();
	    Assert.assertEquals(TestUtils.LOG_IN_PAGE_TITLE, page_title);
		
	}

	@When("^user loggedin to FreeCrm$")
	public  HomePage user_loggedin_to_FreeCrm()  {
	   homepage=loginpage.logIn(prop.getProperty("username"), prop.getProperty("password"));  
	   return homepage;
	}

	@Then("^user should be on homepage$")
	public void user_should_be_on_homepage(){
	   String title_home_page =  homepage.getHomePageTitle();
	   Assert.assertEquals(TestUtils.HOME_PAGE_TITLE, title_home_page);
		
	}
	
	@Then("^user closes the browser$")
	public void user_closes_the_browser(){
		driver.close();
		System.out.println("Hello_Pull");
	}
	
}
