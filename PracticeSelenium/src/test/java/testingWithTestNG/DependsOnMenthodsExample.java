package testingWithTestNG;

import org.testng.annotations.Test;

public class DependsOnMenthodsExample {

	// to open fb in google

	@Test (enabled = false, priority = 1)
	public void opengooglebrowser() {
		System.out.println("open google browser");	
	}

	@Test (dependsOnMethods = "opengooglebrowser" , priority = 2)
	public void openfacebook() {
		System.out.println("open facebook page");	
	}

	@Test(dependsOnMethods = "openfacebook" , priority = 3 )
	public void loginwithcredentials() {
		System.out.println("login with email id and passowrd");	
	}

}
