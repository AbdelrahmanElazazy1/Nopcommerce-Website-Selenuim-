package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.Helper;

public class TestBase {


	public static WebDriver driver ;



	@BeforeSuite
	public void startdriver ()

	{
		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@AfterSuite
	public void stopdriver ()

	{
		//driver.quit();
	}

	// Take screenshot when test case failed , and add it in ( Screenshot ) folder
	
	@AfterMethod
	
	
	public void screenshotonFailure(ITestResult result)
	
	{
		
		if (result.getStatus() == ITestResult.FAILURE)
			
		{
			System.out.println("Failed");
			System.out.println("Taking Screenshot....");
		//	Helper.captureScreenshot(driver, result.getName());
		}
		
	}
	
	

}
