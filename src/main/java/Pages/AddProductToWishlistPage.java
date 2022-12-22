package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToWishlistPage extends PageBase{

	public AddProductToWishlistPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy (id = "add-to-wishlist-button-4")
	WebElement AddWishlistButton;
	
	@FindBy (linkText = "wishlist")
	WebElement WishListLink;
	
	@FindBy (name = "updatecart")
	WebElement RemoveProductButton;
	
	@FindBy (css= "div.no-data")
	public WebElement SuccessRemoveMessage;
	
	
	public void AddandRemoveProductToWishlist()
	
	{
		AddWishlistButton.click();
		WishListLink.click();
		RemoveProductButton.click();
		
	}
	
	
	
	
	
}
