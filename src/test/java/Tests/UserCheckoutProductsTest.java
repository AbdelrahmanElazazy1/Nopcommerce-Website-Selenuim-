package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.AddProductToShoppingCartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.UserCheckoutProductPage;
import Pages.UserRegistrationPage;


public class UserCheckoutProductsTest extends TestBase {

	HomePage homeObject ;
	UserRegistrationPage registerObject;
	LoginPage LoginObject;
	SearchPage searchObject ;
	ProductDetailsPage detailsObject;
	UserCheckoutProductPage CheckoutObject;
	AddProductToShoppingCartPage ShoppingCartObject;
	
	
	
	
	
	//1- User Registration

	@Test(priority = 1)
	public void UserCanRegisterSuccessfully ()

	{
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.UserRegistration("Abdelrahman", "El Azazy", "Test@TestNG.com", "123456789");
		//Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin();
	}



	//2- Search For Product

	@Test(priority = 2)
	public void UserCanSearchProduct ()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearchMac();
		//Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
		
	}
	
	
	//3- Add To Cart
	
	@Test(priority = 3)
	public void UserCanAdditemToShoppingCart()
	
	{
		ShoppingCartObject = new AddProductToShoppingCartPage(driver);
		ShoppingCartObject.PressOnAddToCartButton();
		//Assert.assertTrue(ShoppingCartObject.EmptyCartSuccessMessage.getText().contains("Your Shopping Cart is empty!"));
	}
	
	@Test(priority = 4)
	
	public void userCanMakeCheckout()
	
	{		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		CheckoutObject = new UserCheckoutProductPage(driver);
		CheckoutObject.CartPage();
		CheckoutObject.CheckoutBillingDetails();
		//Assert.assertTrue(CheckoutObject.OrderSuccessMessage.getText().contains("Your order has been successfully processed!"));
	}
	
	
	
	
}
