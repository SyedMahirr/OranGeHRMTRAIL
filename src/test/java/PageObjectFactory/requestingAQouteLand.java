package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class requestingAQouteLand {
	
	WebDriver driver;

	public requestingAQouteLand(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using=".//*[text()=\" Request a Quote \"]")
	WebElement RequestAQouteButton;
	
	


	public WebElement CLickingOntheRequestButton() {
		
		return RequestAQouteButton;
		
		
	}
	
}
