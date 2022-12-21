package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EmailFriendPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchPage;
import Pages.UserRegistrationPage;

public class EmailFriendTest extends TestBase{


	HomePage homeObject ;
	UserRegistrationPage registerObject;
	LoginPage LoginObject;
	SearchPage searchObject ;
	EmailFriendPage Emailobject;



	//1- User Registration


	@Test(priority = 1)
	public void UserCanRegisterSuccessfully ()

	{
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.UserRegistration("Abdelrahman", "El Azazy", "Aawqeeeonn.elazazy@outlook.com", "Azazy@123");
		Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin();
	}



	//2- Search For Product

	@Test(priority =3)
	public void UserCanSearchProduct ()
	{
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearch();
		//Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
	}



	//3- Email To Friend 
	@Test(priority = 4)
	public void RegisterUserCanSendProductToFriend()

	{
		Emailobject = new EmailFriendPage(driver);
		Emailobject.SendEmailToFriend();
		//Assert.assertTrue(Emailobject.MessageNotificationTxt.getText().contains("Your message has been sent."));
	}




	//5- User Logout

	@Test(priority = 5)
	public void RegisteredUserCanLogout()

	{
		registerObject = new UserRegistrationPage(driver);
		registerObject.userLogout();
	}
	
	
	
}
