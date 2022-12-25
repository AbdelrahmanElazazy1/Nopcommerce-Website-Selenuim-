package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserCheckoutProductPage extends PageBase{

	public UserCheckoutProductPage(WebDriver driver) {
		super(driver);
	}

	//Checkout page 1
	@FindBy (id = "termsofservice")
	WebElement Checkbox;
	
	@FindBy(id= "checkout")
	WebElement CheckoutButton;
	
	
	// Checkout Page deatils 2
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement CountryButton;
	
	@FindBy(id="BillingNewAddress_City")
	WebElement CityField;
	
	@FindBy(id="BillingNewAddress_Address1")
	WebElement Address1Field;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement ZipPostalCode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement PhoneNumber;
	
	@FindBy(name = "save")
	WebElement ContinueButton;
	
	@FindBy(xpath = "//*[@class=\"button-1 shipping-method-next-step-button\"]")
	WebElement ShiipingMethodContinueButton;
	
	@FindBy(xpath = "//*[@onclick=\"PaymentMethod.save()\"]")
	WebElement PaymentMethodContinueButton;
	
	@FindBy(xpath = "//*[@class=\"button-1 payment-info-next-step-button\"]")
	WebElement PaymentInformationContinueButton;
	
	@FindBy(xpath = "//*[@class=\"button-1 confirm-order-next-step-button\"]")
	WebElement ConfirmButton;
	
	@FindBy(css = "div.title")
	public WebElement OrderSuccessMessage;
	
	//3- Click Here for odrer detais
	
	@FindBy(linkText = "Click here for order details.")
	WebElement ClickHereLink;
	
	@FindBy(xpath = "//*[@class=\"button-2 pdf-invoice-button\"]")
	WebElement PDFInvoiceButton;
	
	
	public void CartPage()
	{
		Checkbox.click();
		CheckoutButton.click();
	}
	
	
	public void CheckoutBillingDetails()
	{
		CountryButton.click();
		CountryButton.sendKeys("Egypt");
		CityField.sendKeys("Cairo");
		Address1Field.sendKeys("New Cairo");
		ZipPostalCode.sendKeys("11689");
		PhoneNumber.sendKeys("012345678910");
		ContinueButton.click();
		ShiipingMethodContinueButton.click();
		PaymentMethodContinueButton.click();
		PaymentInformationContinueButton.click();
		ConfirmButton.click();
		ClickHereLink.click();
		PDFInvoiceButton.click();
	}
	
}
