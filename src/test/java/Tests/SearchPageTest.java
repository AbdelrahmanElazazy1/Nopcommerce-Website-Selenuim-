package Tests;

import org.testng.annotations.Test;

import Pages.SearchPage;

public class SearchPageTest extends TestBase {


	SearchPage searchObject ;
	
	

	@Test
	public void UserCanSearchProduct ()
	{
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearchMac();
	    //Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);

	}






}
