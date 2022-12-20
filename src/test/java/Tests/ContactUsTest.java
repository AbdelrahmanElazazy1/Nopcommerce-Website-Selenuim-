package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ContactUsPage;
import Pages.HomePage;

public class ContactUsTest extends TestBase{
	
	
	HomePage Home;
	ContactUsPage ContactPage;
	
	
	@Test
	public void UserCanContactUs()
	
	{
		Home = new HomePage(driver);
		Home.OpenContactUsPage();
		ContactPage = new ContactUsPage(driver);
		ContactPage.contactus();
		Assert.assertTrue(ContactPage.SuccessMessage.getText().contains("Your enquiry has been successfully sent to the store owner."));
	}
	

}
