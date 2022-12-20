package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dev.failsafe.internal.util.Assert;

public class EmailFriendPage extends PageBase{

	public EmailFriendPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy (id="FriendEmail")
	WebElement FriendsEmailTxt;
	
	@FindBy (id= "YourEmailAddress")
	WebElement EmailAddressTxt;
	
	@FindBy (id= "YourEmailAddress")
	public WebElement MessageNotificationTxt;
	
	@FindBy (name ="send-email")
	WebElement SendEmailButton;
	
	
	@FindBy (css= "div.result")
	WebElement SucessMessage;
	
	
	public void SendEmailToFriend()
	
	{
		FriendsEmailTxt.sendKeys("Azazy@1.com");
		EmailAddressTxt.sendKeys("Abdelrahman.elazazy@outlook.com");
		MessageNotificationTxt.sendKeys("This Product is Awesome");
		SendEmailButton.click();
		
	}
	
	
	
}
