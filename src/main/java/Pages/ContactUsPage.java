package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy (id = "FullName")
	WebElement NameTxt;
	
	@FindBy (id = "Email")
	WebElement EmailTxt;
	
	@FindBy (id= "Enquiry")
	WebElement EnquiryTxt;
	
	@FindBy (name = "send-email")
	WebElement SubmitButton;
	
	@FindBy (css= "div.result")
	
	public WebElement SuccessMessage; 
	
	
	public void contactus ()
	
	{
		
		NameTxt.sendKeys("Abdelrahman");
		EmailTxt.sendKeys("Azazy@1.com");
		EnquiryTxt.sendKeys("I'm Here");
		SubmitButton.click();
		
	}
	
	
	
	
}
