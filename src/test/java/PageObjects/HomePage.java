package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver Driver;
	
	public HomePage(WebDriver Driver) {
		this.Driver = Driver;
	}
	


	By SignIn = By.linkText("Sign In");
	By CreateAccount = By.linkText("Create an Account");
	By Search =By.id("search");
	
	
	public void ClickSignIn() {
		Driver.findElement(SignIn).click();
	}
	
	
	public void ClickCreateAccount() {
		Driver.findElement(CreateAccount).click();
	}
	
	public boolean IsDisplayingSearchField() {
		return Driver.findElement(Search).isDisplayed();
	}
	
	
	
	
	
	
	
}
