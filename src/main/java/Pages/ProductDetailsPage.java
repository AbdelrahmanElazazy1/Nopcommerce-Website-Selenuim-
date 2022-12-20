package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy (xpath = "//*[@id=\"price-value-4\"]")
	public WebElement ProductPricelbl;
	
	
	@FindBy (linkText = "Add your review")
	public WebElement AddReviewLink;
	
	
	public void OpenAddreviewPage()
	
	{
		AddReviewLink.click();
		
	}
	
	
	
	
}
