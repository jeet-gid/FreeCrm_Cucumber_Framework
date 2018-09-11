package com.freecrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.freecrm.utlis.TestBase;

public class LogInPage extends TestBase {
	
	
		@FindBy(name = "username")
	     WebElement user_name;

		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(xpath = "//input[@value='Login']")
		WebElement login_btn;
		
		// Elements or page objects initilise 
		public LogInPage(){
			PageFactory.initElements(driver,this);
		}
		
		//Actions
		
		
		public HomePage logIn(String uname , String pwd){
			TestBase.enterData(user_name, uname);
			TestBase.enterData(password, pwd);
			TestBase.clickOnElement(login_btn);
			return new HomePage();
		}
		
		public String verifyLogInPageTitle(){
		return	TestBase.getTitleOfPage();
		}
		
		
}
