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
	
	
	@Test
	public void AUserCanRegisterSuccessfully ()

	{
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.UserRegistration("Abdelrahman", "El Azazy", "Abdelrahma235n.elazazy@outlook.com", "Azazy@123");
		Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
	}

	

	//2- Search For Product
	
	@Test
	public void BUserCanSearchProduct ()
	{
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearch();
	    //Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
	}
	
	
	
	//3- Email To Friend 
	
	public void CRegisterUserCanSendProductToFriend()
	
	{
		Emailobject = new EmailFriendPage(driver);
		Emailobject.SendEmailToFriend();
		Assert.assertTrue(Emailobject.MessageNotificationTxt.getText().contains("Your message has been sent."));
	}
	
	
	
	
	//4- User Logout
	
	@Test
	public void DRegisteredUserCanLogout()

	{
		registerObject = new UserRegistrationPage(driver);
		registerObject.userLogout();
	}
}
