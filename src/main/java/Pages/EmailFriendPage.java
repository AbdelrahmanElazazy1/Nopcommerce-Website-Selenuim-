package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dev.failsafe.internal.util.Assert;

public class EmailFriendPage extends PageBase{

	public EmailFriendPage(WebDriver driver) {
		super(driver);
	}


	@FindBy (xpath ="//*[@class=\"button-2 email-a-friend-button\"]")
	WebElement EmailFriendButton;

	@FindBy (id = "FriendEmail")
	WebElement FriendsEmailTxt;

	@FindBy (id= "YourEmailAddress")
	WebElement YourEmailAddressText;

	@FindBy (id= "PersonalMessage")
	public WebElement MessageNotificationTxt;

	@FindBy (name ="send-email")
	WebElement SendEmailButton;


	@FindBy (css= "div.result")
	WebElement SucessMessage;



	public void SendEmailToFriend()

	{
		EmailFriendButton.click();
		FriendsEmailTxt.sendKeys("Azazy@1.com");
		YourEmailAddressText.sendKeys("Aawqeeeonn.elazazy@outlook.com");
		MessageNotificationTxt.sendKeys("This Product is Awesome");
		SendEmailButton.click();

	}

	

}
