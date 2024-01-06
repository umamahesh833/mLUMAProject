package TestModules;

import org.testng.annotations.Test;

import Utility.ApplicationMethods;

public class HomePageTests {
	
	@Test
	public void TstHomePageValidation01() throws Exception {
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnLoginToApp();
		ObjAppMeth.fnValidateTitle();
		ObjAppMeth.fnValidateSearchField();
		ObjAppMeth.fnCloseApp();
	}
	
	@Test
	public void TstCreateanAccount02() {
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnCreateanAccount();
		ObjAppMeth.fnCloseApp();
	}

	@Test
	public void TstValidateSignin03() throws Exception {
		ApplicationMethods ObjAppMeth = new ApplicationMethods();
		ObjAppMeth.fnLaunchApp();
		ObjAppMeth.fnLoginToApp();
		ObjAppMeth.fnCloseApp();
	}
	
	

				
	
	


}
