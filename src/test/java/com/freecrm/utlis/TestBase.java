package com.freecrm.utlis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	
public static	WebDriver driver;
public static	Properties prop;
	

	public TestBase(){
		prop = new Properties();
		try {
			FileInputStream fis =new FileInputStream(new File("D://My_Practise//com.freecrm.cucumber.automation//src//test//java//com//freecrm//config//freecrm.properties") );
			prop.load(fis);
		} catch (Exception e) {
			throw new RuntimeException("Error occured in loading properties file");
		}
		
	}
	
	public static void browserInitilise(){
	      	String browser_name=prop.getProperty("browser");
	      	String url=prop.getProperty("url");
	      	if(browser_name.equalsIgnoreCase("firefox")){
	      		System.setProperty("webdriver.gecko.driver","D://My_Practise//com.freecrm.cucumber.automation//drivers//geckodriver.exe");
	    		DesiredCapabilities capabilities = new DesiredCapabilities();
	      				 capabilities = DesiredCapabilities.firefox();
	      				 capabilities.setPlatform(Platform.WINDOWS);
	      				 capabilities.setCapability("marionette", false);
	      				 driver = new FirefoxDriver(capabilities);
	      	}
	      	else if(browser_name.equalsIgnoreCase("chrome")){
	      		System.setProperty("webdriver.chrome.driver","D://My_Practise//com.freecrm.cucumber.automation//drivers//chromedriver.exe");
	      		driver=new ChromeDriver();
	      	}
	      	else if(browser_name.equalsIgnoreCase("ie")){
	      		System.setProperty("webdriver.ie.driver","D://My_Practise//com.freecrm.cucumber.automation//drivers//IEDriverServer.exe");
	      		driver=new InternetExplorerDriver();
	      	}
	      	
	      	driver.manage().window().maximize();
	      	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
	      	driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_TIME_OUT, TimeUnit.SECONDS);
	      	
	      	driver.get(url);
	      	
	}

	public static void clickOnElement(WebElement element){
		element.click();
	}
	
	public static void mouseHoverOnElement(WebElement element){
	    
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}
	
	public static void enterData(WebElement element , String data){
		element.sendKeys(data);
	}
	
	public static void clickByJavaScriptExecutor(WebDriver driver,WebElement element){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("argument[0].click();", element);
	}
	
	public static String getTitleOfPage(){
	
		return driver.getTitle();
}
	
   public static void selectItemInDropDown(WebElement element  , String option){
	   Select select =new Select(element);
	   select.selectByVisibleText(option);
   }
	
   public static String getExtentConfigPath(){
	   return prop.getProperty("extent-config-path");
   }
}
