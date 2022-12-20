package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) 

	{
		super(driver);
	}


	@FindBy (id = "small-searchterms")
	WebElement SearchTextBox ;

	@FindBy (xpath = "//*[@id=\"small-search-box-form\"]/button")
	WebElement SearchbButton;

	//@FindBy (id= "ui-id-1")
	//WebElement ProductList;

	@FindBy(linkText="Apple MacBook Pro 13-inch")
	WebElement MacProductLink;
	
	//@FindBy (xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")
	//WebElement EmailAFriendButton;
	
	



	public void ProductSearch ()

	{
		SearchTextBox.sendKeys("mac");
		SearchbButton.click();
		MacProductLink.click();
		//EmailAFriendButton.click();
	}














}
