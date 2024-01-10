package MainTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.CustomerLoginPage;
import PageObjects.HomePage;

public class ModuleOneTests {
	WebDriver Driver;
	
	
	@BeforeMethod
	public void LaunchApp() {
		String ChromeDriverPath = "C:\\Selenium2023\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
		Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		Driver.get("https://magento.softwaretestingboard.com/");
	}
	
	
	
	
	@Test
	public void ValidateSignin() {
		HomePage ObjHomePage = new HomePage(Driver);
		CustomerLoginPage ObjCustomerLoginPage = new CustomerLoginPage(Driver);
		
		
		ObjHomePage.ClickSignIn();
		ObjCustomerLoginPage.EnterUserName("TestlTestF@gmail.com");
		ObjCustomerLoginPage.EnterPassword("Testing123");
		ObjCustomerLoginPage.ClickSignIn();

		
		
		
	}
	

}
