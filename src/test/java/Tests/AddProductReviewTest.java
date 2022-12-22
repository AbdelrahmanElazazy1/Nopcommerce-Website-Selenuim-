package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AddProductReviewPage;
import Pages.EmailFriendPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.UserRegistrationPage;

public class AddProductReviewTest extends TestBase{


	HomePage homeObject ;
	UserRegistrationPage registerObject;
	LoginPage LoginObject;
	SearchPage searchObject ;
	EmailFriendPage Emailobject;
	AddProductReviewPage ReviewObject;
	ProductDetailsPage detailsObject;



//	//1- User Registration

//	@Test(priority = 1)
//	public void UserCanRegisterSuccessfully ()
//
//	{
//		homeObject = new HomePage(driver);
//		homeObject.openRegistrationPage();
//		registerObject = new UserRegistrationPage(driver);
//		registerObject.UserRegistration("Abdelrahman", "El Azazy", "Abqwdowsses.elazazy@outlook.com", "Azazy@123");
//		Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
//		LoginObject = new LoginPage(driver);
//		LoginObject.UserLogin();
//	}



	//2- Search For Product

	@Test(priority =3)
	public void UserCanSearchProduct ()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearchMac();
		//Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
		
	}
	
	

	//3- Add Review Product 
	
    @Test
	public void CRegisterUserCanReviewProduct()

	{

		ReviewObject = new AddProductReviewPage(driver);
		ReviewObject.AddProductReview();
		Assert.assertTrue(ReviewObject.SuccessMessage.getText().contains("Product review is successfully"));
		

	}


	//4- User Logout

//	@Test
//	public void DRegisteredUserCanLogout()
//
//	{
//		registerObject = new UserRegistrationPage(driver);
//		registerObject.userLogout();
//	} 


}
