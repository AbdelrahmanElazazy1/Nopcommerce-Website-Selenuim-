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

	@FindBy (xpath= "//*[@class=\"button-1 login-button\"]")
	WebElement LoginButton ;

	@FindBy (xpath = "//*[@class =\"ico-login\"]")
	WebElement LoginLink;


	// (My Account)

	@FindBy (linkText = "My account" )
	WebElement MyaccountLink ; 


	public void UserLogin ()

	{
        LoginLink.click();
		Emailtxtbox.sendKeys("Abq5111wdowsses.elazazy@outlook.com");
		Passwordtxtbox.sendKeys("Azazy@123");
		LoginButton.click();
	}


	public void OpenMyAccount()

	{
		MyaccountLink.click();
	}



}
