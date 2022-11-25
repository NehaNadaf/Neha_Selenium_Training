package Dayclass_3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class firstTestNgTest3 {

//	@Test(dependsOnMethods= "logOutFromApplication")

	@Test
    public void login()
	{
		Assert.assertTrue(false);
    	System.out.println("Login done");
    	Reporter.log("Login Done",true);
    }


	 @Test(dependsOnMethods = "login")
    public void logOutFromApplication() {
        System.out.println("logout");
    }
}

