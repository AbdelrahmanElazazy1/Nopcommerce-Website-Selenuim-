package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) 

	{
		super(driver);
	}

	@FindBy(id="Email")
	WebElement Emailtxtbox ;

	
	@FindBy(id = "Password")
	WebElement Passwordtxtbox ;
	
	@FindBy (tagName = "button")
	WebElement LoginButton ;

	
	
	// (My Account)
	
	@FindBy (linkText = "My account" )
	WebElement MyaccountLink ; 
	
	
	public void UserLogin (String Email, String Password)
	
	{
		Emailtxtbox.sendKeys("Abdelrahman.elazazy@outlook.com");
		Passwordtxtbox.sendKeys("Azazy@123");
		LoginButton.click();
	}
	
	
	public void OpenMyAccount()
	
	{
		MyaccountLink.click();
	}
	


}
