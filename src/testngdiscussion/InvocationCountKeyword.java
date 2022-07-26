package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {
	
	@Test(invocationCount = 5, priority = 1)
	public void login()
	{
		System.out.println("Login to the application");
	}
	
	
	@Test(priority = -2000)
	public void home()
	{
		System.out.println("Home page of application");
	}
	
	@Test(priority = 4)
	public void dashBoard()
	{
		System.out.println("Dashboard of application");
	}
	
	
//	Write a script with different testcases- Login, navigatetoadmin tab, checkbox test

}
