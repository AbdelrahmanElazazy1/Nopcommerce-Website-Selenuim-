package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase 
{

	HomePage homeObject ;
	UserRegistrationPage registerObject;
	LoginPage LoginObject;
	
	
	
	@Test
	public void AUserCanRegisterSuccessfully ()
	
	{
		
	    homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.UserRegistration("Abdelrahman", "El Azazy", "Abdelrahma59n.elazazy@outlook.com", "Azazy@123");
		Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
		
	}
	
	@Test
	public void BRegisteredUserCanLogout()
	
	{
		registerObject = new UserRegistrationPage(driver);
		registerObject.userLogout();
		
	}
	
	@Test
	public void CRegisteredUserCanLogin()
	
	{
		
	    homeObject = new HomePage(driver);
		homeObject.openLoginPage();
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin();
		
		
	}
	
	
	
	
}
