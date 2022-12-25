package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

public class ProductHoverMenuTest extends TestBase{


	HomePage homeObject;


	@Test

	public void UserCanSelectSubcategoryFromMainMenu()

	{
		homeObject = new HomePage(driver);
		homeObject.SelectNotbooksMenu();
		//Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}



}
