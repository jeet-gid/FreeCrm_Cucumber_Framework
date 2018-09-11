package com.freecrm.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.utils.FileUtil;
import com.cucumber.listener.Reporter;
import com.freecrm.utlis.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase{
	@Before
	public void beforeScenario(Scenario scenario) {
		if (scenario.getName().equals("Test FreeCrm LogIn with valid credentials")) {
			Reporter.assignAuthor("Jeet_abc");
	}
		else if(scenario.getName().equals("Create a New Company for a loggedin user")) {
			Reporter.assignAuthor("Jeet_pqr");
		}
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				   TakesScreenshot takescreenshot= (TakesScreenshot)driver;
				  File sourcePath= takescreenshot.getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				FileUtils.copyFile(sourcePath, destinationPath);   
 
				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (Exception e) {
				e.getMessage();
			} 
		}
	}
	
}