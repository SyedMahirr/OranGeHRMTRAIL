package com.m.StepDeff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjectFactory.InsuranceMouseMove;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SolutionsInsuranceBenefit {
 WebDriver driver;
	@Given("^HRM Website$")
	public void hrm_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		// invoked the browser
		driver.get("https://www.orangehrm.com");
	}

	@When("^user moves the moves the Mouse$")
	public void user_moves_the_moves_the_Mouse() throws Throwable {
		// object for class
		InsuranceMouseMove w = new InsuranceMouseMove(driver);
		// Action class 
		Actions x = new Actions (driver);
		x.moveToElement(w.MouseHover()).build().perform();
		
	}

	@When("^Clicks on the Insurance Benefit$")
	public void clicks_on_the_Insurance_Benefit() throws Throwable {
		// object for class
				InsuranceMouseMove w = new InsuranceMouseMove(driver);
				// Action class 
				Actions x = new Actions (driver);
				x.moveToElement(w.clickonInsurance()).click().build().perform();
	}

	@Then("^Fills out the Qoute Request Form$")
	public void fills_out_the_Qoute_Request_Form() throws Throwable {
		InsuranceMouseMove w = new InsuranceMouseMove(driver);
		w.ClickOnProfessional().click();
		w.ClickOnBrochures().click();
		
		
	}
}
