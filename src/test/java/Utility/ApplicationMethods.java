package Utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationMethods {
	
	WebDriver Driver;
	
	public void fnLaunchApp() {
		String ChromeDriverPath = "C:\\Selenium2023\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
		Driver = new ChromeDriver();
		
		//String EdgeDriverPath = "C:\\Selenium2023\\BrowserDrivers\\edgedriver_win64\\msedgedriver.exe";
		//System.setProperty("webdriver.edge.driver", EdgeDriverPath);
		//WebDriver Driver = new EdgeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://magento.softwaretestingboard.com/");
		//Page load time - selenium method
		Driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//Implicit wait
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void fnLoginToApp() throws Exception {

		Driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		//Enter username and password and click on login
		Driver.findElement(By.cssSelector("#email")).sendKeys("TestlTestF@gmail.com");
		Driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("Testing123");
		Driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
	}
	
	public void fnNavigateToOrdersPage() {

		//Navigfate to my orders page
		Driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
		Driver.findElement(By.xpath("(//a[text()='My Account'])[1]")).click();
		Driver.findElement(By.xpath("(//a[text()='My Orders'])[1]")).click();
	}
	
	public void fnValidateOrder() {
		
		//Cpature the first order price
		String price = Driver.findElement(By.xpath("//table[@id='my-orders-table']/tbody/tr[1]/td[4]/span")).getText();
		System.out.println(price);
		//Validate order - 000039653. is in the table or not
				List<WebElement> orders = Driver.findElements(By.xpath("//table[@id='my-orders-table']/tbody/tr/td[1]"));
				
				
				//No of order in the table
				System.out.println("No of order in the table - "+orders.size());
				
				for(int i=0;i<orders.size();i++) {
					//System.out.println("Order No's - "+orders.get(i).getText());
					if(orders.get(i).getText().equals("000039653")) {
						System.out.println("Order number is present in table - validation - pass");
					}
				}
	}
	
	
	public void fnCloseApp() {
		Driver.close();
	}
	
	
	public void fnValidateTitle() {
		String OptTitle = Driver.getTitle();
		System.out.println(OptTitle);
		
		if(OptTitle.equals("Home Page")) {
			System.out.println("Test case is - PASS");
		}else {
			System.out.println("Test case is - FAIL");
		}
	}
	
	
	public void fnValidateSearchField() {

		//CHeck the search field is displaying or not
		boolean FieldDisp = Driver.findElement(By.id("search")).isDisplayed();
		//System.out.println("Search feild displaying -"+FieldDisp);
		
		if(FieldDisp) {
			System.out.println("Validating  field displaying -Pass");
		}else {
			System.out.println("Validating  field displaying -Fail");
		}
	}
	
	
	public void fnCreateanAccount() {

		//5.Click on Create an Account
		Driver.findElement(By.linkText("Create an Account")).click();
		
		//6.filling the form
		Driver.findElement(By.id("firstname")).sendKeys("Chinna");
		Driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Robo");
		Driver.findElement(By.xpath(" /html/body/div[2]/main/div[3]/div/form/fieldset[2]/div[1]/div/input")).sendKeys("robo.chinna@gmail.com");
		Driver.findElement(By.id("password")).sendKeys("Chinna@1234567");
		Driver.findElement(By.id("password-confirmation")).sendKeys("Chinna@1234567");
		Driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	}
	
	
	

}
