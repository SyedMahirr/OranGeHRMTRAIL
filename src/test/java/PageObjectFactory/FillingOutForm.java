package PageObjectFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/*
 * In this class, it will be present COnstructor And all the locator and methods
 * for Fillingout form StepDeff
 */

public class FillingOutForm {

	WebDriver driver;

	public FillingOutForm(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	/*
	 * Below, all the @FindBy elements for Clicking on the "Request QOute Button"
	 * And Methods that will be invoke in StepDeff
	 */

	@FindBy(xpath = ".//*[text()=\" Request a Quote \"]")
	WebElement requestQoute;

	public WebElement ClickOnRequestQOute() {
		return requestQoute;
	}

	/*
	 * Below, all the @FindBy elements for DropDown "Select Your Package" And
	 * Methods that will be invoke in StepDeff
	 */

	@FindBy(name = "orangeVersion")
	WebElement selectYourPackage;

	public WebElement dropDropSelectPackage() {
		return selectYourPackage;

	}

	/*
	 * Below, all the @FindBy elements for DropDown "First Name" And Methods that
	 * will be invoke in StepDeff
	 */

	@FindBy(xpath = ".//*[@name=\"orangeName\"]")
	WebElement firstName;

	public WebElement enteringFirstName() {
		return firstName;

	}
	
	/*
	 * Below, all the @FindBy elements for DropDown "Last Name" And
	 * Methods that will be invoke in StepDeff
	 */

	@FindBy(xpath = ".//*[@placeholder=\"Last Name\"]")
	WebElement lastName;

	public WebElement enteringlastName() {
		return lastName;

	}
	
	/*
	 * Below this, All the required steps for Entering Company Name including its
	 * method
	 */

	@FindBy(xpath = ".//*[@name=\"companyName\"]")
	WebElement companyName;

	public WebElement enteringCompanyName() {
		return companyName;

	}

	/*
	 * Below this, All the required steps for Selecting Industry and JoB title
	 * including its methods and locating elements
	 */

	@FindBy(how = How.XPATH, using = ".//*[@name=\"orangeIndustry\"]")
	WebElement industrySelect;

	@FindBy(how = How.XPATH, using = ".//*[@name=\"orangeJobTitle\"]")
	WebElement tittleJob;

	public void SelectingIndustry() {
		// Select class will be used for dropping down
		Select select = new Select(industrySelect);
		select.getOptions().get(3).click();
	}

	public WebElement enteringJobTitlle() {
		return tittleJob;
	}

	/*
	 * Below this, All the required steps for entering Business Email and Contact
	 * Info including its methods and locating elements
	 */
	@FindBy(how = How.XPATH, using = ".//*[@placeholder=\"Business Email\"]")
	WebElement businessEmail;

	public WebElement enteringBusinessEmail() {
		return businessEmail;
	}

	@FindBy(how = How.XPATH, using = ".//*[@placeholder=\"Contact Phone\"]")
	WebElement ContactInfo;

	public WebElement enteringContactInfo() {
		
		return ContactInfo;
	}

	/*
	 * Below this, All the required steps for Selecting Country and And Number of
	 * Employees including its methods and locating elements
	 */

	@FindBy(how = How.XPATH, using = ".//*[@name=\"country\"]")
	WebElement countrySelect;

	public void SelectingCountry() {
		// Select class will be used for dropping down
		Select select = new Select(countrySelect);
		select.getOptions().get(5).click();
	}

	@FindBy(how = How.XPATH, using = ".//*[@name=\"orangeNoEmp\"]")
	WebElement numberOFEmployees;

	public void NoOfEmployee() {
		// Select class will be used for dropping down
		Select select = new Select(numberOFEmployees);
		select.getOptions().get(2).click();
	}

	/*
	 * Below all the steps for coupon code and its methods
	 * 
	 */

	@FindBy(xpath = ".//*[@name=\"orangeCoupon\"]")
	WebElement couponcode;

	public WebElement EnterCoupon() {

		return couponcode;
	}

	/*
	 * Below all the steps for selecting Optional Modules and its methods
	 * 
	 */

	@FindBy(xpath = ".//*[@name=\"orangeLeave\"]")
	WebElement clickLeave;

	public WebElement clickLeaving() {

		return clickLeave;
	}
	
	
	@FindBy(xpath = ".//*[@name=\"orangeTime\"]")
	WebElement clickTime;

	public WebElement clickTime() {

		return clickTime;
	}
	
	
	
	/*
	 * Below all the steps for clicking On CAPTCHA and its methods
	 * 
	 */
	@FindBys(@FindBy(tagName = "iframe"))
	List<WebElement> captcha;

	public List<WebElement> switchToFrame() {
		return captcha;

	}

	// Clicking on the check-box captcha
	@FindBy(className = "recaptcha-checkbox-checkmark")
	List<WebElement> checkBoxCaptcha;

	public List <WebElement> CaptchaClick() {
		return checkBoxCaptcha;

	
}
	@FindBy(how = How.ID, using ="recaptcha-verify-button")
	WebElement verify;
	
	public WebElement clickVerify() {

		return verify;
	}
	
	
	
	
	/*
	 * Clicking on SUbmit
	 * 
	 */
	@FindBy(xpath=".//*[@class=\"btn btn-success\"]")
	WebElement submit;
	
	public WebElement submiting() {
		return submit;
	}
	
	

}
