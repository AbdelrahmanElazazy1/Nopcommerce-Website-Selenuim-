package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import Pages.SearchPage;

public class SearchPageTest extends TestBase {



	String productName = "Apple MacBook Pro 13-inch" ;
	SearchPage searchObject ;
	

	@Test
	public void UserCanSearchProduct ()
	{
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearch(productName);
	    //Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);

	}






}
