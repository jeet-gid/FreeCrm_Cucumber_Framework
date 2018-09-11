package com.freecrm.runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.freecrm.utlis.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="D://My_Practise//com.freecrm.cucumber.automation//src//test//java//com//freecrm//features",
				glue={"com.freecrm.stepdefinition"},
				dryRun = false,
				monochrome= true,
				strict = true ,
				plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentreport.html"}
				)
public class TestRunner{

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(TestBase.getExtentConfigPath());
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.14.0");
		    Reporter.setSystemInfo("Maven", "4.0.0");
		    Reporter.setSystemInfo("Java Version", "1.8.0_181");
	}
	
	
	
}
