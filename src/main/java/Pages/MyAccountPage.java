package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase

{

	public MyAccountPage(WebDriver driver) 

	{
		super(driver);
	}


	//Registration

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

	
	//MyAccount
	@FindBy (linkText="My account")
	WebElement MyAccountButton;
	
	//ChangePassowrdLink	
	@FindBy(linkText ="Change password")
	WebElement ChangePasswordLink;


	@FindBy(name = "OldPassword")
	WebElement OldPasswordField;

	@FindBy (id= "NewPassword")
	WebElement NewPasswordField;

	@FindBy (name="ConfirmNewPassword")
	WebElement ConfirmPasswordField;

	@FindBy (linkText = "Change password")
	public WebElement ChangePasswordButton;




	public void OpenMyAccountPage()

	{
		MyAccountButton.click();
		ChangePasswordButton.click();
		

	}


	public void ChangePassword (String oldPassword, String NewPassword) {


		OldPasswordField.sendKeys(oldPassword);
		NewPasswordField.sendKeys(NewPassword);
		ChangePasswordButton.click();



	}


}
