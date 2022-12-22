package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToShoppingCartPage extends PageBase{

	public AddProductToShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id ="add-to-cart-button-4")
	WebElement AddToCartButton;
	
	@FindBy(linkText = "shopping cart")
	WebElement ShoppingCartLink;
	
	@FindBy (xpath ="//*[@class=\"qty-input\"]")
	WebElement ChangeQuantity;
	
	@FindBy(id="updatecart")
	WebElement UpdateCartButton;
	
	@FindBy(xpath = "//*[@class=\"remove-btn\"]")
	WebElement RemoveItem;
	
	//@FindBy(css = "div.no-data")
	//public WebElement EmptyCartSuccessMessage;
	
	
	public void PressOnAddToCartButton()
	
	{
		AddToCartButton.click();
		ShoppingCartLink.click();
		ChangeQuantity.clear();
		ChangeQuantity.sendKeys("4");
		UpdateCartButton.click();
		//RemoveItem.click();
	}
	
	
	
	
	
}
