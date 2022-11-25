package Dayclass_3;

import org.testng.annotations.Test;

public class FirstTestNG
{
	@Test(priority=1)
    public void login()
	{
    	System.out.println("Login done");
    }
	@Test
    public void CreateAccount()
	{
    	System.out.println("Account Created");
    }
	@Test
    public void logout()
	{
    	System.out.println("Successful logout");
    }
}
