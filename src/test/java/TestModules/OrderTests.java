package TestModules;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
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
		//Getting data from COnfig.Properties file
		String localDir = System.getProperty("user.dir");
		
		Properties ObjProp = new Properties();
		InputStream input = new FileInputStream(localDir+"\\config.properties");
		ObjProp.load(input);
		String username = ObjProp.getProperty("Username");
		String pwd = ObjProp.getProperty("Password");

		System.out.println(username);
		
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnLoginToApp(username, pwd);
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
	
	@Test
	public void TstValidatePrice() throws Exception {
		
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnLoginToApp();
		ObjAppMeth.fnNavigateToOrdersPage();
		ObjAppMeth.fnCloseApp();
		
	}
	
	

}
