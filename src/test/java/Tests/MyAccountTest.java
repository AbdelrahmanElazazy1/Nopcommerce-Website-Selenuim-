package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.UserRegistrationPage;

public class MyAccountTest extends TestBase{


	HomePage homeObject ;
	UserRegistrationPage registerObject;
	LoginPage LoginObject;
	MyAccountPage MyAccountObject;
	String OldPassword = "Azazy@123" ;
	String NewPassword = "12345678" ;
	String Firstname = "Abdelrahman";
	String LastName = "El Azazy";
	String Email = "Abdelrahm8er445n.elazazy@outlook.com";



	@Test
	public void UserCanRegisterSuccessfully ()

	{
		
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.UserRegistration(Firstname, LastName, Email, OldPassword);
		//Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
		MyAccountObject = new MyAccountPage(driver);
		MyAccountObject.OpenMyAccountPage();
		MyAccountObject.ChangePassword(OldPassword, NewPassword);
		//Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Password was changed"));
		//registerObject.userLogout();
	    
	}







}
