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

	//Search Mac Labtob

	@FindBy (id = "small-searchterms")
	WebElement SearchTextBox ;

	@FindBy (xpath = "//*[@id=\"small-search-box-form\"]/button")
	WebElement SearchbButton;

	//@FindBy (id= "ui-id-1")
	//WebElement ProductList;

	@FindBy(linkText="Apple MacBook Pro 13-inch")
	WebElement MacProductLink;

	@FindBy(linkText="Asus N551JK-XO076H Laptop")
	WebElement AsusLabtopLink;

	//@FindBy (xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")
	//WebElement EmailAFriendButton;


	public void ProductSearchMac ()

	{
		SearchTextBox.sendKeys("mac");
		SearchbButton.click();
		MacProductLink.click();
	}

	
	public void ProductSearchAsusLabtop()

	{
		SearchTextBox.sendKeys("Asus");
		SearchbButton.click();
		AsusLabtopLink.click();
	}












}
