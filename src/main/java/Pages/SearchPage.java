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

	@FindBy (linkText ="Search")
	WebElement SearchbButton;

	//@FindBy (id= "ui-id-1")
	//WebElement ProductList;

	@FindBy(linkText="Apple MacBook Pro 13-inch")
	WebElement MacProductLink;




	public void ProductSearch (String productName)

	{

		SearchTextBox.sendKeys(productName);
		SearchbButton.click();
		MacProductLink.click();
	}














}
