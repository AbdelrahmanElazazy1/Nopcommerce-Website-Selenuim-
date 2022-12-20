package Pages;	

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
		
	@FindBy (linkText = "Register")
	WebElement registerLink ;
	
	
	@FindBy (linkText = "Log in")
	WebElement LoginLink ;
		
	
	@FindBy (linkText = "Contact us")	
	WebElement ContactUsBotton;
	
	@FindBy (id = "customerCurrency")
	WebElement CurrencyDropdown;
	
	
	
	public void openRegistrationPage ()
	{
		registerLink.click();
	}
	
	public void openLoginPage ()
	{
		LoginLink.click();
	}
	
	
	public void OpenContactUsPage()
	
	{
		ScrollToBottom();
		ContactUsBotton.click();
	}
	
	
	public void ChangeCurunncy()
	
	{
		select = new Select(CurrencyDropdown);
		select.selectByVisibleText("Euro");
		
	}
	
	
}
