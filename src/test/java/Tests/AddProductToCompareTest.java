package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AddProductToComparePage;
import Pages.SearchPage;

public class AddProductToCompareTest extends TestBase {

	SearchPage searchObject ;
	AddProductToComparePage CompareObject;
	
	
	
	@Test(priority = 1)
	public void UserCanSearchProduct ()
	{
		searchObject = new SearchPage(driver);	
		searchObject.ProductSearchMac();
	    //Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);

	}
	
	
	@Test(priority = 2)
	public void UserCanCompareItems()
	{
		CompareObject = new AddProductToComparePage(driver);
		CompareObject.MacLabtopComparePage();
		searchObject.ProductSearchAsusLabtop();
		CompareObject.AsusLabtopComparePage();
	}
	
	@Test(priority = 3)
	public void UserCanRemoveItemsFromCopmarePage()
	{
		CompareObject.ClearProductsFromList();
		Assert.assertTrue(CompareObject.NoItemFoundSucessMessage.getText().contains("You have no items to compare."));
	}
	
}
