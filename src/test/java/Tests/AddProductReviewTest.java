package Tests;

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






	//1- User Registration


	@Test
	public void AUserCanRegisterSuccessfully ()

	{
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.UserRegistration("Abdelrahman", "El Azazy", "Abdelrahma1235n.elazazy@outlook.com", "Azazy@123");
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



	//3- Add Review Product  

	public void CRegisterUserCanReviewProduct()

	{
		detailsObject.OpenAddreviewPage();
		ReviewObject = new AddProductReviewPage(driver);
		ReviewObject.AddProductReview();
		Assert.assertTrue(ReviewObject.SuccessMessage.getText().contains("Product review is successfully"));

	}


	//4- User Logout

	@Test
	public void DRegisteredUserCanLogout()

	{
		registerObject = new UserRegistrationPage(driver);
		registerObject.userLogout();
	} 


}
