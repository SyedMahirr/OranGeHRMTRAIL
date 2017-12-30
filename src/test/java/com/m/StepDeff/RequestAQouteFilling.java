package com.m.StepDeff;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectFactory.FillingOutForm;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RequestAQouteFilling {

	static WebDriver driver;
	
	
	@Given("^user on OrangeHRMQuote$")
	public void user_on_OrangeHRMQuote() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		// invoked the browser
		driver.get("https://www.orangehrm.com");
		FillingOutForm ab = new FillingOutForm(driver);
		ab.ClickOnRequestQOute().click();
	}

	@When("^Select package,$")
	public void select_package() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		Select dropDown = new Select(ab.dropDropSelectPackage());
		dropDown.selectByValue("Professional");
		
		
		
	}

	@When("^Enter First Name,$")
	public void enter_First_Name() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.enteringFirstName().sendKeys("Mahir");
	}

	@When("^Last Name$")
	public void last_Name() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.enteringlastName().sendKeys("ALAM");
	}

	@When("^Company Name,$")
	public void company_Name() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.enteringCompanyName().sendKeys("TT");
	}

	@When("^Select Insdusty$")
	public void select_Insdusty() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.SelectingIndustry();
	}

	@When("^Enter Job Title,$")
	public void enter_Job_Title() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.enteringJobTitlle();
	}

	@When("^Enter Business Email$")
	public void enter_Business_Email() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.enteringBusinessEmail().sendKeys("ABC@BHY.com");

	}

	@When("^Enter Contact Phone,$")
	public void enter_Contact_Phone() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.enteringContactInfo().sendKeys("1");;
		
	}

	@When("^Select Country$")
	public void select_Country() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.SelectingCountry();
	}

	@When("^Select NoOfEmployees,$")
	public void select_NoOfEmployees() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.NoOfEmployee();
	}

	@When("^Enter coupon Code$")
	public void enter_coupon_Code() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.EnterCoupon().sendKeys("15989");
	}

	@When("^Select CoreHRModules,$")
	public void select_CoreHRModules() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		
	}

	@When("^Select Optioanl Modules$")
	public void select_Optioanl_Modules() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.clickLeaving().click();
		ab.clickTime().click();
	}

	@When("^Select Optional Plugins,$")
	public void select_Optional_Plugins() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
	}

	@When("^Select reCpatcha$")
	public void select_reCpatcha() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		
		 int FrameCOunt = ab.switchToFrame().size();
		for(int i=0; i<FrameCOunt; i++) {
			driver.switchTo().frame(i);
			
			int ClickonCaptcha = ab.CaptchaClick().size();
			if (ClickonCaptcha>0) {
				driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]")).click();
				driver.findElement(By.id("recaptcha-verify-button")).click();
				break;
			}
			else {
				System.out.println("countinue looping");
			}
			
			
		}
		
	}

	@When("^Click on Submit$")
	public void click_on_Submit() throws Throwable {
		FillingOutForm ab = new FillingOutForm(driver);
		ab.clickVerify().click();
	}

	@Then("^User Lands on OrangeHRM Request Quote page for Viewing the Qoute$")
	public void user_Lands_on_OrangeHRM_Request_Quote_page_for_Viewing_the_Qoute() throws Throwable {

	}

}
