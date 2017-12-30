package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceMouseMove {
	
	static WebDriver driver;

	public InsuranceMouseMove(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* 
	 * 
	 * BELOW, THERE IS THE LOCATOR AND PATH FOR MOVING THE MOUSE SOLUTION 
	 * 
	 * AND ITS METHODS
	 */
	
	
	@FindBy(xpath = ".//*[text()=\"Solutions\"]" )
	static WebElement Solution;
	
	public WebElement MouseHover()
	{
		return Solution;
	}
	
	/* 
	 * 
	 * BELOW, THERE IS THE LOCATOR AND PATH FOR CLICKING THE INSURANCE BENEFIT
	 * 
	 * AND ITS METHODS
	 */
	
	@FindBy (xpath =".//*[@class=\"gmoduls insu \"]")
	WebElement insuranceBenefit;
	
	public WebElement clickonInsurance()
	{
		return insuranceBenefit;
	}
	
	/* 
	 * 
	 * BELOW, THERE IS THE LOCATOR AND PATH FOR CLICKING ON BROCESURE 
	 * 
	 * AND ITS METHODS
	 */
	
	
	// clicking on Professional 
	@FindBy(xpath=".//*[text()=\"Professional \"]")
	WebElement professional;
	
	public WebElement ClickOnProfessional() {
		return professional;
	}
	
	// clicking on Brochure 
	
	@FindBy (xpath ="//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[5]/a/span")
	WebElement Brochures;
	
	public WebElement ClickOnBrochures() {
		return Brochures;
	}
	
	
	
	
	
	
	}





