package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage {
	
	WebDriver Driver;
	
	public CustomerLoginPage(WebDriver Driver){
		this.Driver = Driver;
	}

	By UserName = By.cssSelector("#email");
	By Password =By.xpath("(//input[@id='pass'])[1]");
	By SignIn =By.xpath("(//button[@id='send2'])[1]");
	
	
	
	
	public void EnterUserName(String Usrname) {
		Driver.findElement(UserName).sendKeys(Usrname);
	}
	
	public void EnterPassword(String PWD) {
		Driver.findElement(Password).sendKeys(PWD);
	}
	
	public void ClickSignIn() {
		Driver.findElement(SignIn).click();
	}
	

	
	
	
}
