package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToComparePage extends PageBase{

	public AddProductToComparePage(WebDriver driver) {
		super(driver);
	}

	//Mac Labtob
	@FindBy (xpath = "//*[@class=\"button-2 add-to-compare-list-button\"]")
	WebElement MacLabtopCompareButton;


	//Asus Labtob
	@FindBy (xpath = "//*[@class=\"button-2 add-to-compare-list-button\"]")
	WebElement AsusLabtopButton;
	@FindBy (linkText = "product comparison")
	WebElement GoToComparePage;


	// Clear List After Compare
	@FindBy (xpath = "//*[@class=\"clear-list\"]")
	WebElement ClearListButton;

	@FindBy (css = "div.no-data")
	public WebElement NoItemFoundSucessMessage;
	

	public void MacLabtopComparePage()

	{
		MacLabtopCompareButton.click();
	}

	public void AsusLabtopComparePage()

	{
		AsusLabtopButton.click();
		GoToComparePage.click();
	}

	public void ClearProductsFromList()

	{
		ClearListButton.click();
	}
}
