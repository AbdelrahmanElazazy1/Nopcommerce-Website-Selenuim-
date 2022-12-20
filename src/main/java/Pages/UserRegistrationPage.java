package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase
{
	public UserRegistrationPage(WebDriver driver) {
		super(driver);	
	}


	@FindBy (id= "gender-male")
	WebElement genderRadioButton ;

	@FindBy (id= "FirstName")
	WebElement FirstName ;

	@FindBy (id = "LastName")
	WebElement LastName ;

	@FindBy (id = "Email")
	WebElement Email ;

	@FindBy (id = "Password")
	WebElement Password ;

	@FindBy (id = "ConfirmPassword")
	WebElement ConfirmPassword ;

	@FindBy (id= "register-button")
	WebElement RegisterButton ;


	@FindBy (className= "result")
	public WebElement SuccessMessage ;

	
	@FindBy (xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public WebElement LogoutLink ;
	
	

	
	
	
	
	public void UserRegistration (String firstname, String lastname, String email, String password )

	{

		genderRadioButton.click();
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		Email.sendKeys(email);
		Password.sendKeys(password);
		ConfirmPassword.sendKeys(password);
		RegisterButton.click();
		

	}

	

	public void userLogout()
	
	{
		LogoutLink.click();
		
	}

	
	



}
