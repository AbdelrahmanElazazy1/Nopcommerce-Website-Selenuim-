package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class ChangeCurrencyTest extends TestBase {

	
	HomePage homeObject;
	ProductDetailsPage detailsObject;
	SearchPage searchObject ;
	
	
	
	@Test
	public void UserCanChangeCurrency()
	{
		homeObject = new HomePage(driver);
		homeObject.ChangeCurunncy();
		
	}
		

	@Test
	public void UserCanSearchProduct ()
	
	{
		
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearchMac();
		detailsObject = new ProductDetailsPage(driver);
		Assert.assertTrue(detailsObject.ProductPricelbl.getText().contains("€"));
		System.out.println(detailsObject.ProductPricelbl.getText());
	}
	
	
	
	
	
}
