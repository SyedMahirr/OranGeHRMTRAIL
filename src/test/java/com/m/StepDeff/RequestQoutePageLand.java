package com.m.StepDeff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import PageObjectFactory.requestingAQouteLand;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RequestQoutePageLand {
	
	 static WebDriver driver;
	 
	@Given("^User on OrangeHRMQuote$")
	public void user_on_OrangeHRMQuote() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		// invoked the browser
		driver.get("https://www.orangehrm.com");
	}

	@When("^User clicks on Request a Quote button link$")
	public void user_clicks_on_Request_a_Quote_button_link() throws Throwable {
		requestingAQouteLand click = new requestingAQouteLand(driver);
		click.CLickingOntheRequestButton().click();
	}

	@Then("^User lands on OrangeHRM Request Quote page$")
	public void user_lands_on_OrangeHRM_Request_Quote_page() throws Throwable {
	    
	}
}
