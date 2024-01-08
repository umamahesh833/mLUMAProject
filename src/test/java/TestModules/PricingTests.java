package TestModules;

import org.testng.annotations.Test;

import Utility.ApplicationMethods;

public class PricingTests {
	@Test
	public void TstPricingrValidation() throws Exception {
		
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnLoginToApp();
		ObjAppMeth.fnNavigateToOrdersPage();
		ObjAppMeth.fnValidateOrder();
		ObjAppMeth.fnCloseApp();
		
	}
}
