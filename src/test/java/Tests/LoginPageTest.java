package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{

	HomePage homeobject ;
	LoginPage LoginObject;
	
	
	@Test
	public void UserCanLoginSuccessfully()
	
	{
		homeobject = new HomePage(driver);
		homeobject.openLoginPage();
		
		LoginObject = new LoginPage(driver);
	    LoginObject.UserLogin("Abdelrahman.elazazy@outlook.com", "Azazy@123");
		
	}
	
}
