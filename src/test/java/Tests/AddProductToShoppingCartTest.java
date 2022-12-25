package Tests;

import org.testng.annotations.Test;

import Pages.AddProductToShoppingCartPage;
import Pages.SearchPage;

public class AddProductToShoppingCartTest extends TestBase{

	SearchPage searchObject;
	AddProductToShoppingCartPage ShoppingCartObject;
	
	
	
	@Test(priority = 1)
	public void UserCanSearchProduct ()
	{
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearchMac();
	    //Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
	}
	
	@Test(priority = 2)
	public void UserCanAdditemToShoppingCart()
	
	{
		ShoppingCartObject = new AddProductToShoppingCartPage(driver);
		ShoppingCartObject.PressOnAddToCartButton();
		//Assert.assertTrue(ShoppingCartObject.EmptyCartSuccessMessage.getText().contains("Your Shopping Cart is empty!"));
	}
	
	
	
	
	
}
