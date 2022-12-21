package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductReviewPage extends PageBase{

	public AddProductReviewPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy (xpath="//*[contains(text(),\"Add your review\")]")
	WebElement AddYourReviewLink;
	
	@FindBy (id = "AddProductReview_Title")
	WebElement ReviewtittleTxt;
	
	@FindBy (id ="AddProductReview_ReviewText")
	WebElement ReviewTxt;
	
	@FindBy (id= "addproductrating_4")
	WebElement RattingButton;
	
	@FindBy (name = "add-review")
	WebElement SubmitButton;
	
	@FindBy (css = "div.result")
	public WebElement SuccessMessage;
	
	

	
	public void AddProductReview ()
	
	{
		AddYourReviewLink.click();
		ReviewtittleTxt.sendKeys("Azazy");
		ReviewTxt.sendKeys("This is Mac is Nice");
		RattingButton.click();
		SubmitButton.click();
		
	}
	
	
	
}
