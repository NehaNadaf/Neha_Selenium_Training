package Report;

import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertionDemo {
	@Test
	public void login() {
		Assert.assertTrue(true);
		System.out.println("Login");
		//Reporter.log
	}
	//    @Test
	//    public void createAccount() {
	//        System.out.println("Created Account");
	//    }
	//    @Test
	//    public void deleteAccount() {
	//        System.out.println("Deleted Account");
	//    }
	@Test(dependsOnMethods="login")
	public void logOutApplication() {

		System.out.println("LogOut Done");
	}
}
