package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AddProductToWishlistPage;
import Pages.SearchPage;

public class AddProductToWishlistTest extends TestBase{

	SearchPage searchObject ;
	AddProductToWishlistPage WishlistObject;




	@Test (priority = 1)
	public void UserCanSearchProduct ()
	{
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearchMac();
		//Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
	}

	@Test(priority = 2)
	public void UserCanAddAndRemoveProductToWishlist()

	{

		WishlistObject = new AddProductToWishlistPage(driver);
		WishlistObject.AddandRemoveProductToWishlist();
		Assert.assertTrue(WishlistObject.SuccessRemoveMessage.getText().contains("The wishlist is empty!"));
	}



}
