package TestModules;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.ApplicationMethods;

public class OrderTests {
	
	//Test PUsh from Orders class
	@Test
	public void TstOrderNumberValidation() throws Exception {
		
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnLoginToApp();
		ObjAppMeth.fnNavigateToOrdersPage();
		ObjAppMeth.fnValidateOrder();
		ObjAppMeth.fnCloseApp();
		
	}
	
	@Test
	public void TstViewOrder() throws Exception {
		
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnLoginToApp();
		ObjAppMeth.fnNavigateToOrdersPage();
		ObjAppMeth.fnCloseApp();
		
	}
	
	

}
